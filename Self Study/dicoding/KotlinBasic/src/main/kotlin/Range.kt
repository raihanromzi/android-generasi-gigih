fun main() {
    // Range -> Unique data type
    // (..) or rangeTo() & downTo()

    // step
    val range1To10: IntProgression = 1..10 step 2
    println(range1To10.step)

    // rangeTo()
    val rangeInt: IntRange = 1.rangeTo(10)
    println(rangeInt)

    // downTo()
    val rangeIntDown: IntProgression = 10.downTo(1)
    println(rangeIntDown)

    if (7 in rangeIntDown) { // same to this : 1 <= 7 && 7 <= 10
        println("Value 7 available")
    }


}