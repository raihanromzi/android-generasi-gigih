fun main() {
    val openHours = 7
    val now = 20

    if (now > openHours) {
        println("office already open")
    } else {
        println("office is closed")
    }

    // "if" is an expression, so it can return value
    // same as other -> if, else if, else

    // joined declaration
    val office: String = if (now > openHours) {
        "office already open"
    } else {
        "office is closed"
    }
    println("Office as expression : $office")

    // Kotlin support ternary too
}

