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
        //MyArray<Integer> ar = new MyArray<>(11);
        //LinkedList<Integer> ll = new LinkedList<>();
        //LinkedStack<String> lss = new LinkedStack<>();
        //ArrayStack<Integer> ls = new ArrayStack<>(10);
        //ArrayQueue<Integer> aq = new ArrayQueue<>(20);
        LinkedQueue<Integer> aq = new LinkedQueue<Integer>();
        
        aq.enqueue(5);
        aq.enqueue(6);
        aq.enqueue(7);
        aq.enqueue(8);
        
        
        
        
        System.out.println(aq.peek());
        System.out.println(aq.size());
       
       
        
        
        
        
        
        
        
    }
    
}
