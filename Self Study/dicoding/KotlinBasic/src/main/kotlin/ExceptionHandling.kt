fun main() {
    val someNullValue: String? = null
    var someMustNotNullValue: String? // init later

    try {
        someMustNotNullValue = someNullValue!! // force to access null variable then exception invoke
        println(someMustNotNullValue)

    } catch (_: NullPointerException) {
        someMustNotNullValue = "String Null"
        println(someMustNotNullValue)
    } catch (e: Exception) {
        // multiple catch
    } finally {
        println("Always executed")
    }
}