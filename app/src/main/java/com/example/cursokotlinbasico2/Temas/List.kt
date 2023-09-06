package com.example.cursokotlinbasico.Temas

fun main(){
    mutableList()
}

fun mutableList() {
    var wekkDays:MutableList<String> = mutableListOf("Lunes" , "Martes" , "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(wekkDays)

    wekkDays.add( 3, "PachangaDay")
    println(wekkDays)

    wekkDays.remove( "PachangaDay")
    println(wekkDays)

    if (wekkDays.isEmpty()){
        //No voy a pintar nada por que no hay
    } else{
        wekkDays.forEach{ println(it)}
    }

    if (wekkDays.isNotEmpty()){
        wekkDays.forEach { println(it) }
    }

    wekkDays.forEach {  }

}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes" , "Martes" , "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly[0])
    println(readOnly.first())
    println(readOnly.last())

    //Filtrar listas
    val example = readOnly.filter { it.contains("Lunes") }
    println(example)

    readOnly.forEach { diaSemana -> println(diaSemana) }
}