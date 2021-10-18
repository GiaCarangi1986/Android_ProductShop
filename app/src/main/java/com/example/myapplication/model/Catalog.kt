package com.example.myapplication.model

class Catalog(name_: String, img_: String) {
    var name = name_
        set(value){
            field = value
        }
        get() = field

    var img = img_
        set(value){
            field = value
        }
        get() = field
}