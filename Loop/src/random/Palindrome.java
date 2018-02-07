/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 *
 * @author yixua
 */
public class Palindrome {
    public static boolean isPalindrome(String word) {
        String newWord = word.toLowerCase();
        for (int i = 0; i < newWord.length()/2; i++) {
            if(newWord.charAt(i)!=newWord.charAt(newWord.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
