package com.example.oenskeseddel.services;

import com.example.oenskeseddel.models.User;
import com.example.oenskeseddel.models.Wishlist;
import com.example.oenskeseddel.repositories.UserRepository;
import com.example.oenskeseddel.repositories.WishlistRepository;
import org.springframework.stereotype.Service;

@Service
public class WishlistService {

    private final WishlistRepository wishlistRepository;
    private final UserRepository userRepository;

    public WishlistService(WishlistRepository wishlistRepository, UserRepository userRepository) {
        this.wishlistRepository = wishlistRepository;
        this.userRepository = userRepository;
    }

    public Wishlist createWishlist(Integer userId, String name) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Bruger ikke fundet"));

        return wishlistRepository.save(new Wishlist(user, name));
    }
}