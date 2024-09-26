package TD_K

import kotlin.math.PI

open class Forme(var couleur:String){
    fun afficherCouleur(){
        println("The color is: $couleur")
    }
}

class Cercle(couleur: String,var rayon:Double) : Forme(couleur){
    fun aire(){
        val area = PI * (rayon*2)
        println("The area of this circle is: $area")
    }
}
class Rectangle(couleur: String,var largeur:Double,var hauteur:Double) : Forme(couleur){
    fun aire(){
        val area = largeur * hauteur
        println("The area of this rectangle is: $area")
    }
}

fun main(){
    val crl01 = Cercle("Red",12.0)
    val rec01 = Rectangle("Black",10.0,5.0)

    crl01.afficherCouleur()
    rec01.afficherCouleur()

    crl01.aire()
    rec01.aire()
}