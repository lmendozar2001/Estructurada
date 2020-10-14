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
public interface Queues<T> {
   void enqueue(T value);
   T dequeue();
   T peek();
   boolean isEmpty();
   int size();
   
   
}
