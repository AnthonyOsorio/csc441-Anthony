package week4wed

fun main() {

println("---describeToday function---")
describeToday()
println("---favouriteThing function---")
println(favouriteThing())

println("---pickOne function---")
println(pickOne( number = 1))

println("---pickOneShort function---")
println(pickOneShort( number = 1))
println("---pickWithDefault function---")
println(pickWithDeafult(number = 0, name = "Anthony"))
}



fun describeToday() {
    println("Food is great")

}
fun favouriteThing(): String {
    return "Pizza"

}
fun pickOne(number: Int): String {
    return when (number) {
        1 -> "pizza"
        2 -> "burger"
        3 -> "fish"
        4 -> "steak"
        else -> "unkown"
    }
}
fun pickOneShort (number: Int): String = when (number) {
        1 -> "pizza"
        2 -> "burger"
        3 -> "fish"
        4 -> "steak"
        else -> "unkown"
    }
fun pickWithDeafult(number: Int = 1, name: String = "you"): String {
    return when (number) {
        1 -> "$name likes pizza"
        2 -> "$name likes burger"
        3 -> "$name likes fish"
        4 -> "$name likes steak"
        else -> "$name is undecisive"
    }
}