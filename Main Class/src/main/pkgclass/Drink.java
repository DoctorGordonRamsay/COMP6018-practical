/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.pkgclass;

/**
 *
 * @author 19214806
 */
public class Drink {
    private int drinkType;

    /**
     * @return the drinkType
     */
    public int getDrinkType() {
        return drinkType;
    }

    /**
     * @param drinkType the drinkType to set
     */
    public void setDrinkType(int drinkType) {
        this.drinkType = drinkType;
    }
    
    public void prepareRecipe() {
        step1();
        step2();
        step3();
        step4();
    }

    public void step4() {
        switch(drinkType) {
            case 1: System.out.println("add sugar and milk"); break;
            default: System.out.println("add lemon"); break;
        }
    }

    public void step3() {
        System.out.println("pour liquid into the cup");
    }

    public void step2() {
        switch(drinkType){
            case 1: System.out.println("drip coffee through a filter"); break;
            default: System.out.println("steep tea in boiling water"); break;
        }
    }

    public void step1() {
        System.out.println("Boil water");
    }
}
