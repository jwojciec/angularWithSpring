package pl.jwojciechowski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.jwojciechowski.model.Product;
import pl.jwojciechowski.model.ProductService;

import java.util.List;

@Controller
public class Dispatcher {
    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String getRoot() {
        return "index";
    }

    @RequestMapping("/products")
    @ResponseBody
    public List<Product> getProducts() {
        return productService.getProductList();
    }
}
