
package com.calculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author allmathsymbols.com
 *	Calculate consecutive integers based on the sum.
 */
public class ConsecutiveIntegers {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Please input the sum:");
		BufferedReader in1=new BufferedReader(new InputStreamReader(System.in));
		String sum=in1.readLine();
		
		System.out.println("Please input the number of consecutive integers:");
		in1=new BufferedReader(new InputStreamReader(System.in));
		String num=in1.readLine();
		
		System.out.println(findConsecutiveIntegers(Integer.parseInt(sum),Integer.parseInt(num)));
		System.out.println(findConsecutiveOddIntegers(Integer.parseInt(sum),Integer.parseInt(num)));
		System.out.println(findConsecutiveEvenIntegers(Integer.parseInt(sum),Integer.parseInt(num)));
	}
	
	/**
	 * Find consecutive integers, the first integer is 
	 * 
	 * S / M – (M – 1) / 2
	 * 
	 * The formula is derived from	https://allmathsymbols.com/consecutive-integers-calculator/
	 * @param sum
	 * @param num
	 * @return
	 */
	public static String findConsecutiveIntegers(int sum,int num) {
		
		float tempFirst = (float)sum/num - (float)(num - 1)/2;
		int first = Math.round(tempFirst);
		
		int tempSum = first;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(first);
		
		for(int i = 1; i < num; i++) {
			int nextInteger = first + i;
			tempSum += nextInteger;
			integerList.add(nextInteger);
		}
		
		if(tempSum == sum) {
			return "The sum of "+num+" consecutive integers is "+sum+", the integers are "+integerList.toString();
		}else {
			return "Sorry, no suitable consecutive integers were found.";
		}
	}
	
	/**
	 * Find consecutive odd integers, the first odd integer is 
	 * 
	 * S / M – M + 1
	 * 
	 * The formula is derived from	https://allmathsymbols.com/consecutive-integers-calculator/
	 * @param sum
	 * @param num
	 * @return
	 */
	public static String findConsecutiveOddIntegers(int sum,int num) {
		float tempFirst = (float)sum/num - num + 1 ;
		int first = Math.round(tempFirst);
		
		if(first % 2 == 1 || first % 2 == -1){
			int tempSum = first;
			List<Integer> integerList = new ArrayList<Integer>();
			integerList.add(first);
			
			for(int i = 1; i < num; i++) {
				int nextInteger = first + i * 2;
				tempSum += nextInteger;
				integerList.add(nextInteger);
			}
			
			if(tempSum == sum) {
				return "The sum of "+num+" consecutive odd integers is "+sum+", the integers are "+integerList.toString();
			}else {
				return "Sorry, no suitable consecutive odd integers were found.";
			}
			
		}else {
			return "Sorry, no suitable consecutive odd integers were found.";
		}
	}
	
	/**
	 * Find consecutive even integers, the first even integer is 
	 * 
	 * S / M – M + 1
	 * 
	 * The formula is derived from	https://allmathsymbols.com/consecutive-integers-calculator/
	 * @param sum
	 * @param num
	 * @return
	 */
	public static String findConsecutiveEvenIntegers(int sum,int num) {
		float tempFirst = (float)sum/num - num + 1 ;
		int first = Math.round(tempFirst);
		
		if(first % 2 == 0){
			int tempSum = first;
			List<Integer> integerList = new ArrayList<Integer>();
			integerList.add(first);
			
			for(int i = 1; i < num; i++) {
				int nextInteger = first + i * 2;
				tempSum += nextInteger;
				integerList.add(nextInteger);
			}
			
			if(tempSum == sum) {
				return "The sum of "+num+" consecutive even integers is "+sum+", the integers are "+integerList.toString();
			}else {
				return "Sorry, no suitable consecutive even integers were found.";
			}
			
		}else {
			return "Sorry, no suitable consecutive even integers were found.";
		}
	}

}
