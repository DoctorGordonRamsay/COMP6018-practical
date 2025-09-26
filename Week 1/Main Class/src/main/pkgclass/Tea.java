/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.pkgclass;

/**
 *
 * @author 19214806
 */
public class Tea {
    public void addTopping() implements Drink {
        System.out.println("add lemon");
    }
            
    public void addWater() implements Drink {
        System.out.println("steep tea in boiling water");
    }
}
