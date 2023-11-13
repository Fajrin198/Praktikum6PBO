/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PendahuluanNomor3;

/**
 *
 * @author MY ASUS
 */
public class MySubClass extends MySuperClass {
    
    public static void main(String[] args) {
        MySubClass object1 = new MySubClass();
        object1.printKeterangan();
    }
    
    @Override
    protected void printKeterangan(){
        System.out.println("Ini adalah method yang berada di sub class");
    }
    
}
