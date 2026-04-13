package com.example.oenskeseddel.services;

import com.example.oenskeseddel.models.Wish;
import com.example.oenskeseddel.models.Wishlist;
import com.example.oenskeseddel.repositories.WishRepository;
import org.springframework.stereotype.Service;

@Service
public class WishService {

    private final WishRepository wishRepository;

    public WishService(WishRepository wishRepository) {
        this.wishRepository = wishRepository;
    }

    public Wish createWish(Wishlist wishlist, String name) {
        return wishRepository.save(new Wish(wishlist, name));
    }
}
