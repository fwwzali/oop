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
public class B extends A{
    public void public_method_in_b(){
        public_method();
        protected_method();
        //private_method();
    }
    
    //method main
    public static void main(String[] args){
        B b = new B();
        b.public_method();
    }
}
