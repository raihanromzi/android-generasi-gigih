fun main() {
    // Named Parameter -> first = "John"
    // parameter can mixed position
    val fullName: String = getFullName(middle = "Doe", last = "Mark", first = "John")

    val sum10Numbers = sumNumbers(1, 2, 3, 4, 5)
    println(sum10Numbers)


}

// Default Parameter
fun getFullName(first: String = "Bark", middle: String, last: String): String {
    return "$first $middle $last"
}

// Vararg -> add as many parameter with same data type
// parameter as array -> all item in Array<out T>
fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

// only one parameter vararg in one function
// fun sumNumbers(vararg number: Int, vararg number2: Int) // Error

// vararg -> last element
// if parameter vararg at first, another parameter use named
// sets(10, 10, name = "Kotlin")

// Spread operator (*) -> Extract array
// val number = intArrayOf(10, 20, 30, 40)
// sets(10, 20, 20, *number , 10)

// Extension
// Int class -> Final -> We cannot inherit from or add new feature
//class NewInt : Int(){
//    fun printInt(){
//        println("value $this")
//    }
// }

// Extension -> Extension Function (add new function to object), Extension Properties (add new properties)
/*
    Receiver type -> Int, this -> Object
    fun Int.printInt() {
        print("value $this")
    }

    How to call this -> 10.printInt()

    fun Int.plusThree(): Int {
        return this + 3
    }
    println(10.plusThree())

*/

// Extension Properties
// This only add new feature to class
// add getter and setter
val Int.slice: Int
    get() = this / 2
fun extensionProperties() {
    println(10.slice)
}

// Nullable Receiver
// Int? -> it can be nullable
val Int?.slice: Int
    // this?. -> Safe guarantee -> is this.div is not null?
    get() = this?.div(2) ?: 0 // ?: 0 -> if null, then assign 0 to this -> automatically casting to non-null