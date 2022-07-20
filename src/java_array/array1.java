/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_array;

/**
 *
 * @author HP
 */
public class  array1 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5};
        String[] name = {"felicio", "nelia", "reinaldo", "tiago", "ivonia", "diego"}; 
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);
        
        System.out.println("====================================================");

        
        for (int i = 0; i < name.length; i++) {
            System.out.println("Hello My name is " + name[i]);
        }
                
    }
}