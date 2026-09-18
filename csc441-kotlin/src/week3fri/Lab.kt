package week3fri

fun main() {
    for (i in 1..5) { print(" $i") }
    println()

for (i in 20 downTo 1 step 3) { print(" $i") }
    println()

    val tripList = mutableListOf("Backpack", "Phone", "Earbuds", "Money")
    for (item in tripList ) {
        println(item)
    }
for ( i in 0  until tripList.size)
    println(i)
tripList.forEachIndexed { index, item ->
    println("$item")
}
for ( i in 0 until tripList.size) {
    println("$i is ${tripList[i]}")
}

val num = 1
when (num) {
    1 -> println("Monday")
    2 -> println("Tuesday")
    3 -> println("Wednesday")
    4 -> println("Thursday")
    5 -> println("Friday")
    6 -> println("Saturday")
    7 -> println("Sunday")
    else -> println("Out of range")
}
val size = 2
val label = if ( size > 50) "Large" else "Small"
    println(label)







}