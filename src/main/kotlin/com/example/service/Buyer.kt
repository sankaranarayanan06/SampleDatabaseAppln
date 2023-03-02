package com.example.service

class Buyer {
    fun buyItem(price: Int) {
        isBuyPriceValid(price)
    }

    fun isBuyPriceValid(price: Int): Boolean {
        return price < 100
    }
}