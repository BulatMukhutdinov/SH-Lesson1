@file:Suppress(
    "unused",
    "UNUSED_VARIABLE",
    "RedundantExplicitType",
    "UNUSED_VALUE",
    "ConvertToStringTemplate",
    "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE",
    "KotlinConstantConditions",
    "IfThenToElvis",
    "SENSELESS_COMPARISON",
    "CanBeVal"
)

package tat.mukhutdinov.kotlinBasics

import java.util.Arrays

fun main() {
    printHello()
}

/**
 * * The fun keyword designates a function, followed by the name.
 *
 * * As with other programming languages, the parentheses are for function arguments,
 * if any, and the curly braces frame the code for the function.
 *
 * * There is no return type because the function doesn't return anything.
 *
 * * Note that there are no semicolons at the ends of lines.
 * If you're used to adding them, that's OK. You can either add them or leave them out.
 */
fun printHello() {
    println("Hello World!")
}

/**
 * # Operators
 *
 * |  |  |
 * |-------|----------|
 * | Mathematical operators | - * / %
 * | Increment and decrement operators | ++ --
 * | Comparison operators | < <= > >=
 * | Assignment operator | =
 * | Equality operators | == !=
 */
fun operators() {
    // Integers
    val plus: Int = 1 + 1
    val minus: Int = 53 - 3
    val times: Long = 1 * 1
    val division: Long = 50 / 10
    val remainder: Long = 9 % 3

    // Doubles
    val timesDouble: Double = 4.0 * 3.2
    val divisionDouble: Float = 9f / 3
}

/**
 * # Math operators
 *
 * Notice that all number types start with an initial cap (Int, Long, Double, etc).
 * Although they may not be objects in the internal representation,
 * they are objects in the sense that we can call member functions and properties on them,
 * and Kotlin represents objects using initial caps.
 */
fun objects() {
    val a: Int = 4
    val b: Int = 5
    val c: Int = a.plus(b)
}

/**
 * # Numeric operator methods
 *
 * Kotlin keeps numbers as primitives, but lets you call methods on numbers as if they were objects.
 */
fun numericOperators() {
    val a: Int = 2.times(3)
    val b: Double = 3.5.plus(4)
    val c: Double = 2.4.div(2)
}

/**
 * # Data types
 *
 * | Type | Bits | Notes |
 * |----------|----------|----------|
 * | Long | 64 | From -2^63 to 2^63-1 |
 * | Int | 32 | From -2^31 to 2^31-1 |
 * | Short | 16 | From -32768 to 32767 |
 * | Byte | 8 | From -128 to 127 |
 * | Double | 64 | 16 - 17 significant digits |
 * | Float | 32 | 6 - 7 significant digits |
 * | Char | 16 | 16-bit Unicode character |
 * | Boolean | 8 | True or false |
 *
 */
fun operandTypes() {
    // Results of operations keep the types of the operands, so 1/2 = 0, but 1.0/2.0 = 0.5.
    val a: Int = 1 / 2
    val b: Double = 1.0 / 2.0
}

/**
 * # Type casting
 *
 * Kotlin does not implicitly convert between number types,
 * so you can't assign a **Short** value directly to a **Long** variable, or a **Byte** to an **Int**.
 *
 * Implicit number conversion is a common source of errors in programs,
 * but you can avoid that by assigning values of different types with casting.
 *
 * Here we create a variable and first show what happens if you try to reassign it with a type mismatch.
 * We then use **toByte()** to cast it and print it without errors.
 */
fun typeCasting() {
    // Assign an Int to a Byte
    val i: Int = 6
    // TODO uncomment
//    val b: Byte = i // ⇒ error: type mismatch: inferred type is Int but Byte was expected
//    println(b)

//    println(i.toByte()) // ⇒ 6
}

/**
 * # Underscores for long numbers
 *
 * Use underscores to make long numeric constants more readable
 */
fun underscores() {
    val oneMillion = 1_000_000
    val idNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
}

/**
 * # Strings
 *
 * Strings are a sequence of characters enclosed by double quotes that may also contain spaces and numbers.
 * Strings are immutable.
 *
 * When a string appears literally in source code, it is known as a string literal or an anonymous string.
 * Kotlin has two types of string literals: escaped strings that may have escaped characters in them,
 * and raw strings that can contain newlines and arbitrary text.
 * A raw string is delimited by a triple quote ("""), contains no escaping and can contain newlines and any other characters.
 */
