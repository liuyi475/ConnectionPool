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
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i =1; i<= 100; i++){
            if(i%3!=0) continue;
            if(i%5!=0) continue;
            System.out.println(i);
        }
    }
    
}
