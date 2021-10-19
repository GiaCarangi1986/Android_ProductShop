package com.example.myapplication.model

class Category(name: String, img: String = "") {

    var name = name
        set(value){
            field = value
        }
        get() = field

    var img = img
        set(value){
            field = value
        }
        get() = field
}