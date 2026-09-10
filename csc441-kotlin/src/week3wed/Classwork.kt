package week3wed

fun main() {
    println("---Step 1 - main and output---")
    println("csc 441")
    println("Kotlin, first day")

    println("---Step 2 - val and var---")
    val course = "CSC 441"
    var weekNumber = 3

    weekNumber += 1

    println(course)
    println(weekNumber)


    println("---Step 3 - the four basic types")
    val name = "Anthony"
    val age: Int = 21
    val gpa = 3.75
    val learning = true

    println(name)
    println(age)
    println(gpa)
    print(learning)


    println("---Step 4 - String templates")
    println("$name teaches $course")
//    println(name + "" + "teaches" + " " + course)
//    println(name + "teaches" + course)
    println("Next year: ${age + 1}")
    println(" name length: ${name.length}")
    println("---Step 5: Reading input---")
    print("what's your name? ")


    val yourName = readlnOrNull()
    println("Hello, $yourName")
}