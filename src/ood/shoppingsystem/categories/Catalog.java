package ood.shoppingsystem.categories;

import java.util.List;
import java.util.Map;

public class Catalog {

    private Map<String, List<Product>> productNames ;
    private Map<String, List<Product>> productCategories ;

    public List<Product> searchProductsByName(String name) {
        return productNames.get(name);
    }

    public List<Product> searchProductsByCategory(String category) {
        return productCategories.get(category);
    }

}
