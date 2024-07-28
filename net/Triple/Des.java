package com.net.Triple;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Des {
	private static Cipher encryptCipher;
	private static Cipher decryptCipher;
	private static byte[] iv = "a76nse64".getBytes();
	private static byte[] secretKey = "9msg65v8jf4kxn93nabf881m".getBytes();
	
	//private static SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey, "TripleDES");
	private static IvParameterSpec ivSpec = new IvParameterSpec(iv);

	public static void main(String[] args) {
		String clearTextFile = "C:/Raghavendra/des.txt";
		String cipherTextFile = "C:/Raghavendra/Cipher.txt";
		String clearTextNewFile = "C:/Raghavendra/Cipher-new.txt";

		try {
//			// create SecretKey using KeyGenerator
//			KeyGenerator keyGen = KeyGenerator.getInstance("DESede");
//			SecureRandom secRandom = new SecureRandom();
//			keyGen.init(secRandom);
			
		    SecretKey key = KeyGenerator.getInstance("DESede").generateKey();
//			AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);

			// get Cipher instance and initiate in encrypt mode
			encryptCipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
			encryptCipher.init(Cipher.ENCRYPT_MODE, key, ivSpec);

			// get Cipher instance and initiate in decrypt mode
			decryptCipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
			decryptCipher.init(Cipher.DECRYPT_MODE, key, ivSpec);

			// method to encrypt clear text file to encrypted file
			encrypt(new FileInputStream(clearTextFile), new FileOutputStream(cipherTextFile));

			// method to decrypt encrypted file to clear text file
			decrypt(new FileInputStream(cipherTextFile), new FileOutputStream(clearTextNewFile));
			System.out.println("DONE");
		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException
				| InvalidAlgorithmParameterException | IOException e) {
			e.printStackTrace();
		}

	}

	private static void encrypt(InputStream is, OutputStream os) throws IOException {

		// create CipherOutputStream to encrypt the data using encryptCipher
		os = new CipherOutputStream(os, encryptCipher);
		writeData(is, os);
	}

	private static void decrypt(InputStream is, OutputStream os) throws IOException {

		// create CipherOutputStream to decrypt the data using decryptCipher
		is = new CipherInputStream(is, decryptCipher);
		writeData(is, os);
	}

	// utility method to read data from input stream and write to output stream
	private static void writeData(InputStream is, OutputStream os) throws IOException {
		byte[] buf = new byte[1024];
		int numRead = 0;
		// read and write operation
		while ((numRead = is.read(buf)) >= 0) {
			os.write(buf, 0, numRead);
		}
		os.close();
		is.close();
	}

}