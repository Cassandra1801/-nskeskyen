package com.example.oenskeseddel.controllers;

import com.example.oenskeseddel.models.Wish;
import com.example.oenskeseddel.models.Wishlist;
import com.example.oenskeseddel.services.WishService;
import com.example.oenskeseddel.services.WishlistService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wishlists")
public class WishlistController {

    private final WishlistService wishlistService;
    private final WishService wishService;

    public WishlistController(WishlistService wishlistService, WishService wishService) {
        this.wishlistService = wishlistService;
        this.wishService = wishService;
    }

    @PostMapping("/create")
    public Wishlist createWishlist(@RequestParam Integer userId,
                                   @RequestParam String name) {
        return wishlistService.createWishlist(userId, name);
    }

    @PostMapping("/{wishlistId}/wishes")
    public Wish createWish(@PathVariable Integer wishlistId, @RequestParam String name) {
        return wishService.createWish(wishlistId, name);
    }
}