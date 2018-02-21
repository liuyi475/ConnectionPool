/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author yixua
 */
public class ArrayList<T> implements ListADT<T>{
    private final static int DEFAULT_CAPACITY = 100;
    private final static int NOT_FOUND = -1;
    
    protected int rear;
    protected T[] list;
    protected int modCount;

    public ArrayList(int initialCapacity) {
        rear = 0;
        list = (T[])(new Object[initialCapacity]);
        modCount = 0;
    }
    
    @Override
    public T removeFirst() {
       if(!isEmpty()){
           T result = list[0];
           
           for (int i = 0; i < rear; i++) {
               list[i] = list[i+1];
           }
           rear--;
           return result;
       }else{
           throw new NoSuchElementException("No such an element");
       }
    }

    @Override
    public T removeLast() {
        if(!isEmpty()){
           T result = list[rear];
           list[rear] = null;
           rear--;
           return result;
       }else{
           throw new NoSuchElementException("No such an element");
       }
    }

    //////////////////////////////////////////////////////
    @Override
    public T remove(T element) {
        T result;
        int index = find(element);
        if(index == NOT_FOUND){
            throw new NoSuchElementException("No such an element");
        }
        result = list[index];
        rear --;
        
        for (int i = index; i < rear; i++) {
            list[index] = list[index+1];
        }
        
        list[rear] = null;
        modCount++;
        return result;
    }

    @Override
    public T first() {
         if(!isEmpty()){
            T result = list[0];
            return result;
        }else{
            throw new NoSuchElementException("No such an element");
        }
    }

    @Override
    public T last() {
        if(!isEmpty()){
            T result = list[rear];
            return result;
        }else{
            throw new NoSuchElementException("No such an element");
        }
    }

    @Override
    public boolean contains(T target) {
        return find(target) == NOT_FOUND;
    }

    @Override
    public boolean isEmpty() {
        return rear == 0;
    }

    @Override
    public int size() {
        return rear;
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int find(T element) {
        int result = NOT_FOUND;
        if(!isEmpty()){
            for (int i = 0; i < rear; i++) {
                if(list[i].equals(element)){
                    result = i;
                    return result;
                }
            }
        }
        return result;
    }
    
}
