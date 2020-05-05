package org.launchcode.java.studios.ResturauntMenu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;


public class Menu {
    private ArrayList<MenuItem> menu =
            new ArrayList<MenuItem>();

    public void addItem(MenuItem menuItem){
        menu.add(menuItem);
    }

    public void removeItem(MenuItem menuItem){
        menu.remove(menuItem);
    }




}
