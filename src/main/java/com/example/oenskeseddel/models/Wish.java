package com.example.oenskeseddel.models;


public class Wish {

    private int wish_Id;
    private int wishlist_Id;
    private String name;
    private String brand;
    private String description;
    private String type;
    private int price;
    private boolean reserve;
    private boolean favorite;
    private String link;

    public Wish() {}


    public Wish(int wish_Id, int wishlist_Id, String name, String brand, String description,
                String type, int price, Boolean favorite, Boolean reserve, String link) {
        this.wish_Id = wish_Id;
        this.wishlist_Id = wishlist_Id;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.type = type;
        this.price = price;
        this.reserve = reserve;
        this.favorite = favorite;
        this.link = link;
    }



    public int getWish_Id() {
        return wish_Id;
    }

    public int getWishlist_Id() {
        return wishlist_Id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public boolean getReserve() {
        return reserve;
    }

    public boolean getFavorite() {
        return favorite;
    }

    public String getLink() {
        return link;
    }




    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setReserve(boolean reserve) {
        this.reserve = this.reserve;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
