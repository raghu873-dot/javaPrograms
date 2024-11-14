package com.net.Important;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8ArrayPrograms {

	public static void main(String[] args) {
		int[] numbers = {3, 2, 1, 4, 5};
		
		String[] array1 = {"Java", "Python", "C++"};
        String[] array2 = {"Ruby", "JavaScript", "Go"};
        
        Integer[] array3 = {1, 2, 3, 4, 5};
        Integer[] array4 = {4, 5, 6, 7, 8};
        
        int [] array5 = {1, 2, 3, 4, 5};
        int [] array6 = {4, 5, 6, 7, 8};
		
		 int sum=Arrays.stream(numbers).sum();
		 System.out.println("sum of arrays"+" "+sum);
		 
		 int max=Arrays.stream(numbers).max().orElseThrow(null);
		 System.out.println("maximum number from array is"+" "+max);
		 
		 int [] evenNum=Arrays.stream(numbers).filter(n->n%2==0).toArray();
		 System.out.println("even numbers from array is"+" "+Arrays.toString(evenNum));
		 
		 String [] mergeArray=Stream.concat(Arrays.stream(array1),Arrays.stream(array2)).toArray(String[]::new);
		 System.out.println("Merging Two Arrays into One"+" "+Arrays.toString(mergeArray));
		 
		 List<Integer> commonElements=Arrays.stream(array3).filter(Arrays.asList(array4)::contains).collect(Collectors.toList());
		 System.out.println("Finding Common Elements Between Two Arrays"+" "+commonElements);
		 
		 List<Integer> removeDuplicates=Stream.concat(Arrays.stream(array3),Arrays.stream(array4)).distinct().collect(Collectors.toList());
		 System.out.println("Combining Two Arrays and Removing Duplicates"+" "+removeDuplicates);
		 
		 int[] result = IntStream.concat(Arrays.stream(array5),Arrays.stream(array6)).toArray();
		 
		 Stream.concat(Arrays.stream(array1),Arrays.stream(array2)).toArray(String[]::new);
		 
	}

}
