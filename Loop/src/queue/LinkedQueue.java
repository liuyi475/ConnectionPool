/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import exception.EmptyCollectionException;
import linkedStack.LinearNode;

/**
 *
 * @author yixua
 */
public class LinkedQueue<T> implements Queue<T>{
    
    private int count;
    private LinearNode<T> front, rear;

    public LinkedQueue() {
        count = 0;
        front = rear = null;
    }
    
    @Override
    public void enqueue(T element) {
        LinearNode node = new LinearNode<T>(element);
        if(isEmpty()){
            front = node;
            count++;
        }else{
            rear.setNext(node);
        }
        rear = node;
        count++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException{
       if(isEmpty()){
           throw new EmptyCollectionException("queue is empty");
       }else{
           T result = front.getElement();
           front = front.getNext();
           count--;
           return result;
       }
    }

    @Override
    public T first() throws EmptyCollectionException{
        if(isEmpty()){
           throw new EmptyCollectionException("queue is empty");
       }else{
           T result = front.getElement();
           return result;
       }
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
    
    
}
