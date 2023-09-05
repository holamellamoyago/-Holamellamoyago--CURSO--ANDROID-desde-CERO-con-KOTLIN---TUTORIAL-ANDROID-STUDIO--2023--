package com.example.cursokotlinbasico.exercises

/** fun main() {
val morningNotification = 51
val eveningNotification = 135

printNotificationSummary(morningNotification)
printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
// Fill in the code.
} **/

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages <= 100){
        println("Tu telefono tiene $numberOfMessages notificaciones")
    } else{
        println("Your phone is blowing up! You have 99+ notifications.")
    }

}

/**
 *     when (numberOfMessages){
 *         in 1..100 -> println( "Tu telefono tiene: $numberOfMessages notificaciones")
 *         else -> println("Your phone")
 *     }
 */




