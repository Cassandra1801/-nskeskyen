package com.example.oenskeseddel.controllers;

import com.example.oenskeseddel.models.Wishlist;
import com.example.oenskeseddel.services.WishlistService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wishlists")
public class WishlistController {

    private final WishlistService wishlistService;

    public WishlistController(WishlistService wishlistService) {
        this.wishlistService = wishlistService;
    }

    @PostMapping("/create")
    public Wishlist createWishlist(@RequestParam Integer userId,
                                   @RequestParam String name) {
        return wishlistService.createWishlist(userId, name);
    }
}