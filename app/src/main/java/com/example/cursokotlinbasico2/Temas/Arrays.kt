package com.example.cursokotlinbasico.Temas

fun main(){
    /**
     *     var name:String = "Aristdevs"
     *     var name2:String = "Holamellamoyago"
     *     var name3:String = "Aristdevs"
     */


    val weekdays = arrayOf("Lunes", "Martes" , "Miercoles", "Jueves", "Sabado", "Domingo")

    weekdays[0] = "Feliz lunes"

//Tamanos
    if (weekdays.size >= 8){
        println(weekdays[7])
    } else println("No hay mas valores en el array")

// Modificar valores:
    println(weekdays[0])

//Bucles para arrays
    for (position in weekdays.indices){
        println(weekdays[position])
    }

    for ((position , value) in weekdays.withIndex()){
        println("La posicion $position, contiene $value")
    }

    for (weekday in weekdays){
        println("Ahora es $weekday")
    }




}





















