package com.example.oenskeseddel.controllers;

import com.example.oenskeseddel.models.Wishlist;
import com.example.oenskeseddel.services.WishlistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/wishlists")
public class WishlistController {

    private final WishlistService wishlistService;

    public WishlistController(WishlistService wishlistService) {
        this.wishlistService = wishlistService;
    }

    @ResponseBody
    @PostMapping("/create")
    public Wishlist createWishlist(@RequestParam Integer userId,
                                   @RequestParam String name) {
        return wishlistService.createWishlist(userId, name);
    }
}

    @GetMapping("/{wishlistId}")
    public String getWishlistPage(@PathVariable Integer wishlistId, Model model) {
        model.addAttribute("wishlistId", wishlistId);
        return "wishlist";
    }
}
