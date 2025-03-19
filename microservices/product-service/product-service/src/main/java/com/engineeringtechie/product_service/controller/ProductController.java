package com.engineeringtechie.product_service.controller;


import com.engineeringtechie.product_service.dto.ProductRequest;
import com.engineeringtechie.product_service.dto.ProductResponse;
import com.engineeringtechie.product_service.model.Product;
import com.engineeringtechie.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/product")
@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Product getProductByName(@PathVariable("name") String name) {
        return productService.getProduct(name);
    }

  /*  @PostMapping("/{name}")
    @ResponseStatus(HttpStatus.CREATED)
    public void updateProdut(@RequestParam String name) {
        productService.updateProduct(name);

    }*/

}
