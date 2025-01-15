package org.example.inventoryservices2;

import org.example.inventoryservices2.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServices2Application {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServices2Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder().name("Compter").price(2300).quantity(12).build());
            productRepository.save(Product.builder().name("Printer").price(1200).quantity(10).build());
            productRepository.save(Product.builder().name("smart phone").price(4300).quantity(6).build());
        };
    }
}