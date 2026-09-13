package week3fri

fun main() {
    for (i in 1..5) {
        print("$i ")
    }
    println()
    for (letter in 'a' .. 'e') {
        print("$letter")
    }
    println()

    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    for (i in 0..100 step 25) {
        print("$i")
    }
    println()

    val shoppingList = mutableListOf("milk","bread","coffee")
    for (item in shoppingList) {
        println(item)
    }
    for ((index, item) in shoppingList.withIndex()) {
        println("$index: $item")
    }

    shoppingList.forEachIndexed { index, item ->
        println("$index is $item")
    }
    val day = "day"
    when (day) {
        "Monday" -> println("5 days till the weekend")
        "Tuesday" -> println("4 days till the weekend")
        "Wednesday" -> println("3 days till the weekend")
        else -> println("weekend is close")
    }
    val age = 40
    val amIO1d = when (age) {
        in 1..50 -> false
        in 20..100 -> true
        else -> true
    }
    println(amIO1d)
    val years = 10
    val level = if (years > 20) "Senior" else "Junior"
    println(level)

}
