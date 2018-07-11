package com.example;

public class Funcao {
	

	public static double average(int[] a){
		double avg = 0;
		for (int i=0; i<a.length ;i++)
		{
		avg= avg+a[i];	
		}
		return avg/a.length;
	}
	public static int maximum (int[] a){
		int max = 0;
		for (int i=0; i<a.length ;i++)
		{
		if (a[i]>max)
			max = a[i];
		else
			continue;
		}
		return max;
	}
	public static int minimum (int[] b){
		int min = 10000000;
		for (int i=0; i<b.length ;i++)
		{
		if (b[i]<min)
			min = b[i];
		else
			continue;
		}
		return min;
	}
}
