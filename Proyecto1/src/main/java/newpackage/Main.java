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
        MyArray<String> ar = new MyArray<String>();
        LinkedList<Integer> ls = new LinkedList<>();
        
        ls.addback(2);
        ls.addback(4);
        ls.addfront(7);
        ls.addfront(73);
       
        
        
        System.out.println(ls.frontEle());
        System.out.println(ls.backEle());
        
        System.out.println(ls.findKey(73));
        System.out.println(ls.size());
        
        ls.printList();
        
        
        
        
    }
    
}
