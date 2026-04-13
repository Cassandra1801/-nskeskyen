package com.example.oenskeseddel.services;

import com.example.oenskeseddel.models.Wishlist;
import com.example.oenskeseddel.repositories.WishlistRepository;
import org.springframework.stereotype.Service;

@Service
public class WishlistService {

    private final WishlistRepository wishlistRepository;

    public WishlistService(WishlistRepository wishlistRepository) {
        this.wishlistRepository = wishlistRepository;
    }

    public void createWishlist(String name) {
        Wishlist wishlist = new Wishlist();
        wishlist.setUsername(name);
        wishlistRepository.save(wishlist);
    }
}