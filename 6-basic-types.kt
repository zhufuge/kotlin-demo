fun main(args: Array<String>) {
//    Number
//     Note that characters are not numbers in kotlin.

//    val d: Double = 64.00
//    val f: Float = 32.0F // 32.0f
//    val l: Long = 64L
//    val i: Int = 32
//    val s: Short = 16
//    val b: Byte = 8

//    val hex = 0x0F
//    val bin = 0b00000010

// underscores in numeric literals (since 1.1)
//    val oneMillion = 1_000_000
//    val r = 123_12_12345_1L

    val a: Int = 2010
    println(a === a) // true
    println(a == a) // true
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // false
    println(boxedA == anotherBoxedA) // true

    val b: Int? = 1
//    val c: Long? = b  // Error
//    val c: Byte? = b  // Error
//    val c: Byte = b.toByte() // Error

    val i: Byte = 1
    val j: Int = i.toInt()

//    Characters
//    val c: Char = 1 // Error
    val c: Char = '1'
    val int: Int = c.toInt()

//    Booleans

//    Array

    val src = Array(5, { i -> (i * i).toString() })
    for (si in src) {
        print(si + ", ")
    }

    val intArr: IntArray = intArrayOf(1, 2, 3)
    intArr[0] = intArr[1] + intArr[2]
    println("${intArr[0]}")

//    String
    val s: String = "hello-kotlin"
    print(s[2])
    for (si in s) {
        print(" " + si)
    }
}