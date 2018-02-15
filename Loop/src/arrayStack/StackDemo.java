/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayStack;

import arrayStack.ArrayStack;

/**
 *
 * @author yixua
 */
public class StackDemo {
    public static void main(String[] args) {
        
        ArrayStack<String> arrayStack = new ArrayStack<>();
        arrayStack.push("aaa");
        arrayStack.push("bbb");
        arrayStack.push("ccc");
        System.out.println(arrayStack.toString());
//        System.out.println(arrayStack.size());
        
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.toString());
        
        arrayStack.push("sss");
        System.out.println(arrayStack.toString());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.toString());
    }
}
