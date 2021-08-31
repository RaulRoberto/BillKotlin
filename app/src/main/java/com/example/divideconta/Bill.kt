package com.example.divideconta

class Bill(var bill: Double, var service: Double, var crew: Int) {
    fun calcBillPerPerson():Double{
        return bill / crew
    }
    fun calcServicePerPerson(): Double{
        return (bill * service / 100)/ crew
    }

}