package exAppClass

class Etudiant(val nom:String, val prenom:String, val age:Int, var langues:Langue) {
    fun affiche(){
        println("L'Etudiant : $prenom, $age ans.")
        print("Langue: ")
        list(langues.langueName)
    }
    fun list(l:List<String>){
        val size = l.size-1
        for (i in 0..size){
            if (i != size) print(l[i]+", ")else print(l[i]+".")
        }
    }
    class Langue(val id:Int, var langueName: List<String>){
        constructor(id:Int):this(id, listOf("Null"))
    }
}

fun main(){
    var list = listOf("Arabe","Francais","Anglais","Japanese")
    val lng = Etudiant.Langue(1234,list)
    val etd = Etudiant("Hinata","Uzumaki",20,lng)

    etd.affiche()
}