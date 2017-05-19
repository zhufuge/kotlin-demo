/**
 * Created by L6ml on 2017/5/19.
 */

fun parseInt(str: String) : Int? {
/*
 *    val a = str.toInt() // It will throw a NumberFormatException
 *    return if (a is Int) a else null
 */
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        println("One of the arguments isn't Int")
    }
    return null
}

fun printProduct(arg1: String, arg2: String = "b") : Unit {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

fun main(args: Array<String>) {
    printProduct("2", "3")
    printProduct("2")
    printProduct("a", "b")
}