package TD_K

class CompteBancaire(var titulaire:String, var solde:Double){

    fun depot(s:Double){
        afficherSolde()
        solde += s
        println("You deposit $s$. \n|-- Your balance: $solde\$ --|")
    }
    fun retrait(r:Double){
        if (solde > 0){
            if(solde>=r){
                afficherSolde()
                solde -= r
                println("You withdraw $r$. \n|-- Your balance: $solde\$ --|")
            }else println("Your balance $solde$ is less than your withdraw $r")
        }else println("Sorry, you don't have enough balance --> $solde$")
    }

    private fun afficherSolde(){
        println("|--- Your balance: $solde\$ ---|")
    }

}

fun main(){
    val cmpt = CompteBancaire("CIH",10.0)

    cmpt.retrait(10.0)
//    cmpt.retrait(10.0)
//    cmpt.depot(5.0)
//    cmpt.retrait(10.0)
//    cmpt.retrait(05.0)
}
