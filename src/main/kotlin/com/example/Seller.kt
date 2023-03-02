package com.example

class Seller {
    fun updatePrice(price: Int) {
        isPriceUpdateValid(price)
    }

    fun isPriceUpdateValid(price: Int): Boolean {
        return price in 70..150
    }
}
