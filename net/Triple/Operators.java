package com.net.Triple;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    long po=0;
    long ne=0;
    long ze=0;
           List<Long> li=new ArrayList<>();
           for(Integer i:arr)  {
               if(i>0){
                po++;   
               }
               else if(i<0){
                   ne++;
               }else{
                   ze++;
               }
           }
           
          li.add(0,po/arr.size());
           li.add(1,ne/arr.size());
           li.add(2,ze/arr.size());
           
           for(Long k:li)  {
               System.out.println(k);
           }
    }

}

public class Operators {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

       int [] arrTemp=new int[] {-4,3,-9,0,4,1};

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = arrTemp[i];
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
