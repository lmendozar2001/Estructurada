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
public class ArrayStack<T> implements Stacks<T> {
    private int top;
    private T[] st;
    private int size;
    
    
    public ArrayStack(int initialC){
        if (initialC<1){
            throw new IllegalArgumentException("initialCapacity must be >= 1");
        }
        this.st = (T[]) new Object[initialC];
        this.top = -1;
  
    }
    
    public ArrayStack(){
        this(10);
        this.size = 0;
        
    }
    
   
    
    
    public void push(T value) {
        int cap = 2*st.length;
        if(this.size==st.length-1){
            T[] olds = st; 
            st =  (T[]) new Object[cap];
            
            for (int i = 0; i < this.size-1; i++) {
                st[i] = olds[i];
            }
            olds = st;
        }
        
        st[++top] = value;
        size++;
    }

    
    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        T popEl = st[top];
        st[top--] = null;
        size--;
        return popEl;
    }

    
    public int size() {
       return size;
    }

    
    public T top() {
        if(isEmpty()){
            throw new EmptyStackException();
        }return st[top];
    }

    
    public boolean isEmpty() {
        return size==0;
    }
    
}
