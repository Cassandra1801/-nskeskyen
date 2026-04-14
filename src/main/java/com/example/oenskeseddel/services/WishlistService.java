package com.example.oenskeseddel.services;

import com.example.oenskeseddel.models.User;
import com.example.oenskeseddel.models.Wishlist;
import com.example.oenskeseddel.repositories.WishlistRepository;
import org.springframework.stereotype.Service;

//@Service
public class WishlistService {

    private final WishlistRepository wishlistRepository;

    public WishlistService(WishlistRepository wishlistRepository) {
        this.wishlistRepository = wishlistRepository;
    }

    public Wishlist createWishlist(User user, String name) {
        return wishlistRepository.save(new Wishlist(user, name));
    }


    //Creation of the sharing URL for sharing wishlists.
    public String generateShareLink(Integer wishlist_id) {



        return "onskesedlen-gphsgcahg3d6eae6.westeurope-01.azurewebsites.net/share/" + wishlist_id;
    }

}
