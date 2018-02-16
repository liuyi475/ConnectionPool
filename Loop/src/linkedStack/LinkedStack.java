/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedStack;

import arrayStack.Stack;
import exception.EmptyCollectionException;

/**
 *
 * @author yixua
 */
public class LinkedStack<T> implements Stack<T>{
    private int count;
    private LinearNode<T> top;

    public LinkedStack() {
        count = 0;
        top = null;
    }

    @Override
    public void push(T element){
        LinearNode<T> newNode = new LinearNode<>();
        newNode.setElement(element);
        newNode.setNext(top);
        top = newNode;
        count++;
    }

    @Override
    public T pop() throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("Collecton is Empty");
        }else{
            T result = top.getElement();
            top = top.getNext();
            count--;
            return result;
        }
    }

    @Override
    public T peek() {
        return top.getElement();
    }

    @Override
    public boolean isEmpty() {
        return count==0;
    }

    @Override
    public int size() {
        return count;
    }
    
    public String toString() {
        String result = "<top of stack>\n";
        LinearNode current = top;
        while(current != null){
            result += current.getElement()+"\n";
            current = current.getNext();
        }
        return result + "<bottom of stack>";
    }
}
