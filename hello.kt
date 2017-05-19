/**
 * Created by L6ml on 2017/5/19.
 */

fun main(args: Array<String>) {
    val a = 2
    var b: Int = 3
    b += 1
    println("Hello kotlin!")
    println("$a + $b = ${sum(a, b)}")
}

fun sum(a: Int, b: Int) = a + b