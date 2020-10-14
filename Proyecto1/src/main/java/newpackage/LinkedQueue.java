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
public class LinkedQueue<T> implements Queues<T> {
    private Nodes<T> front;
    private Nodes<T> rear;
    private int size;

    public LinkedQueue() {
        this.front = this.rear = null;
        this.size = 0;
    }
    
    
    
    public void enqueue(T value) {
        Nodes<T> node = new Nodes<T>(value);
        if(this.front==null){
           this.front = node;
           size++;
        }else{
             this.rear.next = node;
             size++;
        }
        this.rear = node;
    }

    
    public T dequeue() {
        if (isEmpty())throw new EmptyStackException( );
        
        T frontEl = this.front.data;
        this.front = this.front.next;
        size--;
        if(isEmpty())rear = null;
        
        return frontEl;
    }

    
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException( );
        }else{
            return this.front.data;
        }
    }

    
    public boolean isEmpty() {
        return front==null;
    }

    
    public int size() {
       return size;
    }
    
}
