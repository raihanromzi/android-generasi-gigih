// Class that use for data container -> Reduce boilerplate
// Has no logic or functionality other than data

// keyword data -> to tell this is contain data

// with this keyword compiler created -> constructor, toString(), equals(), hasCode(), copy(), componentN()
// at least one parameter

// using val or var
// modifier cannot be -> abstract, open, sealed, inner

// We can add behaviour
data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println("Hello, i'm $name, i'm $age y.o")
    }
}

// ordinary class
class ClassUser(private val name: String, private val age: Int) {
    // with data class we don't have to do this!
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

fun main() {
    val dataUser1: DataUser = DataUser("John", 20)
    val dataUser2: DataUser = DataUser("John", 20)
    val classUser: ClassUser = ClassUser("Bob", 20)

    println("Data User $dataUser1") // DataUser(name=John, age=20) -> auto toString() so we can see the value
    println("Class User $classUser") // ClassUser@668bc3d5 -> package.ClassName@MemoryAddress

    // Built-in equals
    println("is Equal? ${dataUser1.equals(dataUser2)}")

    // when using ordinary class equals always false -> because refer to memory

    // Built-in copy
    val dataUser4: DataUser = dataUser1.copy(name = "Jane", age = 21)
    println(dataUser4)

    // Destructuring Declaration -> componentN()
    // extract object in class to variable
    val nameComponent1: String = dataUser4.component1()

    println("My name is $nameComponent1")

    val (name, age) = dataUser4
    println("My name is $name, age $age")

    dataUser4.intro()

}