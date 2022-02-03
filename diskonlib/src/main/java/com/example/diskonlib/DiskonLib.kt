package com.example.diskonlib

class DiskonLib {
    companion object {
        fun calculateDiscount(price: Int, percentage: Double): Double {
            return price * percentage
        }
    }
}