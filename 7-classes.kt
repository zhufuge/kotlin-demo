class Invoice {

}

class Empty

//class Person constructor(firstName: String) {}

class Person(
        firstName: String,
        val lastName: String = firstName + 's',
        var age: Int
) {
    init {
        println("I'm $firstName")
        age++
    }

    val upperCase = this.lastName.toUpperCase() + " " + age
}

fun main(args: Array<String>) {
    val l = Person("Lambda", age = 18)
    val u = l.upperCase
    println(u)
    println(l.age)
    println(l.lastName)
}