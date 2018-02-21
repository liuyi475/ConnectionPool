/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

import linkedStack.LinearNode;


/**
 *
 * @author yixua
 */
public class LinkedList<T> {
    private LinearNode first;
    private int count;

    public LinkedList() {
        first = null;
        count = 0;
    }
    
    public boolean isEmpty(){
        return count==0;
    }
    
    public int getSize(){
        return count;
    }
    
    public void addFirst(T element){
        LinearNode newNode  = new LinearNode(element);
        newNode.setNext(first);
        first = newNode;
        count++;
    }
    
    public void addLast(T element){
        LinearNode newNode = new LinearNode(element);
        LinearNode current = first;
        while(current.getNext()!= null){
            current = current.getNext();
        }
        current.setNext(newNode);
        count++;
    }
    
    public void addAtLocation(T element, int index){
        LinearNode node = new LinearNode(element);
        LinearNode targetPreNode = getNode(index-1);
        node.setNext(targetPreNode.getNext());
        targetPreNode.setNext(node);
        count++;
    }
    
    public LinearNode getNode(int index){
        if(index < 0){
            throw new IndexOutOfBoundsException("negative index");
        }else{
            LinearNode current = first;
            while(current.getNext() != null && index > 0){
                current = current.getNext();
                index--;
            }
            if(current == null){
                throw new IndexOutOfBoundsException("index too large");
            }
            return current;
        }
    }
    
    public void removeByIndex(int index){
        LinearNode target = getNode(index);
        if(index==0){
            first = first.getNext();
            return;
        }
        LinearNode prvNode = getNode(index-1);
        prvNode.setNext(target.getNext());
        count--;
    }
    
    public String toString(){
        StringBuilder builder = new StringBuilder();
        LinearNode node = this.first;
        while(node!=null){
            builder.append(node.getElement());
            builder.append("-");
            node = node.getNext();
        }
        return builder.toString();
    }
}
