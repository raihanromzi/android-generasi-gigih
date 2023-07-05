fun main() {
    // Instance
    val sumResult1 = sum?.invoke(10, 10)
    val sumResult2 = sum?.let { it(10, 10) }

    val nullableMultiplyResult = multiply?.invoke(10, 10)
}

// function type -> give data type to function
typealias Arithmetic = ((Int, Int) -> Int)? // nullable

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }