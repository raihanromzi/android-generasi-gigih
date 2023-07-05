fun main() {
    // While -> Entry controlled loop
    var counter = 1
    while (counter <= 7) {
        println("Hello, World!")
        counter++
    }

    // Do While -> Exit controlled loop
    counter = 1
    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)

    // For
    // Range, Array, Collection
    val range = 1..5 step 1 // return IntProgression
    for (i in range) {
        println(i)
    }

    for (i in 1..5 step 3) {
        println(i)
    }

    // With index
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    // foEach -> lambda expression
    ranges.forEach {value ->
        println(value)
    }

    // use _ to not using argument (value in this example)
    ranges.forEachIndexed { index, _ -> println("Index $index Value")  }

    // Continue and Break
    // Continue -> Skip to next iteration
    // Break -> Exit loop

    // Break and Continue Label (@) -> foo@, bar@, loop@
    loop@ for (i in 1..5) {
        println("Outside Loop")

        for (j in 1..5) {
            if (j % 2 == 0 ) break@loop // it will back to @loop label
            println("Inside Loop")
        }
    }

}