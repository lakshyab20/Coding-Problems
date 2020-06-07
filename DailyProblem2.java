/*Given an array of integers, return a new array such that each element
   at index i of the new array is the product of all the numbers in the original array except the one at i.*/

import java.util.*;
import java.io.*;

class DailyProblem2
{
	public static void main(String args[])
	{
		int product=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int intArr[]=new int[n];
		System.out.println("Enter the integers in array: ");
		for(int i=0;i<n;i++){
			intArr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++){
			product*=intArr[j];
		}
		int product1=product;
		int a;
		for(int k=0;k<n;k++){
			a=product/intArr[k];
			intArr[k]=a;
			a=product;
			System.out.println(intArr[k]);
		}
	}
}
