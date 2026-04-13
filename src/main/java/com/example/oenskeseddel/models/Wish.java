package com.example.oenskeseddel.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "wishes")
public class Wish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wish_id")
    private Integer wishId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "wishlist_id", nullable = false)
    private Wishlist wishlist;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(length = 50)
    private String brand;

    @Column(length = 255)
    private String description;

    @Column(length = 50)
    private String type;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    @Column(length = 255)
    private String link;

    @Column(name = "is_favorite", nullable = false)
    private boolean favorite;

    @Column(name = "is_reserved", nullable = false)
    private boolean reserved;

    public Wish() {
    }

    public Wish(Wishlist wishlist, String name) {
        this.wishlist = wishlist;
        this.name = name;
    }

    public Integer getWishId() {
        return wishId;
    }

    public Wishlist getWishlist() {
        return wishlist;
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

    public BigDecimal getPrice() {
        return price;
    }

    public String getLink() {
        return link;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setWishlist(Wishlist wishlist) {
        this.wishlist = wishlist;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
