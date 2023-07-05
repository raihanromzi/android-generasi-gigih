// Lambda Expression -> Anonymous function / function literal
// not having name -> but have parameter, body, return type

// Lambda rule:
// not using fun and modifier (public, private)
// return type is automatic by compiler
// parameter is in {}
// lambda expression can be in parameter or variable

val comparatorNotUsingLambda = object : Runnable {
    override fun run() {
        TODO("Not yet implemented")
    }
}

// fun (X), type return (X)
val comparatorWithLambda = Runnable { TODO("Not yet implemented") }

// parameter -> inside {}
// Syntax: parameter -> body
val message = { message: String -> println("Hello $message") }

val lambdaReturn10 = { 10 }

fun main() {
    message("World")
    println(lambdaReturn10())
}

// Lambda receiver -> kotlin as DSL (Domain specific language) -> Gradle, SQL