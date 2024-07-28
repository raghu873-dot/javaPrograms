package com.net.Triple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Practice {

	public static void main(String[] args) {
       
		List<String> list=Arrays.asList("raghu","loki","ratan","naveen","mantya");
		
		List<String> upperCase=list.stream().map(String::toUpperCase).collect(Collectors.toList());
		upperCase.forEach(System.out::println);		
		
		List<Integer> listInt=Arrays.asList(20,3,10,9,40,3,40);
		List<Integer> listIntRes=listInt.stream().filter(x->x%2==0).collect(Collectors.toList());
		listIntRes.forEach(System.out::println);
		
		List<String> listAscOrder=list.stream().sorted().collect(Collectors.toList());
		listAscOrder.forEach(System.out::println);
		
		List<String> listDscOrder=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		listDscOrder.forEach(System.out::println);
		
		Optional<Integer> minNumber=listInt.stream().min((i1,i2)->i1.compareTo(i2));
		Optional<Integer> minNumber1=listInt.stream().min(Integer::compareTo);
		System.out.println(minNumber.get());
		System.out.println(minNumber1.get());
		
		Optional<Integer> maxNumber=listInt.stream().max((i1,i2) -> i1.compareTo(i2));
		System.out.println(maxNumber.get());
		
		Integer reduceCombinedList=listInt.stream().reduce((a,b) -> a+b).get();
		System.out.println(reduceCombinedList);
		
		String joiningList=list.stream().collect(Collectors.joining(", "));
		System.out.println(joiningList);
		
		Set<Integer> set=new HashSet<>();
		List<Integer> printDuplicateNum=listInt.stream().filter(x-> !set.add(x)).collect(Collectors.toList());
		System.out.println(printDuplicateNum);
		
	}

}
