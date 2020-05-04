package org.launchcode.java.studios.ResturauntMenu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated = new Date();

    protected Menu(Date lastUpdated){
        this.lastUpdated= lastUpdated;
    }

    protected ArrayList<MenuItem> getAppetizers(){
//        Create an appetizer ArrayList here
    }

    protected ArrayList<MenuItem> getMainCourses(){
//        Create a main course ArrayList here
    }

    protected ArrayList<MenuItem> getDesserts(){
//        create a dessert course ArrayList here
    }

    protected ArrayList<MenuItem> getPriceList(){
//        create an arraylist of items under a certain price
    }

    protected ArrayList<MenuItem> getFullList(){
//        create an arraylist of the full menu here
    }


}
