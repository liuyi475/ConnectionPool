/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/**
 *
 * @author yixua
 */
public class AHundredChicken {
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 33; j++) {
                for (int k = 0; k < 100; k+=3) {
                    if(i+j+k==100&&(i*5+j*3+i/3==100)){
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }
        }
    }
    
}
