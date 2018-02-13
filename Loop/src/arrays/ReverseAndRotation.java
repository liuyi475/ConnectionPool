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
public class ReverseAndRotation {
    public static void main(String[] args) {
        System.err.println(6%8);
        int[] b = {10,11,12,13,14,15};
        rotate(b, 1);
    }
    public static void reverse(int[] a){
        reverse(a,0,a.length);
    }
    public static void reverse(int[] a, int left, int right){
        int low = left;
        int high = right - 1;
        while(low<high){
            int t = a[low]; a[low] = a[high]; a[high] = t;
            low++;
            high--;
        }
    }
    public static void rotate(int[] a, int k){
        k = k%a.length;
        reverse(a,a.length-k,a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        
        reverse(a,0,a.length-k);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        reverse(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
