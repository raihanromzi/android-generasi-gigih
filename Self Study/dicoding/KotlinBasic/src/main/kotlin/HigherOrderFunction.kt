// when using lambda, sometimes compiler doesn't what is the return type
// parameter -> return type
// (Int) -> Int
var sumLambda: (Int) -> Int = { value -> value + value }

// Higher order function -> function as parameter
fun result(value: Int, sum: (Int) -> Int): Int {
    return sum(value)
}

fun main() {
    val resultSum = result(10, sumLambda)
    println(resultSum)

    val resultSumExplicit = result(10) {value -> value + value}
    println(resultSumExplicit)
}

// Higher order function make program slow
// use inline -> compile lambda expression on a function
// inline is like photocopy machine -> it need space and resource too
inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}