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
public class BinarySearch {
    public static void main(String[] args) {
        int target = 70;
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100,110};
        int min = 0, max = a.length-1;
        while(min<=max){
            int middle = (min+max)/2;
            System.out.println("Middle: "+middle);
            if(target==a[middle]){
                System.out.println("Found it!");
                System.exit(0);
            }
            if(a[middle]<target){
                min=middle+1;
            }else{
                max=middle-1;
            }
        }
        System.err.println("cannot find");
    }
}
