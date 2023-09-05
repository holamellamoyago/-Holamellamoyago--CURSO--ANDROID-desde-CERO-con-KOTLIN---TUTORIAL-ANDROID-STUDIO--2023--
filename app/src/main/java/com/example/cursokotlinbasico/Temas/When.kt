package com.example.cursokotlinbasico.Temas

fun main(){
    getMonth(11)
    getTrimester(5)
    getSemestre(78)
    resultado("Hola")
}

fun getMonth(month:Int){
    when(month){
        1-> println("enero")
        2-> println("enero")
        3-> println("enero")
        4-> println("enero")
        5-> println("enero")
        6-> println("enero")
        7-> println("enero")
        8-> println("enero")
        9-> println("enero")
        10-> println("enero")
        11-> println("enero")
        12-> println("enero")
        else -> println("No es un mes valido")
    }
}

fun getTrimester(month: Int){
    when(month){
        1, 2, 3 -> println("Primer trimestre")
        4, 5 , 6 -> println("Segundo trimestre")
    }
}

fun getSemestre(month:Int) =
    when (month) {
        in 1..6 ->  "Primer tris"
        in 7..12 ->  "Segundo"
        !in 1..12 ->  "no valido"
        else -> "hjashjjhs"
    }


fun resultado(value:Any){
    when (value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if (value){
            print("Holiwi")}
    }
}