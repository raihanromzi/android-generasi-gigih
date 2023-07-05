import org.w3c.dom.ranges.Range
import kotlin.random.Random

fun main() {
    // When is expression -> Returning value
    // Like switch
    val value = 7

    when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    // When can return value
    val stringOfValue: String = when (value) {
        6 -> "it's 6"
        7 -> { // can use {}
            println("7")
            "it's 7"
        }

        // Check instance data type
        is Int -> "this is integer"
        !is Int -> "not integer"

        8 -> "it's 8"

        // else is important -> avoid error
        else -> "Nothing"
    }

    println("$stringOfValue, value is $value")


    // Range / Collection -> Unique data type -> we can defined start / end value
    // Range, IntRange, etc
    val valueInRange = 3
    val ranges: IntRange = 1..5

    val result: String = when (valueInRange) {
        in ranges -> "in range"
        !in ranges -> "not in range"
        else -> "value in not in range"
    }

    println(result)

    // When expression can catch value from another func
    val registerNumber = when (val regis = getRegisterNumber()) {
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println(registerNumber)
}

fun getRegisterNumber(): Int = Random.nextInt(100)