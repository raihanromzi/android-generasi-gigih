// Animalia doesn't have instance / object but can extend to child

abstract class Animalia(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean) {
    fun eat() {
        println("$name eating !")
    }

    fun sleep() {
        println("$name sleeping !")
    }
}