/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mca241
 */
public class MyShoppingItems {
    
    int id;
    String name;
    double price;
    int categoryID;

    public MyShoppingItems(int id, String name, double price, int categoryID) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryID = categoryID;
    }

    public MyShoppingItems() {
    
        id=0;
        name="";
        price=0.0;
        categoryID=0;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public String toString() {
        return "MyShoppingItems{" + "id=" + id + ", name=" + name + ", price=" + price + ", categoryID=" + categoryID + '}';
    }
    
    
    
}
