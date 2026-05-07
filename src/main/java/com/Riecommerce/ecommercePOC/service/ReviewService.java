package com.Riecommerce.ecommercePOC.service;

import java.util.List;

import com.Riecommerce.ecommercePOC.exception.ProductException;
import com.Riecommerce.ecommercePOC.model.Review;
import com.Riecommerce.ecommercePOC.model.User;
import com.Riecommerce.ecommercePOC.request.ReviewRequest;

public interface ReviewService {

    public Review createReview(ReviewRequest req,User user)throws ProductException;
    public List<Review> getAllReview(Long productId);

}

