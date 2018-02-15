/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author yixua
 */
public class SelectionSort {
    public static void main(String[] args) {
        
    }
    public static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void sort(int[] a){
        sort(a, 0, a.length);
    }
    public static void sort(int[] a, int left, int right){
        if(left>=right) return;
        swap(a, left, minPosition(a, left, right));
        sort(a, left+1, right);
    }
    //or this sort method
    public static void sort1(int[] a, int left, int right){
        while(left<right){
            swap(a, left, minPosition(a, left, right));
            left++;
        }
    }
    public static int minPosition(int[] a, int left, int right){
        int result = left;
        int minValue = a[left];
        for(int i = left+1; i<right; i++){
            if(a[i]<minValue){
                result = i;
                minValue = a[i];
            }
        }
        return result;
    }
}
