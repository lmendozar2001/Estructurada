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
public class Nodes<T> {
    public T data;
    public Nodes<T> next;
    
    public Nodes (T data){
        this.data = data;
    }
    
    public Nodes (Nodes<T> next){
        this.next = next;
    }
    
    public Nodes (T key, Nodes head){
        this.data = key;
        this.next = head; 
    }
    
    
}
