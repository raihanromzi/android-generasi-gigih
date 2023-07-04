fun main() {
    // NullPointerException -> when we access null variable or no initialization variable
    // Nullable -> avoid NullPointerException

    // val text: String = null // (ERROR)

    // if a variable wants to have null, using (?)
    val text: String? = null
    //val textLength = text.length // compile time error

    if (text != null){
        val textLength = text.length // ready to go
    } else {
        println("Text is null")
    }

    // Safe Call Operator (?.)
    // Guarantee our code is safe from NullPointerException
    var textLength = text?.length

    // Elvis Operator (?:)
    // Default value when null
    textLength = text?.length ?: 7
    println("Text default length is $textLength")

    // Non-null assertion (!!)
    // access value from nullable object
    // But if the object is still null, there is NullPointerException
    println("We force to use nullable object ${text!!.length}")
}