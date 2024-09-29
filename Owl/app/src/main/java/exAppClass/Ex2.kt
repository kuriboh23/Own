package exAppClass

open class Personne(var id:Int, var nom:String, var prenom:String, var age:Byte){
    companion object{
        var globalId = 1
    }
    init {
        globalId++
    }
    constructor():this(id= globalId, nom="", prenom="", age=0)
    constructor(nom: String,prenom: String,age: Byte):this(id= globalId, nom, prenom, age)
    fun Id():Int{
        return id
    }
    fun Id(newId:Int){
     if (newId > 0) id = newId
    }

    open fun afficherInfos(){
        println("Id: $id, Nom: $nom, Prenom: $prenom, Age: $age")
    }
}
class Employe(nom:String, prenom:String, age:Byte, var salaire:Double):Personne(nom,prenom,age){
    companion object {
        var numEmp = 0
            private set

        fun NumEmp():Int{
            return numEmp
        }
    }
    init {
        numEmp++
    }
 constructor(nom: String,prenom: String,age: Byte,salaire: Int):this(nom = nom, prenom = prenom, age = age,salaire.toDouble())

    override fun afficherInfos() {
        super.afficherInfos()
        println("---> Salaire: $salaire")
    }

}

fun main() {

    val emp = Employe("Uzumaki","Naruto",20,1600)
    val emp2 = Employe("Uzumaki","Naruto",20,1600)

    emp.afficherInfos()
    emp2.afficherInfos()
    println(Employe.NumEmp())

}