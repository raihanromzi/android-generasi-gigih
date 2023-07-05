// Component that can
// Add, Delete, Search, Sort data

// Collection -> Object that can save another object -> Eager evaluation -> Evaluate all item
// Sequence -> Lazy evaluation -> evaluate when only needed


fun main() {
    // List, Set, Map

    // List -> Immutable -> Cannot change
    val numberList: List<Int> = listOf<Int>(1, 2, 3, 4)
    // val listManyNumber = (1..100000).toList() // this will take a lot of time -> using sequence

    // Compiler can automatically detect
    val numberList2 = listOf(1, 2, 3, 4)
    val charList = listOf('a', 'b')

    // Every class in kotlin are child of class Any
    val anyList = listOf<Any>('a', "hello", 1, true)
    // anyList[1] = "New" // Error (List is Immutable)

    // Indexing
    println(anyList[1])

    // Mutable List -> Mutable
    val anyListMutable = mutableListOf('a', "Kotlin", 3, true)

    anyListMutable.add('d') // add item at the end
    anyListMutable.add(1, "love") // add item at index 1
    anyListMutable[3] = false // change item at index 3
    anyListMutable.removeAt(0) // delete item at index 0


    // Set -> Unique Value
    // order is not important
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet) // the duplicate will removed

    // in
    println(5 in integerSet)

    // Union and Intersect
    val setC = setOf(1, 5, 7)
    val unionSet = integerSet.union(setC)
    val intersectSet = integerSet.intersect(setC)

    println(unionSet) // combine
    println(intersectSet) // find unique

    // Map -> like Object in JS -> key-value
    val capital: Map<String, String> = mapOf<String, String>(
        // key to value
        // key in map should be unique
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New York" to "USA"
    )

    println(capital["Jakarta"]) // if not found -> null
    println(capital.getValue("Jakarta")) // if not found -> Exception

    val keys: Set<String> = capital.keys
    println(keys)

    val mapValues = capital.values
    println(mapValues)

    // to add key-value to map -> map that mutable
    // not recommended because the result hard to predict -> so use immutable map
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    // Collection Operator
    // Filter -> create new list
    val numberList3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList3.filter { num -> num > 3 }
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    // map -> make new collection than the result is * 5
    val multipliedBy5 = numberList.map { it * 5 }

    // count -> we can pass lambda -> count that divided by 3
    print(numberList.count { it % 3 == 0 })

    // find(), firstOrNull(), lastOrNull() -> return null if not find
    // 'find' and firstOrNull return first element that match condition
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

    // first(), last() -> filter first or last item
    val moreThan10 = numberList.first { it > 1 }

    // sum()
    val total = numberList.sum()

    // sorted() -> Ascending or descending
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()


    // Sequence
    val list = (1..1000000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) } // trigger lazy evaluation (asSequence)

    // has 2 parameter
    // first parameter -> first item
    // second parameter -> lambda expression that will affect to all item
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}