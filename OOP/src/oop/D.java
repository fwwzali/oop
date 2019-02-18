/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import Methods.A;

/**
 *
 * @author fawwaz
 */
public class D {
    public void public_method(){
        System.out.println("Public method in D");
    }

    
    //method main
    public static void main(String[] args){
        D d = new D();
        A a = new A();
        d.public_method();
        a.protected_method();
        a.private_method();
    }
}
