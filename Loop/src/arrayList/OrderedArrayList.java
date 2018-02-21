/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;

/**
 *
 * @author yixua
 */
public class OrderedArrayList<T> extends ArrayList<T> implements OrderedListADT<T>{
    
    public OrderedArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public void add(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
