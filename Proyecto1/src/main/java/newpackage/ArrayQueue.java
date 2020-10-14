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
public class ArrayQueue<T> implements Queues<T> {
    
    private int front;
    private int rear;
    private T[] queue;
    private int size;
    
    
    public ArrayQueue(int iniC) {
        if (iniC<1){
            throw new IllegalArgumentException("initialCapacity must be >= 1");
        }
        queue = (T[]) new Object[iniC];
        front = rear = 0;
        size = 0;
    }
    
    public ArrayQueue(){
        this(10);
    }
    
    
    public void enqueue(T value) {
    
        if((rear+1)%queue.length==front){
            T[] newQ = (T[]) new Object[2*queue.length];
            int st = (front+1)%queue.length;
            if(st<2){
               System.arraycopy(queue, st, newQ, 0, queue.length-1);
            }else{
                System.arraycopy(queue, st, newQ, 0, queue.length-st);
                System.arraycopy(queue, 0, newQ, queue.length-st, rear+1);
            }
            front = newQ.length-1;
            rear = queue.length-2;
            queue = newQ;
            
        }
        rear = (rear+1)%queue.length;
        queue[rear] = value;
        size++;
    }

    
    public T dequeue() {
        if(isEmpty()){
            throw new EmptyStackException( );
        }
        front = (front+1)%queue.length;
        T frontEl = queue[front];
        queue[front] = null;
        size--;
        return frontEl;
    }

    
    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException( );
        }else{
            return queue[(front+1)%queue.length];
        }
    }

    
    public boolean isEmpty() {
        return front == rear;
    }

    
    public int size() {
        return size;
    }
    
}
