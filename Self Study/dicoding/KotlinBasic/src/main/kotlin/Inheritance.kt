// Super or Parent class -> Need Open Class
// class default is Final -> so we change to open before extend
open class Animal(
    private val name: String,
    private val weight: Double,
    private val age: Int,
    private val isCarnivore: Boolean
) {

    open fun eat() {
        print("${this.name} can eat!")
    }

    open fun sleep() {
        print("${this.name} can sleep!")

    }

}

// Child class
class Cow(
    private val pName: String,
    private val pWeight: Double,
    private val pAge: Int,
    private val pIsCarnivore: Boolean
) : Animal(pName, pWeight, pAge, pIsCarnivore) {
    fun playWithHuman() {
        println("$pName play with human !")
    }

    override fun eat() {
        println("$pName eating grass !")
    }

    override fun sleep() {
        println("$pName is sleeping !")
    }

    // Overloading -> use same name for function
    fun eat(food: String) {
        println("$pName eating $food")
    }
}