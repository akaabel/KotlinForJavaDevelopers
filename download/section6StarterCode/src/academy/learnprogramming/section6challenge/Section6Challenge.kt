package academy.learnprogramming.section6challenge


fun main(args: Array<String>) {

    // using a range, print 5, 10, 15, 20, 25... 5000, each number
    // on a separate line

    // using a range, -500..0, each number on a separate line

    // using a range, print the first 15 numbers in the
    // Fibonacci sequence, each
    // number on a separate line
    // Hint: you'll have to print the first one or two numbers
    // outside the range
    // 0, 1, 1, 2, 3, 5, 8...

    // Modify the following code so that it prints the following,
    // each number on a separate line
    // 1, 11, 100, 99, 98, 2
    for (i in 1..5) {
        println(i)
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
            }
        }
    }



    // Declare a variable called num (int) and assign it whatever you want

    // Declare a variable called dnum (double) and assign it as follows:
    // if num > 100, assign dnum -234.567
    // if num < 100, assign dnum 4444.555
    // if num == 100, assign dnum 0.0
    // do all of the above (declaring dnum and assigning
    // it) in one statement/expression

    // Then print the value of dnum - separate statement

}