package com.net.Important;

import java.util.Stack;

public class ValidParenthasis {

	public static void main(String[] args) {
		String str = "{[()]}";
		Boolean result=bracketsCheck(str);
		System.out.println(result);
	}

	private static Boolean bracketsCheck(String str) {
		
		Stack<Character> stack=new Stack<>();
		char [] ch=str.toCharArray();
		
		for(char c:ch) {
			
			switch(c) {
				case '(':
				case '{':
				case '[':
				stack.push(c);
				break;
				case ')':
				  if(stack.isEmpty() || stack.pop()!='(') {
					  return false;
				  }
				break;
				case '}':
				 if(stack.isEmpty() || stack.pop()!='{') {
					 return false;
				 }
				break;
				case ']':
				if(stack.isEmpty() || stack.pop()!='[')	{
					return false;
				}
				break;
			}
		}
		return true;
	}
}
