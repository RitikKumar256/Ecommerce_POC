package com.Riecommerce.ecommercePOC.service;

import java.time.LocalDateTime;
import java.util.List;

import com.Riecommerce.ecommercePOC.model.Rating;
import org.springframework.stereotype.Service;

import com.Riecommerce.ecommercePOC.exception.ProductException;
import com.Riecommerce.ecommercePOC.model.Product;
import com.Riecommerce.ecommercePOC.model.User;
import com.Riecommerce.ecommercePOC.repository.RatingRepository;
import com.Riecommerce.ecommercePOC.request.RatingRequest;
@Service
public class RatingServiceImplementation implements RatingService {

    private RatingRepository ratingRepository;
    private ProductService productService;

    public RatingServiceImplementation(RatingRepository ratingRepository,ProductService productService) {
        this.ratingRepository=ratingRepository;
        this.productService=productService;
    }

    @Override
    public Rating createRating(RatingRequest req, User user) throws ProductException {
        Product product=productService.findProductById(req.getProductId());
        Rating rating=new Rating();
        rating.setProduct(product);
        rating.setUser(user);
        rating.setRating(req.getRating());
        rating.setCreatedAt(LocalDateTime.now());

        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getProductsRating(Long productId) {

        return ratingRepository.getAllProductsRating(productId);
    }

}
