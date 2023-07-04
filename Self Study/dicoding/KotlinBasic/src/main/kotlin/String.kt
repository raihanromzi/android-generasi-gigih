fun main() {
    // String ("") -> Array of char
    val textString: String = "This is String using double quote"

    // using Indexing to get char from string
    // template $ or ${}
    println("First character is ${textString[0]}")
    println("This is string template using if else : ${if (textString[0] == 'L') "it's L" else "it's not L"}")

    // using loop to access index
    for (char in textString) {
        print("$char ")
    }
    println()

    // Literal String -> Escaped String and Raw String
    // Escaped String -> \n, \t, \', \", \\
    val escapedString: String = "This is \"escaped string!\" "
    println(escapedString)

    val unicodeEscapedString: String = "Unicode : \u00A9"
    println(unicodeEscapedString)

    // Raw String -> Triple quote
    val line: String = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    println(line)
}