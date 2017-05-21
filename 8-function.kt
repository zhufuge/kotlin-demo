infix fun Array<Int>.dot(another: Array<Int>): Int {
    if (this.size != another.size) throw IllegalAccessError("It isn't same shape")
    return this.foldIndexed(0, { i, sum, v -> sum + v * another[i] })
    // reduceIndexed start at 1 not 0  @A@#
}

fun main(args: Array<String>) {
    val a: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val b: Array<Int> = arrayOf(2, 3, 4, 5, 6)
    println(a dot b)
    println((1..5).sumBy { it * (it + 1) })

    println(asList(1, 2, 3, "abmi", *a))
}

fun <T> asList(vararg ts: T): List<T> {
    return ts.toList()
}