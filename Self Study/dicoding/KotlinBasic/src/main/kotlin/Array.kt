fun main() {
    // Array is a class (arrayOf) -> get, set, size
    val array = arrayOf(1, 3, 5, 7)
    val mixArray = arrayOf(1, "Hello", 'a', true)

    // Array for specific data type
    // intArrayOf(), booleanArrayOf(), charArrayOf(), longArrayOf(), shortArrayOf(), byteArrayOf()
    val intArray = intArrayOf(1, 2, 3)

    println(intArray[2])

    intArray[0] = 4

    println(intArray[0])

    // val mean immutable, but we can change the array using index, but we cannot do reassign
    // intArray = intArrayOf(4,5,6)
}