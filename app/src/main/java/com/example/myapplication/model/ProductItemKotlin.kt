package com.example.myapplication.model

class ProductItemKotlin(name_: String, count_: Int, isChecked_: Boolean, cost_: Double, labelForCost_: String) {
    var name = name_
        set(value){
            field = value
        }
        get() = field

    var count = count_
        set(value){
            field = value
        }
        get() = field

    var isChecked = isChecked_
        set(value){
            field = value
        }
        get() = field

    var cost = cost_
        set(value){
            field = value
        }
        get() = field

    var labelForCost = labelForCost_
        set(value){
            field = value
        }
        get() = field
}