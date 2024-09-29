package TD_K

class CompteBancaire(var titulaire:String, var solde:Double){
    companion object {
        var globalId = 0
    }
    var id = 0

    constructor(titulaire: String,solde: Int):this(titulaire,solde.toDouble())

    init {
        globalId++
        id = globalId
    }

    fun depot(s:Double){
        afficherSolde()
        solde += s
        println("Your ID is: $id")
        println("You deposit $s$. \n|-- Your balance: $solde\$ --|")
    }
    fun retrait(r:Double){
        if (solde > 0){
            if(solde>=r){
                afficherSolde()
                println("Your ID is: $id")
                solde -= r
                println("You withdraw $r$.")
                afficherSolde()
                println()
            }else println("Your balance $solde$ is less than your withdraw $r")
        }else println("Sorry, you don't have enough balance --> $solde$")
    }

    private fun afficherSolde(){
        println("|--- Your balance: $solde\$ ---|")
    }

}

fun main(){
    val cmpt = CompteBancaire("CIH",10.0)
    val cmpt2 =CompteBancaire("BMCE",20)

    cmpt.retrait(10.0)
    cmpt2.retrait(10.0)
    cmpt.depot(10.0)
}
