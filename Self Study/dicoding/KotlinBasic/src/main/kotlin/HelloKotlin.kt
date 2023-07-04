// Kotlin naming file : PascalCase
// Java and Kotlin are Interoperability (Means can be combined) -> At the end Convert to Java ByteCode
// How kotlin works :
// Kotlin code -> JDK (Kotlin compiler) -> Java Bytecode -> JVM -> Mac, Linux or Windows

// main() is entry point that automatically called when kotlin running
fun main() {
    val name = "Bob"

    // println and print internally called "system.out.print(message)"
    println("Hello Kotlin!")
    print("Hello my name is ")
    println(name)

    print(if (true) "Always true" else "Always false")
}
