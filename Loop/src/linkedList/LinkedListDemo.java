/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

/**
 *
 * @author yixua
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("a");
        linkedList.addFirst("b");
        linkedList.addLast("c");
        linkedList.addAtLocation("d", 2);
        linkedList.addAtLocation("e", 8);
        linkedList.removeByIndex(4);
        linkedList.removeByIndex(5);
        System.out.println(linkedList.toString());
    }
}
