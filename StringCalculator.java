package com.kata;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	//simple String calculator with a method int Add(string numbers)
		
		public int add(String numbers)
		{
			int result =0;
			if(numbers.isEmpty())
			{
				result=0;
			}
			else
			{
				int sum=0;
				String[] strings = numbers.replace("\n", ",").replace(",", "").split("");
				int[] str = new int[strings.length];
				for (int i = 0; i < str.length; i++)
				{
				  str[i] = Integer.parseInt(strings[i]);
				  System.out.println(str[i]);
				  sum=sum+str[i];
				}
				result=sum;
			}
			return result;
				
		}
	
	public static void main(String[] args) {
		String input =",\n1,23";
		StringCalculator s= new StringCalculator();
		Pattern p = Pattern.compile(",\n"); 
	    Matcher m = p.matcher(input);
	    if(m.find())
	    {
	    	System.out.println("Input is not ok!");
	    }else{
	    	
	    int sum=s.add(input);
		System.out.println("Sum>>>>>"+sum);
	    }
	}

}
