package pl.jwojciechowski.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        productList.add(new Product(8,"Gigabyte GPU", "GPU", "Gigabyte GPU test description","1123","12/12/2016"));
        productList.add(new Product(3,"Intel CPU","CPU","CPU test description","123","12/12/2016"));
        productList.add(new Product(4,"Asus GPU","GPU","GPU test description","231","12/12/2016"));
        return productList;
    }
}
