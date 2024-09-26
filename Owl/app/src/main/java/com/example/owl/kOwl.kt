package com.example.owl

class Animal(var nom: String,var age:Int){
    fun afficherDetails(){
        println("$nom have $age years old!")
    }
}

fun main(){
    val cat = Animal("Kitty",8)
    val dog = Animal("Toby",6)

    cat.afficherDetails()
    dog.afficherDetails()

}