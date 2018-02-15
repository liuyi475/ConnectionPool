/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author yixua
 */
public class Exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String s = scan.next();
            System.out.println("the last two characters are: "+s.substring(2));
            int i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("number Format");
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("outofBound");
        }
    }
}
