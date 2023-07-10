fun main() {
    // Enum
    val red: Color = Color.RED
    println(red)

    println(Color.BLUE.printValue())

    // Synthetic method enum
    // values() -> Get all enum object list
    val colors: Array<Color> = Color.values()
    colors.forEach { color: Color -> println("$color") }

    // valueOf()
    // can cause IllegalArgumentException -> argument in valueOf() not match in enum
    val color: Color = Color.valueOf("RED")
    println("Color is $color")

    // value -> Get property
    println("Color value is ${color.value.toString(16)}")

    // enumValues(), enumValueOf()
    val colorsEnumValues: Array<Color> = enumValues()
    colorsEnumValues.forEach { colorEnumValues: Color -> println("$colorEnumValues") }

    val greenColor: Color = enumValueOf("GREEN")
    println("Color is $greenColor")

    // Ordinal -> Get index
    println("${color.ordinal}")


    // Can use when to check all instance of enum
    // Better input all the enum, if not can cause error "'when' expression on enum is recommended to be exhaustive"
}

// Enum -> Same as array, but it's constant
// Static and Final
// We cannot change it
enum class Color(val value: Int) {
    // if we want to initialize the value -> Set the parameter
    RED(0xFF0000) {
        override fun printValue() {
            TODO("Not yet implemented")
        }
    },

    GREEN(0x00FF00) {
        override fun printValue() {
            TODO("Not yet implemented")
        }
    },

    // Can add abstract function and anonymous class
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}