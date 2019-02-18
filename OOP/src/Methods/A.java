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
public class A {
    public void public_method(){
        System.out.println("Public method in A");
        protected_method();
        private_method();
    }
    
    protected void protected_method(){
        System.out.println("Protected Method in A");
    }
    
    private void private_method(){
        System.out.println("Private Method in A");
    }
    
    //method main
    public static void main(String[] args){
        A a = new A();
        a.public_method();
    }
    
}
