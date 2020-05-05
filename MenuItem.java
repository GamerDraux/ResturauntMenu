package org.launchcode.java.studios.ResturauntMenu;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private String name = "";
    private double price = 0.00;
    private String description = "";
    private String picture;
    private boolean newItem;
    private String category = "";
    private ArrayList<String> ingredients;

    protected MenuItem(String name, double price, String category) {
        this.name =name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public String getPicture() { return picture; }
    public String getCategory() { return category; }
    public ArrayList<String> getIngredients() { return ingredients; }

    public void setName (String name){this.name = name;}
    public void setPrice(double price){this.price = price;}
    public void setDescription(String description){this.description = description;}
    public void setCategory(String category){this.category= category;}
    public void setIngredients(ArrayList<String> ingredients){this.ingredients = ingredients;}




}
