package pl.jwojciechowski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Dispatcher {

    @RequestMapping("/")
    public String getRoot() {
        return "index";
    }

    @RequestMapping("/products")
    @ResponseBody
    public String getProducts() {
        return "products";
    }
}