fun strings() {
    // Strings are any sequence of characters enclosed by double quotes.
    val s1 = "Hello world!"

    // String literals can contain escape characters
    val s2 = "Hello world!\n"

    // Or any arbitrary text delimited by a triple quote (""")
    val text = """
        multi\n
        line
        text
    """
}

/**
 * # String concatenation
 *
 * Strings in Kotlin work pretty much like strings in any other programming language
 * using **"** for strings and **'** for single characters, and you can concatenate strings with the **+** operator.
 *
 * You can create string templates by combining them with values.
 * In this example,`$numberOfDogs` and `$numberOfCats` are replaced with the value of those variables.
 * This is called variable **interpolation**.
 */
fun stringConcatenation() {
    val numberOfDogs = 3
    val numberOfCats = 2

    println("I have $numberOfDogs dogs" + " and $numberOfCats cats")
}

/**
 * # String templates
 * String literals can contain template expressions: pieces of code that are evaluated and whose results are concatenated into the string.
 */
fun stringTemplates() {
    // A template expression starts with a dollar sign ($) and can be a simple value:
    val i = 10
    println("i = $i") // ⇒ i = 10

    // Or an expression inside curly braces:
    val s = "abc"
    println("$s.length is ${s.length}") // ⇒ abc.length is 3

    val numberOfShirts = 10
    val numberOfPants = 5
    println("I have ${numberOfShirts + numberOfPants} items of clothing")
}

/**
 * # Variables
 *
 * The type you store in a variable is inferred when the compiler can figure it out from context.
 * If you want, you can also specify the type of a variable explicitly, using colon notation.
 * The data type comes after the variable name.
 *
 * Once a type has been assigned by you or the compiler, you can't change the type or you get an error.
 */
fun variables() {
    var width: Int = 12
    var length = 2.5 // Type is inferred as Double
}

/**
 * # Mutable and immutable variables
 *
 * Kotlin supports two types of variables: changeable and unchangeable.
 * * With **var**, you can assign a value, then change the value later in the program.
 * * With **val**, you can assign a value once. If you try to change it to something else, you get an error.
 *
 * Kotlin does not enforce immutability, though it is recommended. In essence use val over var.
 */
fun mutability() {
    var score = 10
    score = 15

    val name = "Bulat"
    // TODO uncomment
//    name = "Alex" // ⇒ Error: val cannot be reassigned
}

/**
 * # Conditionals
 *
 * Kotlin features several ways to implement conditional logic:
 * * If/Else statements
 * * When statements
 * * For loops
 * * While loops
 *
 * # if/else statements
 * The most common conditional is an if/else statement.
 * **If** statements let you specify a block of code (the code within the curly braces following the **if**) that is executed only if a given condition is **true**.
 * If the condition is **false**, then the code specified by an **else** statement is executed.
 * Note that the **else** block is not required.
 */
fun ifElse() {
    val numberOfCups = 30
    val numberOfPlates = 50

    if (numberOfCups > numberOfPlates) {
        println("Too many cups!")
    } else {
        println("Not enough cups!") // this branch would be executed
    }
}

/**
 * # if statement with multiple cases
 *
 * As in other languages, you can have multiple cases by using else if.
 * Note that you can use any comparison or equality operator in the if / else conditions, not just == or < as shown above.
 * You can also use logical and ("&&"), and logical or ("||") operators.
 */
fun ifMultipleCases() {
    val guests = 30
    val hasRooms = true

    if (guests == 0) {
        println("No guests")
    } else if (guests < 20 && hasRooms) {
        println("Small group of people")
    } else {
        println("Large group of people!") // this branch would be executed
    }
}

/**
 * # Ranges
 *
 * * Data type containing a span of comparable values (e.g., integers from 1 to 100 inclusive)
 * * Ranges are bounded
 * * Objects within a range can be mutable or immutable
 *
 * A range (or "interval") defines the inclusive boundaries around a contiguous span of values of some comparable type,
 * such as an intRange (for example, integers from 1 to 100 inclusive).
 * The first number is the start point, the second number is the endpoint.
 *
 * All ranges are bounded, and the left side of the range is always <= the right side of the range.

 * Although the implementation itself is immutable, there is no restriction that objects stored must also be immutable.
 * If mutable objects are stored here, then the range effectively becomes mutable.
 */
fun ranges() {
    val numberOfStudents = 50
    if (numberOfStudents in 1..100) { // create range in place
        println(numberOfStudents) // ⇒ 50
    }

    val range: IntRange = 1..100 // create range as variable
    if (numberOfStudents in range) {
        println(numberOfStudents) // ⇒ 50
    }

    // You can also define a step size between the bounding elements of the range
    for (i in 1..8 step 2) { // ⇒ 1357
        print(i)
    }
}

