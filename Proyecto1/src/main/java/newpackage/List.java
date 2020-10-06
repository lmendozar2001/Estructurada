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
public interface List<T> {
    boolean isEmpty();
    int size();
    T get(int in);
    void add(T in);
    T remove(int in);


}
