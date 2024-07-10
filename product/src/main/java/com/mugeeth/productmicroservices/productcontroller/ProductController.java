package com.mugeeth.productmicroservices.productcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products") //http:localhost:8082/products
    public String products(){
        return "PRODUCTS";
    }
}
