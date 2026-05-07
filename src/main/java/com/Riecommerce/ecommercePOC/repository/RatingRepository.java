package com.Riecommerce.ecommercePOC.repository;

import java.util.List;

import com.Riecommerce.ecommercePOC.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RatingRepository extends JpaRepository<Rating,Long> {
    @Query("SELECT r From Rating r Where r.product.id=:productId")
    public List<Rating> getAllProductsRating(@Param("productId")Long productId);

}

