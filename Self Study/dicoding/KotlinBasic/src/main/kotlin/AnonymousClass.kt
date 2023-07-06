interface IFly {
    fun fly()
    val numberOfWings: Int
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

fun main() {
    // object keyword
    flyWithWings(object : IFly {
        override fun fly() {
            if(numberOfWings > 0) println("Flying with $numberOfWings wings")
            else println("I'm Flying without wings")
        }
        override val numberOfWings: Int
            get() = 2
    })
}