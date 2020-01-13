package academy.learnprogramming.section6challenge

fun main() {
    // Exercise 1
//    for (i in 5..5000 step 5)
//        println(i)

    // Exercise 2
//    for (i in -500..0)
//        println(i)

    // Exercise 3
//    var first = 0
//    var second = 1
//    println("0")
//    println("1")
//    for (i in 2..15) {
//        val newVal = first + second
//        println(newVal)
//        first = second
//        second = newVal
//    }

    // Exercise 4
//   for (i in 1..5) {
//        println(i)
//        if (i == 2) {
//            break
//        }
//        for (j in 11..20) {
//            println(j)
//            for (k in 100 downTo 90) {
//                println(k)
//                if (k == 98) break
//            }
//            if (j == 11) break
//        }
//    }

    // Exercise 5
    val num : Int = 99
    val dnum = when (num) {
        in 101..Integer.MAX_VALUE -> -234.567
        in Integer.MIN_VALUE..99 -> 4444.555
        else -> 0.0
    }
    println(dnum)
}