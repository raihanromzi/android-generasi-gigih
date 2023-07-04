fun main() {
    // String(""), Char('')
    var charA: Char = 'A'

    // Decrement and Increment char -> Every char represent unicode -> A (0041) -> B (0042)
    println("Vocal " + charA++)
    println("Vocal " + charA++)

    // String template ($)
    println("Vocal $charA")
}