fun main() {
    // Val or Var
    // identifier must be unique
    // Kotlin support type interface so Type is not important
    // var identifier: Type = initialization
    var company: String = "Google"

    // Var is mutable, it can be change
    company = "Microsoft"

    // Val is immutable, cannot be change
    val unchangedCompany: String = "Netflix"
    // unchangedCompany = "Disney" -> Error
}