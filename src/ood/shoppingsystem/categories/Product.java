package ood.shoppingsystem.categories;

import ood.shoppingsystem.constants.ProductCategory;

public class Product {
    String name;
    String id;
    double price;
    private String description;
    int availableItemCount;
    ProductCategory productCategory;

    public int getAvailableItemCount(){
        return 0;
    }
    public boolean updatePrice(double newPrice){
        return true;
    }

}
