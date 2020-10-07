/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Keynes Stephens Watson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArray<Integer> ar = new MyArray<>();
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedStack<String> lss = new LinkedStack<>();
        ArrayStack<Integer> ls = new ArrayStack<>(100);
        
        ar.add(21);
        ar.add(22);
        ar.add(23);
        ar.add(24);
        ar.add(25);
    
        System.out.println(" "+ar.remove(0));
        
        System.out.println(ar.size());
        
        
        
        
        
        
        
    }
    
}
