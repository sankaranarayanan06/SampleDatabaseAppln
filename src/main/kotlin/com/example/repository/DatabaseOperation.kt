package com.example.repository

import java.sql.DriverManager

class DatabaseOperation {
    private val jdbcUrl = "jdbc:postgresql://localhost:32768/sampledb"
    val connection = DriverManager.getConnection(jdbcUrl, "postgres", "root")

    fun updatePrice(price:Int){
        val query = connection.prepareStatement("update item set price=?")
        query.setInt(1,price)
        query.executeUpdate()

        val query1 = connection.prepareStatement("insert into item_price_history(price) values(?)")
        query1.setInt(1,price)
        query1.executeUpdate()
    }

    fun createBuyHistory(price: Int){
        val query = connection.prepareStatement("insert into purchase_details(price) values(?)")
        query.setInt(1,price)
        query.executeUpdate()
    }

    fun getprice(): Int {
        val query = connection.prepareStatement("select price from item")
        val result = query.executeQuery()
        var price:Int = 0
        while(result.next()){
            price = result.getInt("price")
        }
        return price
    }
}