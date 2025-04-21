package com.engineeringtechie.product_service.service;

import com.engineeringtechie.product_service.dto.ProductRequest;
import com.engineeringtechie.product_service.dto.ProductResponse;
import com.engineeringtechie.product_service.model.Product;
import com.engineeringtechie.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository productRepo;

    private final List<Product> products;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description((productRequest.getDescription()))
                .price(productRequest.getPrice())
                .build();
        productRepo.save(product);
        log.info("Product {} is saved.", product.getId());

    }

    public ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepo.findAll();
        log.info("Total number of products: {}", products.size());
        return products.stream().map(this::mapToProductResponse).toList();
    }


    public Product getProduct(String name) {

        List<Product> products = productRepo.findAll();
        return products.stream().filter(prod -> prod.getName().equalsIgnoreCase(name))
                .findFirst().orElse(null);
    }

/*
    public Product updateProduct(String name) {
        Product product = productRepo.findBy(name);
        product.setName("Infinix");
        product.seDescription("Infinix is a good phone");
        product.setPrice(20);
        productRepo.save(product);
    }*/

}
