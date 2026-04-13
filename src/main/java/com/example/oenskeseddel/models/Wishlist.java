package com.example.oenskeseddel.models;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity                       // "denne klasse er en databasetabel"
@Table(name = "wishlists")   // "tabellen hedder wishlists"
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername (String username){
        this.username = username;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
