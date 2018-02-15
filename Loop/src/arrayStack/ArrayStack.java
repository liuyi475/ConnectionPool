/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayStack;

import java.util.NoSuchElementException;

/**
 *
 * @author yixua
 */
public class ArrayStack<T> implements Stack<T>{
    private final int DEFAULT_CAPACITY = 10;
    private int count;
    private T[] stack;

    public ArrayStack() {
        count = 0;
        stack = (T[])(new Object[DEFAULT_CAPACITY]);
    }
    
    
    @Override
    public void push(T element) {
        if(count == stack.length){
            expandCapacity();
        }
        stack[count] = element;
        count++;
    }
    
    private void expandCapacity(){
        T[] larger = (T[])(new Object[stack.length*2]);
        for (int index = 0; index < stack.length; index++) {
            larger[index] = stack[index];
        }
        stack = larger;
    }
    
    @Override
    public T pop() throws NoSuchElementException{
        if(!isEmpty()){
            count--;
            T element = stack[count];
            stack[count] = null;
           return element;
        }else{
            throw new NoSuchElementException();
        }
        
    }

    @Override
    public T peek() throws NoSuchElementException{
        if(!isEmpty()){
            return stack[count];
        }else{
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return this.count;
    }
    
    public String toString(){
        String result = "<top of stack>\n";
        for (int index=count-1; index >= 0; index--) 
        result += stack[index] + "\n";
        return result + "<bottom of stack>";
    }
}