/**
 * # when statement
 *
 * There's a nicer way to write a series of if/else statements in Kotlin, using the when statement.
 * It's a bit like the "switch" statement in other languages.
 * Conditions in a when statement can also use ranges.
 */
fun whenStatement() {
    val results = 100
    when (results) { // ⇒ That's a lot of results!
        0 -> println("No results")
        in 1..39 -> println("Got results!")
        else -> println("That's a lot of results!")
    }
}

/**
 * # for loops
 *
 * Kotlin supports for loops, while loops, do-while loops.
 * Let’s look at examples of each one starting with for loops.
 *
 * Here, we use a for loop to iterate through the array and print the elements.
 */
fun forLoops() {
    val pets: Array<String> = arrayOf("dog", "cat", "canary")
    for (element in pets) { // ⇒ dog cat canary
        print("$element ")
    }
}

/**
 * # for loops: elements and indexes
 *
 * In Kotlin, you can loop through the elements and the indexes at the same time.
 */
fun forLoopsIndexed() {
    val pets = arrayOf("dog", "cat", "canary")
    for ((index, element) in pets.withIndex()) {
        println("Item at $index is $element\n")
    }
    // ⇒ Item at 0 is dog
    // Item at 1 is cat
    // Item at 2 is canary
}

/**
 * # for loops: step sizes and ranges
 *
 * You can specify ranges of numbers or characters, alphabetically.
 * As in other languages, you don't have to step forward by 1.
 * You can define the step size. You can also step backward using **downTo**.
 */
fun forLoopsSteps() {
    for (i in 1..5) print(i) // ⇒ 12345
    for (i in 5 downTo 1) print(i) // ⇒ 54321
    for (i in 3..6 step 2) print(i) // ⇒ 35
    for (i in 'а'..'g') print(i) // ⇒ defg
}

/**
 * # while loops
 *
 * Like other languages, Kotlin has **while** loops, **do...while** loops, and **++** and **--** operators.
 */
fun whileLoops() {
    var bicycles = 0
    while (bicycles < 50) {
        bicycles++
    }
    println("$bicycles bicycles in the bicycle rack") // ⇒ 50 bicycles in the bicycle rack

    do {
        bicycles--
    } while (bicycles > 50)
    println("$bicycles bicycles in the bicycle rack") // ⇒ 49 bicycles in the bicycle rack
}

/**
 * # repeat loops
 *
 * Kotlin also has **repeat** loops that let you repeat a block of code that follows inside its curly braces.
 * The number in parentheses is the number of times it should be repeated.
 * This print command is executed twice.
 */
fun repeatLoops() {
    repeat(2) { // ⇒ Hello!Hello!
        print("Hello!")
    }
}

/**
 * # Lists
 *
 * * Lists are ordered collections of elements
 * * List elements can be accessed programmatically through their indices
 * * Elements can occur more than once in a list
 *
 * # Immutable list using listOf()
 *
 * Lists created with **listOf()** cannot be changed (immutable).
 */
fun immutableLists() {
    var instruments: List<String> = listOf("trumpet", "piano", "violin", "violin")
// TODO uncomment
//    instruments.add("guitar") // it is not allowed to change the list
}

/**
 * # Mutable list using mutableListOf()
 *
 * Next, we'll use **mutableListOf** to create a list that **can** be changed.
 * In the example, the **add()** method returns true when it successfully adds the item passed.
 *
 * ## Note
 * With a list defined with **val**, you can't change which list the variable refers to,
 * but you can still change the contents of the list.
 */
fun mutableLists() {
    val instruments: MutableList<String> = mutableListOf("trumpet", "piano", "violin")
    instruments.add("guitar")
}

/**
 * # Arrays
 *
 * * Arrays store multiple items
 * * Array elements can be accessed programmatically through their indices
 * * Array elements are mutable
 * * Array size is fixed
 *
 * Arrays are used to organize data so that a related set of values can be easily sorted or searched.
 * Unlike **lists** in Kotlin, which have mutable and immutable versions, there is no mutable version of an Array.
 * Once you create an array, the size is fixed.
 * You can't add or remove elements, except by copying to a new array.
 *
 * Declare an array of strings using **arrayOf()**.
 * Use the **java.util.Arrays.toString()** array utility to print it out.
 *
 * ## Note
 * You can also add **"import java.util.Arrays"** and then use **"println(Arrays.toString(pets)"** to print it.
 *
 * With an array defined with val, you can't change which array the variable refers to, but you can still change the contents of the array.
 */
