package TD_K

fun mention(note:Int):String{
    when(note){
        in 16..20 -> return ("Excellent")
        in 14..15 -> return ("Très bien")
        in 12..13 -> return ("Bien")
        in 10..11 -> return ("Assez bien")
        else -> return ("Échec")
    }
}

fun main(){
    print("Saisir un nombre: ")
    val numInput = readLine()?.toIntOrNull()

    var moy = 0

    if (numInput != null){
        if (numInput !=0){

            for (i in 1 .. numInput){
                print("N: ")
                var num = readLine()?.toIntOrNull()
                if (num != null){
                    if (num < 0){
                        println("The num is less than 0")
                        i--
                    }else{
                        moy += num
                    }
                }
            }

                var result = moy / numInput
                println("La moyenne est: $result")

                println(mention(result))
            
        }
        else{
            var numRepeat = 0
            while (true){
                print("N: ")
                var num = readLine()?.toIntOrNull()
                if (num != null && num >0){
                    moy += num
                    numRepeat++
                }
                else if (num != -1){
                    println("The num is less than 0")
                }
                else{
                    break
                }
            }

            var result = moy / numRepeat
            println("La moyenne est: $result")

            println(mention(result))
        }
    }

}
