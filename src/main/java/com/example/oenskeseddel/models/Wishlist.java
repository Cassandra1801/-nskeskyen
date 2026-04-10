package com.example.oenskeseddel.models;
import java.time.LocalDate;

public class Wishlist {
    private int wishlist_Id;
    private String name;
    private String username;
    private LocalDate date;

    public Wishlist() {}

    public Wishlist(int wishlist_Id, String name, String username, LocalDate date){
        this.wishlist_Id = wishlist_Id;
        this.name = name;
        this.username = username;
        this.date = LocalDate.now();
    }

    public int getWishlist_Id(){
        return wishlist_Id;
    }

    public String getName(){
        return name;
    }

    public String getUsername(){
        return username;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setUsername (String username){
        this.username = username;
    }
}
