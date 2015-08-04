package com.vini.alg;

public class MergeSort {

	public static void main(String[] args) {
		int[] S = {6, 13, 2, 47, 91, 5, 8, 64};
		print(S);
		int[] R = mergeSort(S, 0, S.length);
		print(R);

	}
	
	public static int[] mergeSort(int[] ary, int lo, int hi) {
		if (hi - lo < 2) 
			return new int[]{ary[lo]};
		
		int mi = (hi + lo) / 2;
		int[] left = mergeSort(ary, lo, mi);
		int[] right = mergeSort(ary, mi, hi);
		return merge(left, right, lo, mi, hi);
	}
	
	private static int[] merge(int[] B, int[] C, int lo, int mi, int hi) {		
		int[] A = new int[(hi-lo)];
		int lb = B.length;
		int lc = C.length;
		
		for (int i = 0, j = 0, k = 0; ( j < lb ) || ( k < lc ); ) {
			if ( ( j < lb ) && ( ( lc <= k ) || ( B[j] <= C[k] ) ) ) 
				A[i++] = B[j++];
			
			if ( ( k < lc ) && ( ( lb <= j ) || ( C[k] <  B[j] ) ) ) 
				A[i++] = C[k++];
			
		}
		return A;
	}
	
	private static void print(int[] ary) {
		for (int i=0; i<ary.length; i++)
			System.out.print(ary[i]+",");
		System.out.println();
	}
}
