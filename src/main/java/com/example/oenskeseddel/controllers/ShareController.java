package com.example.oenskeseddel.controllers;

import com.example.oenskeseddel.services.WishlistService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wishlist")
public class ShareController {

    private final WishlistService wishlistService;

    public ShareController(WishlistService wishlistService) {
        this.wishlistService = wishlistService;
    }

    @GetMapping("/{wishlistId}/share-link")
    public String getShareLink(@PathVariable Integer wishlistId) {
        return wishlistService.generateShareLink(wishlistId);
    }

}
