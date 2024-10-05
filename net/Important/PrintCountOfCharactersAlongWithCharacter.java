package com.net.Important;

public class PrintCountOfCharactersAlongWithCharacter {

	public static void main(String[] args) {
		String s="aaabbbbcccc";
		
		char [] ch=s.toCharArray();
		int count=1;
		char key = 0;
		String result="";
		for(int i=1;i<s.length();i++) {
			key=ch[i];
			if(key==ch[i-1]){
				count++;
			}else {
				result=result+ch[i-1]+""+count;
				count=1;
			}
		}
		result=result+String.valueOf(key)+""+count;
		
		System.out.println(result);
	}

}
