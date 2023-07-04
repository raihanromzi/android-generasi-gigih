fun main() {
    // && (and), || (or), ! (not)

    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed
    val isClose = now < officeOpen || now > officeClosed

    println("Office is open : $isOpen")
    println("Office is open : $isClose")
}