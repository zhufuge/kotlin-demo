fun describe(obj: Any): String =
        // Just one export
        when (obj) {
            1 -> "One"
            "apple" -> "apple"
            is Long -> "Long"
            is Int -> "Int, but not 1"
            !is String -> "Not a String"
            else -> "Unkown"
        }

fun main(args: Array<String>) {
    val items = listOf<String>("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println(items[index])
    }

    var index = 0
    while (index < items.size) {
        println(items[index++])
    }

    println(describe(1))
    println(describe(items[0]))
    println(describe(1000L))
    println(describe(2))
    println(describe(2.134))
    println(describe("other"))
}