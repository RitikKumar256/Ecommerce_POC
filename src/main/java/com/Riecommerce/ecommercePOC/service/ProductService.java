package com.Riecommerce.ecommercePOC.service;

import com.Riecommerce.ecommercePOC.exception.ProductException;
import com.Riecommerce.ecommercePOC.model.Product;
import com.Riecommerce.ecommercePOC.request.CreateProductRequest;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    public Product createProduct(CreateProductRequest req);
    public String deleteProduct(Long productId) throws ProductException;
    public Product updateProduct(Long productId,Product req) throws ProductException;

    public Product findProductById(long id)throws ProductException;
    public List<Product> findProductByCategory(String category);
    public Page<Product> getAllProduct(String category, List<String>colors, List<String>sizes, Integer minPrice, Integer maxPrice
            , Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize);



}

