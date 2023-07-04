fun main() {
    println(sayHello("John"))
    println("10 + 10 = ${addNumbers(10,10)}")
}

// Kotlin file name -> PascalCase
// Kotlin function name -> camelCase

// Function in kotlin always return something
fun sayHello(name: String): String {
    return "Hello $name"
}

// if there is only one expression use expression body (=)
// with expression body return type is not important
fun addNumbers(num1: Int, num2: Int): Int = num1 + num2

// if function not return anything, return uint but kotlin want us to remove because it redundant
// fun thisFunctionOnlyPrint():Uint
fun thisFunctionOnlyPrint() {
    println("Not return anything!")
}