// Scope function -> write logic in object context -> let, run, with, appy

fun main() {
    // Lambda receiver (this)
    val buildString = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }

    // Lambda Argument (it)
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

    println(text)

    // more to explore : run, with, apply, let, also
    // https://github.com/JetBrains/kotlin/blob/master/libraries/stdlib/src/kotlin/util/Standard.kt

    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }
}

