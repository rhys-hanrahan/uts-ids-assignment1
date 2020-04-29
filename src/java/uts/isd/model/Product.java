/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model;

/**
 *
 * @author rhys
 */
public class Product {
    int id;
    
    int categoryId;
    
    String name;
    
    double price;
    
    String description;
    
    String image;
    
    int initialQuantity;
    
    int currentQuantity;
    
    String lastReorderDate;

    public Product() {
    }
    
    public Product(int id, int categoryId, String name, double price, String description) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(int initialQuantity) {
        this.initialQuantity = initialQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public String getLastReorderDate() {
        return lastReorderDate;
    }

    public void setLastReorderDate(String lastReorderDate) {
        this.lastReorderDate = lastReorderDate;
    }
    
    
}
