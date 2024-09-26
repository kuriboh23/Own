package TD_K


fun main(){
    print("Saisir un nombre: ")
    val numInput = readLine()?.toIntOrNull()

    var moy = 0
    var checkNegatif = true

    if (numInput != null){
        if (numInput !=0){

            for (i in 1 .. numInput){
                print("N: ")
                var num = readLine()?.toIntOrNull()
                if (num != null){
                    if (num < 0){
                        checkNegatif = false
                        println("The num is less than 0")
                        break
                    }else{
                        moy += num
                    }
                }
            }
            if (checkNegatif){

                var result = moy / numInput
                println("La moyenne est: $result")

                when(result){
                    in 16..20 -> println("Excellent")
                    in 14..15 -> println("Très bien")
                    in 12..13 -> println("Bien")
                    in 10..11 -> println("Assez bien")
                    else -> println("Échec")
                }
            }
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

            when(result){
                in 16..20 -> println("Excellent")
                in 14..15 -> println("Très bien")
                in 12..13 -> println("Bien")
                in 10..11 -> println("Assez bien")
                else -> println("Échec")
            }
        }
    }

}