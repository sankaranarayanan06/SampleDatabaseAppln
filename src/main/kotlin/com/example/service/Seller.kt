package com.example.service

import com.example.repository.DatabaseOperation

class Seller {
    fun updatePrice(price: Int) {
        if(isPriceUpdateValid(price)){
            val db = DatabaseOperation()
            db.updatePrice(price)
        }
    }

    fun isPriceUpdateValid(price: Int): Boolean {
        return price in 70..150
    }
}
