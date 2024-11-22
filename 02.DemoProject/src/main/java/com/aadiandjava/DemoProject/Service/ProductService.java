package com.aadiandjava.DemoProject.Service;

import com.aadiandjava.DemoProject.Model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;

@Service  //business logic is writen in service class
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101, "Samsung M35 Max", 19599.00),
            new Product(102, "Apple iPhone 13", 69999.00),
            new Product(103, "OnePlus 9 Pro", 64999.00),
            new Product(104, "Google Pixel 6", 59999.00),
            new Product(105, "Xiaomi Mi 11 Ultra", 69999.00),
            new Product(106, "Oppo Reno6 Pro", 49999.00),
            new Product(107, "Vivo X70 Pro", 54999.00),
            new Product(108, "Realme GT", 44999.00),
            new Product(109, "Sony Xperia 1 III", 79999.00),
            new Product(110, "Nokia 8.3 5G", 45999.00),
            new Product(111, "Motorola Edge 20 Pro", 42999.00)
    );

    public List<Product> getAllProducts() {
        return products;
    }

    // to get data by id
    public Product getProductById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ID not found");
    }
}
