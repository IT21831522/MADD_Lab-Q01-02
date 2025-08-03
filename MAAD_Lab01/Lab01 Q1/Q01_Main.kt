fun whoAmI(param: Any) {
    println("Type: ${param::class.simpleName}")
}

fun calculateCircle(radius: Double) {
    val pi = 3.14
    val area = pi * radius * radius
    val circumference = 2 * pi * radius
    println("Area: $area")
    println("Circumference: $circumference")
}

fun greetings(name: String, age: Int) {
    println("Hello, $name!")
    if (age >= 18)
        println("Eligible for driving license.")
    else
        println("Not eligible for driving license.")
}

fun printNames() {
    val names = arrayOf("Sumit", "Sunil", "Kamal", "Nirmal", "Ravi")
    for (i in names.indices) {
        println("Name ${i + 1}: ${names[i]}")
    }
}

fun main() {
    // Task 1
    whoAmI(10)
    whoAmI("Amal")
    whoAmI(3.14)

    // Task 2
    calculateCircle(5.0)

    // Task 3
    greetings("Sunil", 20)
    greetings("Ravi", 16)

    // Task 4
    printNames()
}