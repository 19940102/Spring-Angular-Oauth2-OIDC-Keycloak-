package org.example.inventoryservices2.web;


import org.example.inventoryservices2.ProductRepository;
import org.example.inventoryservices2.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProductRestController {
    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }
    @GetMapping("products")
    public List<Product> productList(){
        return productRepository.findALL();
    }
}
