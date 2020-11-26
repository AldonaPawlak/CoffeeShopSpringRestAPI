package com.codecool.coffeeshopspringrestapi.service;

import com.codecool.coffeeshopspringrestapi.model.Client;
import com.codecool.coffeeshopspringrestapi.model.Order;
import com.codecool.coffeeshopspringrestapi.model.Product;
import com.codecool.coffeeshopspringrestapi.repository.OrderRepository;
import com.codecool.coffeeshopspringrestapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        List<Product> products = productRepository.findAll();
        products.sort(Comparator.comparing(Product::getId));

        return products;
    }

    public ResponseEntity<Product> getProduct(Long id) {
        return productRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }


    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    public ResponseEntity<Product> editProduct(Product product) {
        Optional<Product> optionalProduct = productRepository.findById(product.getId());
        optionalProduct.ifPresentOrElse(pr -> updateProduct(pr, product), optionalProduct::orElseThrow);
        return ResponseEntity.accepted().build();
    }

    private void updateProduct(Product editedProduct, Product newProduct) {
        editedProduct.setName(newProduct.getName());
        editedProduct.setDetails(newProduct.getDetails());
        editedProduct.setPrice(newProduct.getPrice());
        productRepository.save(editedProduct);
    }
}