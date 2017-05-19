/**
 * Created by L6ml on 2017/5/19.
 */

fun getStringLengthA(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLengthB(obj: Any): Int? {
    if (obj !is String) {
        return null
    }
    // It is String branch
    return obj.length
}

fun main(args: Array<String>) {
    //  1. I want to pass a function as a argument. How?
    //  2. What the '?:' is?
    fun printLengthA(obj: Any) = println("'$obj' strLen is ${getStringLengthA(obj)?:
            "... err, is empty or not a string at all"} ")
    printLengthA("Incomprehensibilities")
    printLengthA("")
    printLengthA(1000)

    fun printLengthB(obj: Any) {
        println("'$obj' strLen is ${getStringLengthB(obj)?:
                "... err, is empty or not a string at all"} ")
    }
    printLengthB("Incomprehensibilities")
    printLengthB("")
    printLengthB(1000)
}