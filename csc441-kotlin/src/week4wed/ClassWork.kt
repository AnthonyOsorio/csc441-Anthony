package week4wed

fun main() {
    println("---Step 1: function returning nothing---")
    todaysExcercise()
    println("---Step 2: function returning a value---")
    println(todaysExcercise1())
    println("---Step 3: a parameter---")
    println(todaysExcercise2( dayNumber = 3))
    println(todaysExcercise2( dayNumber = 9))
    println("---Step 4: the short form---")
    //println(todaysExcercise3( dayNumber = 4))
   //println("---Step 5: a default value---")

    //println(todayExcercise4())
    //println(todayExcercise4( dayNumber = 2))

    println("---Step 6: two parameters, and nothing them ---")
    println(todaysExcercise5(dayNumber = 2, name = "Anthony"))


}


fun todaysExcercise() {
    println("Push-ups")
}

fun todaysExcercise1(): String {
    return "Push-ups"
}

fun todaysExcercise2(dayNumber: Int): String {
    return when (dayNumber) {
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Cycling"
        5 -> "Gym"
        else -> "Rest day"
    }
}
//fun todaysExcercise3(dayNumber: Int): String = when (dayNumber)  {

//}
//fun todaysExcercise4(dayNumber: Int = 1): String = when (dayNumber) {

//}
fun todaysExcercise5(dayNumber: Int= 1, name: String = "you"): String{
    val excercise = when (dayNumber) {
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Gym"
        5 -> "Cycling"
        else -> "Rest day"
    }
    return excercise

    }

