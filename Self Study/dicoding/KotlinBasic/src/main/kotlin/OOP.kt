import kotlin.reflect.KProperty

// Blueprint

// Attribute / Properties (name, age, job) or Behaviour / function (talk, run)
class Person(
    // primary constructor
    val name: String,
    val age: Int = 0

) {
    // as default properties is mutable -> kotlin will add getter and setter automatically, but we can override it
    var job: String = ""
        // boilerplate -> use delegate technique
        get() {
            println("Getter called")
            // field keyword -> return properties
            return field
        }
        // value -> new value to assign to field / properties
        set(value) {
            println("set called")
            field = value
        }

    // delegate class
    var hobby: String by DelegateName()

    var ageDelegate: Any by DelegateAge() // return type must be same, any -> any

    // init block -> init class properties
    // help to validate property
    // run if using primary constructor
    init {
        this.job = if (job.length == null) "Not Working" else job
    }

    // secondary constructor -> must be different from primary -> if we add fav movie to constructor, the second will executed
    private var favMovie: String = ""
    constructor(name: String, age: Int, favMovie: String) : this(favMovie) {
        this.favMovie = favMovie
    }

    fun sayHello() {
        println("Hello from $name")
    }

}

// delegate
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
        println("This is like getter ${property.name} from class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("This is like setter ${property.name} from class $classRef")
        println("Value ${property.name} from: $value will changed to $newValue")
        value = newValue
    }

}

class DelegateAge {
    private var value: Any = ""

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("This is like getter ${property.name} from class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any){
        println("This is like setter ${property.name} from class $classRef")
        println("Value ${property.name} from: $value will changed to $newValue")
        value = newValue
    }

}

// Extension Property -> Add extension to property -> getter setter
val Person.getPersonInfo : String
    get(): String = "Person Info ${this.name}" // expression body


fun main() {
    val person: Person = Person("John", 20)
    person.sayHello()

    // getter
    println(person.job)

    // setter
    person.job = "Programmer"
    println(person.job)

    // delegate class
    person.hobby = "Gaming"
    println(person.hobby)

    println(person.getPersonInfo)
}