fun main() {
    // Statement -> Not returning value
    val openOffice = 7
    val now = 8
    if (now > openOffice) // if as statement
        print("Office already open")
    else
        print("Office close")

    // Expression -> Returning value
    val office = if (now > openOffice) "Office already open" else "Office close" // if as expression
    print(office)
}