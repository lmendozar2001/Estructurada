/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import newpackage.Nodes;

/**
 *
 * @author Keynes Stephens Watson
 */
public class LinkedList<T> {
    private int size;
    private Nodes<T> head = null;
    private Nodes<T> tail = null;

    public LinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    
   
    
    public void addfront(T in){
        Nodes<T> n = new Nodes<T>(in);
    
        if(this.head==null){
            this.head = n;
            this.tail = this.head;
            this.size++;
       }else{
           n.next = this.head;
           this.head = n;
           this.size++;
       }
    }

    public void addback(T in){
        Nodes<T> n = new Nodes<T>(in);
    
        if(this.head==null){
            this.head = this.tail= n;
            this.size++;
            
        }else{
            this.tail.next = n;
            this.tail = n;
            this.size++;
        }
        
    
    }

    public boolean isEmpty(){
        return this.head==null;
    }
    

    public void removeFront(){
        
        if(isEmpty()){
            System.out.println("Se elimino el elemento del principio");
        }

        if(this.head==this.tail){
            this.head = this.tail = null;
        }else{
            this.head = this.head.next;
            this.size--;
        }

      
    }

    public void removeBack(){
       
        if(isEmpty()){
            System.out.println("Se elimino el elemento final");
        }

        if(this.head==this.tail){
            this.head = this.tail = null;
            this.size--;
        }else{
            Nodes<T> aux = this.head;
            while(aux.next.next!=null){
                aux = aux.next;
            }
            aux.next = null;
            this.tail = aux;
            this.size--;
        }
        
    }
    

    
    public T frontEle(){
        if(isEmpty()){
            return null;
        }
        return this.head.data;
    }


    public T backEle(){
        Nodes<T> aux = this.head;
        Nodes<T> s = null;
        if(isEmpty()){
            return null;
        }else{
            while(aux!=null){
                s = aux;
                aux = aux.next;

            }

        }

        return s.data;
    }
    
    
    public boolean findKey(T in){
        Nodes<T> aux = this.head;
        boolean b = false;
        while(aux!=null){
            if(in==aux.data){
                b = true;
                break;
            }
            aux = aux.next;
            
            
            
            
        }
        return b;
    }

    public int size(){
        return size;
    }
    
    public void printList(){
        if(isEmpty()){
            System.out.println("Lista Vacia");
        }
        Nodes<T> p = this.head;
        int i=1;
        while(p!=null){
            
            System.out.println(i+": "+p.data);
            p = p.next;
            i++;
        }
    }
}
