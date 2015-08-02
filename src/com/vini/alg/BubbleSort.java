package com.vini.alg;

public class BubbleSort {

	public static void main(String[] args) {
		int[] A = {2,5,30,11,-5};
		print(A);
		int[] R = bubbleSort(A);
		print(R);
	}

	/* bubble sort*/
	public static int[] bubbleSort(int[] ary) {
		boolean sorted = false;
		int n = ary.length-1;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < n; i++) { 
				if (ary[i] > ary[i+1]) {//ascending
					swap(ary, i, i+1);
					sorted = false;
				}
			}
			n--;
		}
		return ary;
	}

	private static void swap(int[] ary, int i, int j) {
		int temp = ary[j];
		ary[j] = ary[i];
		ary[i] = temp;
	}
	
	private static void print(int[] ary) {
		for (int i=0; i<ary.length; i++)
			System.out.print(ary[i]+",");
		System.out.println();
	}
}
