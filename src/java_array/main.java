/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_array;

import OOPII.Lamp;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
        //create objects led and halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // turn on the light by
        // calling method turnOn()
        led.turnOn();

        //turn off the light by
        //calling method turnOff()
        halogen.turnOff();

    }




}
