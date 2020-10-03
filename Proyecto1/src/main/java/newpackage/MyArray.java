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
public class MyArray<T>{
    private T[] ele;
    private int size;
    private int capacity;

    public MyArray() {
        size = 0;
        capacity = 10;
        ele = (T[]) new Object[capacity];
    }

    public MyArray(int capacity) {
        ele = (T[]) new Object[capacity];
    }

    
    
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public int size(){
        return size;
    }
    
    
    
    
    public T get (int in){
        checkIndex(in);
        return ele[in];
    }
    
    public T remove(int in){
        checkIndex(in);
        T removeelement = ele[in];
        for (int j = in+1; j < size; j++) {
            ele[j-1] = ele[j];
        }
        ele[--size]=null;
        return removeelement;
    }
    
    public int indexOf(T element){
        for (int i = 0; i < size; i++) {
            if(ele[i].equals(element)){
               return i; 
            }
        }
        return -1;
    }
    
    public void add(T val){
        
        if (size==capacity){
        capacity = capacity*2;
        T[] new_arr ;     
        new_arr = (T[]) new Object[capacity];
        
        for (int j=size-1;j>=0;j--){
                new_arr[j]= ele[j];
            }
            ele=new_arr;
        }
    
        set(val,size);
        size++;  
    }
    
    private void set( T ele,int in){
        this.ele[in]=ele;
    }
    
    private void checkIndex(int i){
        if (i<0 || i>=size){   
            System.out.println("Index "+i+" out of bounds.");
        }
    }
    
}
