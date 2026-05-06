package com.Riecommerce.ecommercePOC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Riecommerce.ecommercePOC.model.Cart;
import com.Riecommerce.ecommercePOC.model.CartItem;
import com.Riecommerce.ecommercePOC.model.Product;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {
    @Query("SELECT ci From CartItem ci Where ci.cart=:cart And ci.product=:product And ci.size=:size And ci.userId=:userId")
    public CartItem isCartItemExist(@Param("cart") Cart cart,@Param("product") Product product,@Param("size")String size,
                                    @Param("userId")Long userId);

}