package org.launchcode.java.studios.ResturauntMenu;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private String name = "";
    private double price = 0.00;
    private String description = "";
    private String picture;
    private Date dateAdded;
    private String category = "";
    private ArrayList<String> ingredients;

    protected MenuItem(String name, double price,
                       String description,
                       Date dateAdded, String category,
                       ArrayList<String> ingredients) {
        this.name =name;
        this.price = price;
        this.description = description;
        this.dateAdded = dateAdded;
        this.ingredients = ingredients;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public String getPicture() { return picture; }
    public Date getDateAdded() { return dateAdded; }
    public String getCategory() { return category; }
    public ArrayList<String> getIngredients() { return ingredients; }

    public void setName (String name){this.name = name;}
    public void setPrice(double price){this.price = price;}
    public void setDescription(String description){this.description = description;}
    public void setDateAdded(Date dateAdded){this.dateAdded= dateAdded;}
    public void setCategory(String category){this.category= category;}
    public void setIngredients(ArrayList<String> ingredients){this.ingredients = ingredients;}




}
