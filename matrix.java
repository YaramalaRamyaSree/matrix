package matrix_Using_Arrays;

import java.util.*;

public class Matrix {
	
	private static Scanner input;
	
	public static void inputMatrix(int[][] x,int n) {
		
		input = new Scanner(System.in);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				x[i][j] = input.nextInt();
		}
	}
	
	public static void addMatrix(int[][] x,int[][] y,int n) {
		
		System.out.println("Adding two matrices provides");
		int c[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) 
				c [i][j] = x[i][j]+y[i][j];
			
		}
		
		printMatrix(c,n);
	}
	
	public static void multiplyMatrix(int[][] x,int[][] y,int n) {
		
		System.out.println("Multiplying two matrices provides");
		int c[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				c[i][j] = 0;
	            for (int k = 0; k < n; k++)
	                c[i][j] += x[i][k] * y[k][j];
			}
				
		}
		
		printMatrix(c,n);
		
	}
	
	public static void printMatrix(int[][] x,int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) 
				System.out.format("%4d",x[i][j]);
				
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.print("Input value of n for square matrix : ");
		int n = input.nextInt();
		
		int [][]a = new int[n][n];
		int [][]b = new int[n][n];
		System.out.println("Input numbers for first array ");
		inputMatrix(a,n);
		System.out.println("Input numbers for second array ");
		inputMatrix(b,n);
		addMatrix(a,b,n);
		multiplyMatrix(a,b,n);

	}

}
