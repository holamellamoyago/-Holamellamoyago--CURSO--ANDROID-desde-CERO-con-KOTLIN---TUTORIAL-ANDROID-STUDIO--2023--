package com.example.cursokotlinbasico

fun main() {
    goSushi()
}

fun ifBasico() {
    val name = "bruno";

    if (name.lowercase() == "Aris") {
        println("Esto es una prueba")
    } else {
        println("Esto da la conicion else")
    }
}

fun ifAninado() {
    val animal = "pugg"

    if (animal == "dog") {
        println("El perro es un dog")
    } else {
        if (animal == "cat") {
            println("El animal es un gato")
        } else {
            println("Es un animal desconocido en la BD")
        }
    }
}

fun ifBoolean() {
    var soyFeliz = false

    if (!soyFeliz) {
        println("Estoy triste")
    }
}

fun ifInt() {
    var age = 19

    if (age >= 18) {
        println("Mayor de edad")
    } else {
        println("beber un zumo")
    }
}

fun ifMultipleOR() {
    var pet = "dog"

    if (pet == "dog" || pet == "cat") {
        println("Es un gato o un perro")
    }
}

fun ifMultiple() {
    var age = 18
    var permiso = false
    var feliz = true

    if (age == 18 && permiso && feliz) {
        println("Te dejan")
    } else {
        println("Condicion else")
    }
}

fun goSushi(){
    var quererIr = false
    var desiFea = true

    if (!quererIr && desiFea) {
        println("Vamos sushi")
    } else {
        println("Tomar por saco sushi")
    }

}