package week4fri

fun main() {
    println("--- Two names ---")
    val aName: String = "Anthony"
    val anotherName: String?  = null
    println(aName.length)
    println(anotherName?.length)
    println("--- A safe call ---")
    println(anotherName?.length)

    println("--- The Elvis operator ---")
    println(anotherName?.length ?: 0)

    println("--- A ?. let block ---")
    anotherName?.let {
        println("this name is $it")
    }
    aName?.let {
        println("this name is $it")

    }
    println("--- toIntOrNull() ---")
    val notNum = "number".toIntOrNull()
    println(notNum ?: "That isn't a number")

    println("--- Alistof ---")
    val aList = listOf("a", "b", "c", "d")

    println(aList)
    println("--- A mutableListOf ---")
    val mutList = mutableListOf("a", "b", "c", "d")
    mutList.add("e")
    mutList.remove("b")
    println(mutList)
    println(mutList.size)
    println("--- A list of numbers ---")
    val nums = listOf<Int>(1, 2, 3, 4, 5)
    println(nums.sum())
    println(nums.average())
    println(nums.filter{ it >= 3})
}


