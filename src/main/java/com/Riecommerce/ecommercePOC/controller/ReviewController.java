package com.Riecommerce.ecommercePOC.controller;

import java.util.List;

import com.Riecommerce.ecommercePOC.exception.UserException;
import com.Riecommerce.ecommercePOC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Riecommerce.ecommercePOC.exception.ProductException;
import com.Riecommerce.ecommercePOC.model.Review;
import com.Riecommerce.ecommercePOC.model.User;
import com.Riecommerce.ecommercePOC.request.RatingRequest;
import com.Riecommerce.ecommercePOC.request.ReviewRequest;
import com.Riecommerce.ecommercePOC.service.RatingService;
import com.Riecommerce.ecommercePOC.service.ReviewService;
@RestController
@RequestMapping("/api/reviews")

public class ReviewController {
    @Autowired
    private UserService userService;
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/create")
    public ResponseEntity<Review> createReviewReview(@RequestBody ReviewRequest req,
                                                     @RequestHeader("Authorization") String jwt)throws UserException,ProductException{
        User user=userService.findUserProfileByJwt(jwt);
        Review review=reviewService.createReview(req, user);
        return new ResponseEntity<Review>(review,HttpStatus.CREATED);
    }
    @GetMapping("/product/{productId}")
    public ResponseEntity<List<Review>> getProductsRating(@PathVariable Long productId,
                                                          @RequestHeader("Authorization")String jwt) throws UserException,ProductException{

        User user=userService.findUserProfileByJwt(jwt);
        List<Review> reviews=reviewService.getAllReview(productId);
        return new ResponseEntity<>(reviews,HttpStatus.ACCEPTED);
    }
}