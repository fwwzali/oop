/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author fawwaz
 */
public class C {
    public void public_method(){
        System.out.println("Public method in C");
    }

    
    //method main
    public static void main(String[] args){
        C c = new C();
        A a = new A();
        c.public_method();
        a.protected_method();
        //a.private_method();
    }
}
