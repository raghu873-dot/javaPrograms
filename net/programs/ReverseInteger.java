package com.net.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseInteger {

	public static void main(String[] args) {
		
		String s="picture perfect";
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='0';
				}
			}
			
			if(ch[i]!='0' && ch[i]!=' ') {
				System.out.println(ch[i]+" "+count);
			}
		}
		
		
		
	}

}
