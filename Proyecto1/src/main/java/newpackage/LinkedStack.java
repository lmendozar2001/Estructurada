/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.EmptyStackException;

/**
 *
 * @author Keynes Stephens Watson
 */
public class LinkedStack<T> implements Stacks<T>{  
    private int size;
    private Nodes<T> top;
    
    public LinkedStack(){
        top = null;
    }
    
    public boolean isEmpty(){
        return this.top==null;
    }
    
    public void push(T value) {
        Nodes<T> newNode = new Nodes<T>(value);
        
        newNode.next = this.top;
        size++;
        this.top = newNode;
        
    }

    
    public T pop() {
       T popV;
       if(isEmpty( ))throw new EmptyStackException( );
       popV = this.top.data;
       this.top = this.top.next;
       size--;
       return popV;
       
    }

    
    public int size() {
        return size;
    }

    
    public T top() {
         if(isEmpty()){
             throw new EmptyStackException( );
         }
        return this.top.data;
    }
    
}
