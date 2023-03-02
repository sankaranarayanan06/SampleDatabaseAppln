package com.example.service

import com.example.repository.DatabaseOperation

class Buyer {
    fun buyItem() {
        val db = DatabaseOperation()
        val price = db.getprice()
        if (isBuyPriceValid(price)) {
            db.createBuyHistory(price)
        }
    }

    fun isBuyPriceValid(price: Int): Boolean {
        return price < 100
    }
}