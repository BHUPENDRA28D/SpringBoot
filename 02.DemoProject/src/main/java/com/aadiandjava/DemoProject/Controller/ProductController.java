package com.aadiandjava.DemoProject.Controller;

import com.aadiandjava.DemoProject.Model.Product;
import com.aadiandjava.DemoProject.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/productinfo")
    public String productsList(Model model) {
        model.addAttribute("products", service.getAllProducts());
        return "products";  // view name or ui or html file name
    }

    @GetMapping("/productinfo/{id}")
    public Product getSingle(@PathVariable int id) {
        return service.getProductById(id);
    }
}
