fun main() {
    // Double, Long, Int, Short, Byte

    // 32 Bit
    // MAX_VALUE + 1 lead to overflow
    val intNumber: Int = Int.MAX_VALUE

    // 64 Bit
    // Suffix (L)
    val longNumber: Long = Long.MAX_VALUE
    val longNumberSuffix = 100L

    // 16 Bit
    val shortNumber: Short = Short.MAX_VALUE

    // 8 Bit
    val byteNumber = 0b11010010

    // 64 Bit
    val doubleNumber: Double = 1.3

    // 32 Bit
    val floatNumber: Float = 0.12345679f

    // Operator -> +, -, *, /, %

    // Casting -> conversion using help of function
    // toInt(), toByte(), toShort(), toLong(), toFloat(), toDouble(), toChar()
    val byteNumberConvert: Byte = 10
    val intNumberResult: Int = byteNumber.toInt()
    println(intNumberResult)

    // Readable (_)
    val oneMillionDollar: Int = 1_000_000
    println(oneMillionDollar)
}