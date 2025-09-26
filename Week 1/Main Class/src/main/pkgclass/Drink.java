/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.pkgclass;

/**
 *
 * @author 19214806
 */
public abstract class Drink {
    
    public void prepareRecipe() {
        boilWater();
        addWater();
        pourIntoCup();
        addTopping();
    }

    public abstract void addTopping();

    public void pourIntoCup() {
        System.out.println("pour liquid into the cup");
    }

    public abstract void addWater();

    public void boilWater() {
        System.out.println("Boil water");
    }
}
