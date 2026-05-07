package com.Riecommerce.ecommercePOC.service;

import java.util.List;

import com.Riecommerce.ecommercePOC.exception.ProductException;
import com.Riecommerce.ecommercePOC.model.Rating;
import com.Riecommerce.ecommercePOC.model.User;
import com.Riecommerce.ecommercePOC.request.RatingRequest;

public interface RatingService {

    public Rating createRating(RatingRequest req, User user) throws ProductException;
    public List<Rating> getProductsRating(Long productId);


}
