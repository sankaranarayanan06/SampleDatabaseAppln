package com.example

import com.example.service.Buyer
import com.example.service.Seller
import kotlin.concurrent.thread
import kotlin.random.Random

fun main(args: Array<String>) {
    thread(start = true) {
        for (counter in 0..100) {
            val seller = Seller()
            seller.updatePrice(Random.nextInt(0, 250))
        }
    }

    thread(start = true) {
        for (counter in 0..100) {
            val buyer = Buyer()
            buyer.buyItem()
        }
    }
}

