package com.net.programs;

public class StringFrequency {

	public static void main(String[] args) {

		 String str = "picture perfect";    
		 char[] ch=str.toCharArray();
		 int count=0;
		 for(int i=0;i<str.length();i++) {
			 count=1;
			 for(int j=i+1;j<str.length();j++) {
				 if(ch[i]==ch[j]) {
					 count++;
					 ch[j]='0';
				 }
			 }
			 if(ch[i]!='0' && ch[i]!=' ')
			 System.out.println(ch[i]+" "+count);
		 }
	}

}
