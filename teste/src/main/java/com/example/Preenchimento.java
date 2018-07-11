package com.example;
import java.util.Scanner;

public class Preenchimento {

public static void main(String[] args) {
// TODO Auto-generated method stub
		int w =5;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int [] array = new int [w];
				
		for (int i=0; i<array.length; i++)
			{
			array[i]= input.nextInt();
		}
	System.out.println("The average of the array numbers is: " + Funcao.average(array));
	System.out.println("The maximum of the array numbers is: " + Funcao.maximum(array));
	System.out.println("The minumum of the array numbers is: " + Funcao.minimum(array));			
	}

}


