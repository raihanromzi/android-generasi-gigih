// like abstract class, but the purpose is to only implement by class
// every child class has to override this function
// can add property but without init

// naming : I__ (interface name)
interface Interface {
    fun fly()
    val wing: Int
}

class Bird(override val wing: Int) : Interface {

    override fun fly() {
        if (wing > 0) println("Flying with $wing wings")
        else println("I'm Flying without wings")
    }
}