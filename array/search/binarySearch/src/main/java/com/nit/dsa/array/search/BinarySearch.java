package com.nit.dsa.array.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {4, 22, 34,};
        int[] arr1 = {4, 22, 34,45,66,78,99,100,111};
        int[] arr2 = {4, 22, 34,45,66,78,99,100,111};
        int[] arr3 = {4, 22, 34,45,66,78,99,100,111};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 34));
        System.out.println(binarySearch(arr1, 0, arr1.length - 1, 34));
        System.out.println(binarySearch(arr2, 0, arr2.length - 1, 111));
        System.out.println(binarySearch(arr3, 0, arr3.length - 1, 664));
        System.out.println(binarySearch(arr3, 0, arr3.length - 1, -1));


    }

    private static boolean binarySearch(int[] arr, int low, int high, int n) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            int midA = arr[mid];
            if (midA == n) return true;

            if (n > arr[mid]) {
                return binarySearch(arr, mid + 1, high, n);
            }
            return binarySearch(arr, low, mid - 1, n);
        }
        return false;
    }
}
