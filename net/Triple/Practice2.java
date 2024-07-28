package com.net.Triple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practice2 {

	public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("123", "sec"));
        members.add(new Member("123", "primem"));
        members.add(new Member("124", "primem"));
        members.add(new Member("124", "sec"));
        members.add(new Member("123", "primem"));
        members.add(new Member("125", "sec"));

        // Sorting
        members.sort(Comparator.comparing(Member::getPrincipalIdNo)
                .thenComparing((Member m) -> !m.getMemberType().equals("primem")));

        // Printing sorted list
        for (Member member : members) {
            System.out.println(member);
        }
    }
	
	final class mem{
		public void m() {
			System.out.println("mhjabn");
		}
	}
	public static String longestCommonPrefix(String[] strs) {
	    if (strs.length == 0) return "";
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++)
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) return "";
	        }        
	    return prefix;
	}
	
}
