package com.example.myapplication.model

class ProductItemKotlin(name: String, count: Int, isChecked: Boolean, cost: Double, labelForCost: String) {
    var name = name
        set(value){
            field = value
        }
        get() = field

    var count = count
        set(value){
            field = value
        }
        get() = field

    var isChecked = isChecked
        set(value){
            field = value
        }
        get() = field

    var cost = cost
        set(value){
            field = value
        }
        get() = field

    var labelForCost = labelForCost
        set(value){
            field = value
        }
        get() = field
}