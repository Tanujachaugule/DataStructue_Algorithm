package com.algorithm;

public class MergeSort {
    static public void main(String[] args) {
        int[] A = { 2, 3, 8, -1, 7, 10 };
        int n = A.length;
        mergeTwoHalf(A, n);
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
        System.out.println();
    }
    static void mergeTwoHalf(int[] A, int n) {
        int half_i = 0;
        int i;
        int[] temp = new int[n];
        for (i = 0; i < n - 1; i++) {
            if (A[i] > A[i + 1]) {
                half_i = i + 1;
                break;
            }
        }
        if (half_i == 0)
            return;
        i = 0;
        int j = half_i;
        int k = 0;
        while (i < half_i && j < n) {
            if (A[i] < A[j])
                temp[k++] = A[i++];
            else
                temp[k++] = A[j++];
        }
        while (i < half_i)
            temp[k++] = A[i++];
        while (j < n)
            temp[k++] = A[j++];
        for (i = 0; i < n; i++)
            A[i] = temp[i];
    }
}