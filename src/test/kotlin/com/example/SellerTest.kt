package com.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SellerTest {
    @Test
    fun `seller should not be able to place order if price is not between 70 and 150`() {
        val seller = Seller()

        val actualOutput = seller.isPriceUpdateValid(190)

        assertFalse(actualOutput)
    }

    @Test
    fun `seller should be able to place order if price is between 70 and 150`() {
        val seller = Seller()

        val actualOutput = seller.isPriceUpdateValid(100)

        assertTrue(actualOutput)

    }
}