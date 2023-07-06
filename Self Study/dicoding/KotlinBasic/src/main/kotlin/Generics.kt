// a concept that allows a class or interface to be a parameter type that can be used for various data types.

// Generic -> a function or class that the return type can be changed a long the way
fun main() {
    // compiler know that the list is String
    val listWithInitialization = listOf("hello", "world")

    // if without initialization compiler have to know what type is it
    val listWithoutInitialization = listOf<String>()

    // Generic <T> -> T is optional it can be any word
    // E -> Element -> collection
    // K -> Key
    // N -> Number
    // T -> Type
    // V -> Value
    // S,U,V

}

// Generic class -> T as Generic type
class MyData<T> (private val data: T) {
    fun getData(): T {
        return data
    }

    // Generic Function
    // using constraint -> limit to only number (int, double, float)
    fun<T : Number> sayHello(param: T): T {
        return param
    }
}