fun arrays() {
    val pets: Array<String> = arrayOf("dog", "cat", "canary")
    println(java.util.Arrays.toString(pets)) // ⇒ [dog, cat, canary]
// TODO uncomment
//    pets.add() // there are no such functions as add() or remove()
}

/**
 * # Arrays with mixed or single types
 *
 * You can declare arrays with a mix of types, or just one type for all the elements.
 * In the second example, although we define an array of only integers using **intArrayOf()**.
 * There are corresponding builders, or instantiation functions, for arrays of other types.
 */
fun arrayMixed() {
    val mix: Array<Any> = arrayOf("hats", 2)
    val numbers = intArrayOf(1, 2, 3)
}

/**
 * # Combining arrays
 *
 * In this example, we combine the two arrays and then println the resulting array.
 * Be sure to add **import java.util.Arrays** as a header if you have not already done so.
 *
 * Note that operator overloading is happening in the background and that + is calling
 * **operator fun plus(other:IntArray) : IntArray**
 */
fun combiningArrays() {
    val numbers1 = intArrayOf(1, 2, 3)
    val numbers2 = intArrayOf(4, 5, 6)
    val combined = numbers2 + numbers1
    println(Arrays.toString(combined)) // => [4, 5, 6, 1, 2, 3]

    val combined2 = numbers2.plus(numbers1) // would generate the same result
    println(Arrays.toString(combined2)) // => [4, 5, 6, 1, 2, 3]
}

/**
 * # Null safety
 *
 * * In Kotlin, variables cannot be null by default
 * * You can explicitly assign a variable to null using the safe call operator
 * * Allow null-pointer exceptions using the !! operator
 * * You can test for null using the elvis (?:) operator
 *
 * A hallmark of Kotlin, is its attempt to eliminate the danger of null references in code.
 * Null references occur when code attempts to access a variable that doesn't refer to anything,
 * potentially stopping code execution and causing a **NullPointerException**.
 */
fun nullSafety() {
// TODO uncomment
//        var numberOfBooks: Int = null // Null can not be a value of a non-null type Int

    // The safe call operator (?), after the type indicates that a variable can be null.
    var nullableNumberOfBooks: Int? = null
}

/**
 * # Testing for null
 *
 * You can test for null with the **?** operator, saving you the pain of writing many if/else statements.
 *
 * Although the first example is written in Kotlin, it's more the way you might test for null in Java or other languages.
 * It's still in Kotlin, but it's not the idiomatic Kotlin way to do it.
 * The last line of code in the example simply says **"call dec() on booksAmount if it's not null."**
 */
fun testingForNull() {
    var numberOfBooks: Int? = 6
    if (numberOfBooks != null) {
        numberOfBooks = numberOfBooks.dec() // dec() returns this value decremented by one
    }

    // Now look at the Kotlin way of writing it, using the safe call operator
    var booksAmount: Int? = null
    booksAmount = booksAmount?.dec()
}

/**
 * # The !! operator
 *
 * If you really love **NullPointerExceptions**, Kotlin lets you keep them.
 * The not-null assertion operator, !! (double-bang), converts any value to a non-null type and throws an exception if the value is null.
 *
 * In programming slang, the exclamation mark is often called a "bang",
 * so the not-null assertion operator is sometimes called the "double-bang" or "bang bang" operator.
 *
 * ## Warning
 * Because !! will throw an exception, it should only be used when it would be exceptional to hold a null value.
 */
fun doubleBang() {
    var s: String? = "myString"

    val nullableLength: Int? = s?.length
    val nonNullLength: Int = s!!.length
}

/**
 * # Elvis operator
 *
 * The example is shorthand for:
 * **"if numberOfBooks is not null, decrement and use it; otherwise use the value after the ?:, which is 0."**
 *
 * If numberOfBooks is null, evaluation is stopped, and the dec() method is not called.
 * Combining the null tests with the elvis operator reduces them to a single line, and avoids having to use a longer if/else statement.
 */
fun elvis() {
    var numberOfBooks: Int? = 6
    numberOfBooks = numberOfBooks?.dec() ?: 0

    // The same result but takes longer to write
    numberOfBooks = if (numberOfBooks != null) {
        numberOfBooks.dec()
    } else {
        0
    }
}

// Go to Functions.kt