@file:Suppress(
    "unused",
    "UNUSED_VARIABLE",
    "RedundantExplicitType",
    "ConvertToStringTemplate",
    "KotlinConstantConditions",
    "IfThenToElvis",
    "CanBeVal",
    "RedundantUnitReturnType",
    "UNUSED_PARAMETER",
    "MoveLambdaOutsideParentheses"
)

package tat.mukhutdinov.kotlinBasics

/**
 * # Create a main() function
 *
 * As with other languages, the Kotlin **main()** function specifies the entry point for execution.
 * Any command line arguments are passed as an array of strings.
 *
 * Like your earlier **printHello()** function, this function has no return statement.
 * Every function in Kotlin returns something, even when nothing is explicitly specified.
 * So a function like this **main()** function returns a type **kotlin.Unit**, which is Kotlin's way of saying no value.
 *
 * ## Note
 * When a function returns **kotlin.Unit**, you don't have to specify it explicitly.
 * This is different from some other languages, where you have to explicitly say that you are returning nothing.
 */

/**
 * # Pass arguments to main()
 *
 * 1. Select *Run > Edit Configurations...*.
 * 2. Enter "Kotlin!" in the *Program arguments:* field, and click OK.
 *
 * Modify the code to print arg:
 *
 * ```kotlin
 * fun main(args: Array<String>) {
 *     println("Hello, ${args[0]}")
 * }
 * ```
 * Run the code and check console
 * ```
 * Hello, Kotlin!
 *
 * Process finished with exit code 0
 * ```
 */
val foo1 = Unit

/**
 * # (Almost) Everything is an expression
 *
 * In Kotlin, almost everything is an expression and has a value. Even an **if** expression has a value.
 *
 * ## Note
 * Loops are exceptions to "everything has a value."
 * There's no sensible value for **for** loops or **while** loops, so they do not have values.
 * If you try to assign a loop's value to something, the compiler gives an error.
 */
fun expression() {
    val temperature = 20
    val isHot = if (temperature > 40) {
        "hot"
    } else {
        "cold"
    }

    println(isHot) // ⇒ cold
}

/**
 * # Expression values
 *
 * Some other languages have statements, which are lines of code that don't have a value.
 * In Kotlin, almost everything is an expression and has a value, even if that value is **kotlin.Unit**.
 * (Kotlin's **Unit** is equivalent to Java's **void**.)
 *
 * The first **println()** prints the string **"This is an expression"**;
 * the second **println()** prints the value of the first **println()** statement.
 */
fun expressionValues() {
    val isUnit = println("This is an expression") // ⇒ This is an expression
    println(isUnit) // ⇒ kotlin.Unit
}

/**
 * # About functions
 *
 * * A block of code that performs a specific task
 * * Breaks a large program into smaller modular chunks
 * * Declared using the **fun** keyword
 * * Can take arguments with either named or default values
 *
 * A function is a discrete block of code that performs an operation, and can return a value.
 * In Kotlin, functions are declared using the **fun** keyword, and can take arguments with either named or default values.
 * A function associated with a particular class is called a **method**.
 *
 * #  Parts of a function
 *
 * You define functions using the **fun** keyword, followed by the name of the function.
 * As with other programming languages, the parentheses **()** are for function arguments, if any.
 * Curly braces **{}** frame the code for the function.
 * There is no return type for this function, because it doesn't return anything.
 *
 * The **Unit** return type declaration is optional. The function below is equivalent to:
 *  ```
 * fun sayHello(name: String) {
 *    println("Hello, $name")
 * }
 * ```
 */
fun sayHello(name: String, age: Int): Unit {
    println("Hello, $name")
}

/**
 * # Function arguments
 *
 * Functions may have:
 * * Default parameters
 * * Required parameters
 * * Named arguments
 *
 * Let's write a **drive()** function with a **String** parameter named **speed** that prints the car's speed.
 * The speed parameter has a **default value** of **"fast"**.
 *
 * From the **main()** function, call the **drive()** function three ways:
 * * Call the function using the default
 * * Call the function and pass the speed parameter without a name
 * * Call the function by naming the speed parameter. We'll talk about named arguments, or parameters, later.
 *
 *  ```
 *  fun main(args: Array<String>) {
 *     drive() // ⇒ driving fast
 *     drive("slow") // ⇒ driving slow
 *     drive(speed = "turtle-like") // ⇒ driving turtle-like
 *  }
 * ```
 */
fun drive(speed: String = "fast") {
    println("driving $speed")
}

/**
 * # Required parameters
 *
 * If no **default** is specified for a parameter, the corresponding argument is **required**.
 * The **tempToday()** function takes two parameters, **day** and **temp**, both of which are **required**.
 * ```
 * fun main(args: Array<String>) {
 *    tempToday() // ⇒ compile error
 *    tempToday("monday") // ⇒ compile error
 *    tempToday("monday", 18) // ⇒ ok
 *    tempToday(day = "monday", temp = 18) // ⇒ ok
 * }
 * ```
 */
fun tempToday(day: String, temp: Int) {
    println("Today is $day and it's $temp degrees.")
}

/**
 * # Default versus required parameters
 *
 * In the example function, we use **reformat()** to apply a specified format, or combination of formats to **String**.
 * The parameters to **reformat()** contain their name and type. The **normalizeCase** parameter has a default value.
 * **Default** and **named** arguments help minimize overloads and improve the readability of your code.
 *
 * ```
 * fun main(args: Array<String>) {
 *    reformat("Today is a day", false, '_')
 *
 *    reformat("Today is a day", false, '_', false)
 * }
 * ```
 */
fun reformat(
    str: String,
    divideByCamelHumps: Boolean,
    wordSeparator: Char,
    normalizeCase: Boolean = true
) {
    // Some code
}

/**
 * # Named arguments
 *
 * Arguments can be passed to a function with their name (named arguments).
 * Using named arguments is convenient when a function has a large number of parameters or default ones.
 * Note that we did not include the parameter with the default parameter.
 *
 * ```
 * fun main(args: Array<String>) {
 *     reformat(
 *         str = "Today is a day",
 *         divideByCamelHumps = false,
 *         wordSeparator = '_'
 *     )
 * }
 * ```
 */
val foo2 = Unit

/**
 * # Single-expression functions
 *
 * When a function returns a single expression, the curly braces can be omitted and the body is specified after a "=" symbol.
 * Compact functions, or single-expression functions, make your code more concise and readable.
 */
fun doubleFull(x: Int): Int {
    return x * 2
}

/**
 * The same function as [doubleFull]
 */
fun doubleCompact(x: Int): Int =
    x * 2

/**
 * # Kotlin functions are first-class
 *
 * * Kotlin functions can be stored in variables and data structures
 * * They can be passed as arguments to, and returned from, other higher-order functions
 * * You can use higher-order functions to create new "built-in" functions
 *
 * In addition to traditional **named** functions, Kotlin supports **lambdas**.
 * A **lambda** is an expression that makes a function.
 * But instead of declaring a **named** function, you declare a function that has **no name**.
 * Part of what makes this useful is that the **lambda** expression can now be passed as data.
 * In other languages, **lambdas** are called **anonymous functions**, **function literals**, or similar names.
 *
 * Like named functions, lambdas can have parameters.
 * For lambdas, the parameters (and their types, if needed) go on the left of what is called a function arrow ->.
 * The code to execute goes to the right of the function arrow.
 * Once the lambda is assigned to a variable, you can call it just like a function.
 *
 * The output is
 *
 * ```sh
 * start filtering
 * filtering is finished
 * 10
 *
 * Process finished with exit code 0
 * ```
 */
fun lambda() {
    var dirtLevel = 20

    val waterFilter: (Int) -> Int = { level: Int ->
        println("start filtering")
        val newLevel = level / 2
        println("filtering is finished")
        newLevel
    }

    val newLevel = waterFilter(dirtLevel)
    println(newLevel)
}

/**
 * # Type inference
 *
 * You don't have to specify the type of the lambda argument. The type is calculated by type inference.
 */
fun lambda2() {
    val waterFilter = { level: Int ->
        level / 2
    }
}

/**
 * # Higher-order functions
 *
 * The real power of lambdas is using them to create higher-order functions, where the argument to one function is another function.
 *
 * Here, allowing the encoder to be passed as a function means you can use better or different encoding algorithms
 * when things change without having to hardcode one into the app.
 * It also provides abstraction by allowing one receiver to be used in different places without specialized code.
 */
fun encodeMessage(message: String, encode: (String) -> String): String {
    val result = encode(message)
    return result
}

/**
 * # Higher-order functions
 *
 * Using a function type separates its implementation from its usage letting you use anything that satisfies the contract,
 * in this case anything that takes in a **String** and returns a **String**: **(String) -> String**.
 */
fun encode() {
    val encoder1: (String) -> String = { input -> input.uppercase() }
    val encoder2: (String) -> String = { input -> "$input $input" }

    val message = "abc"

    val result1 = encodeMessage(message, encoder1)
    val result2 = encodeMessage(message, encoder2)

    println("Result 1 is $result1") // ⇒ Result 1 is ABC
    println("Result 2 is $result2") // ⇒ Result 2 is abc abc
}

/**
 * # Passing a function reference
 *
 * Use the **::** operator to pass a named function as an argument to another function.
 * The **::** operator lets Kotlin know that you are passing the function **reference** as an argument,
 * and not trying to call the function.
 *
 * ```
 * fun main(args: Array<String>) {
 *     val result = encodeMessage("abc", ::reverseEncoder)
 *     println(result)
 * }
 * ```
 */
fun reverseEncoder(input: String): String {
    return input.reversed()
}

/**
 * # Last parameter call syntax
 *
 * When working with higher-order functions, Kotlin prefers that any parameter that takes a function is the last parameter.
 * Kotlin has a special syntax, called **the last parameter call syntax**, which lets you make the code even more concise.
 * In this case, you can pass a lambda for the function parameter, but you don't need to put the lambda inside the parentheses.
 */
fun lastParam() {
    encodeMessage("abc", { input -> input.uppercase() })

    // The same result
    encodeMessage("abc") { input ->
        input.uppercase()
    }
}

/**
 * # Using higher-order functions
 *
 * Many Kotlin built-in functions are defined using last parameter call syntax.
 *
 * ```
 * inline fun repeat(times: Int, action: (Int) -> Unit) { ... }
 * ```
 *
 * ```
 * repeat(3) {
 *     println("Hello")
 * }
 * ```
 */
val foo3 = Unit

/**
 * # Iterating through lists
 *
 * Function literals with exactly one parameter don’t require you to define the parameter explicitly;you can just use **it**.
 * This makes a lot of the language constructs like filter easier to use as you don't have to specify the name of the parameter.
 */
fun iterate() {
    val ints: List<Int> = listOf(1, 2, 3)

    val filtered: List<Int> = ints.filter { n: Int ->
        n > 0
    }

    ints.filter { n ->
        n > 0
    }

    ints.filter {
        it > 0
    }
}

/**
 * # List filters
 *
 * Let's use a **filter** to print only the decorations that start with the letter "b".
 * The filter condition in curly braces {} tests each item as the filter loops through.
 * If the expression returns true, the item is included.
 */
fun filter() {
    val books = listOf("nature", "biology", "birds")
    val filtered = books.filter { it.startsWith('b') }
    println(filtered) // ⇒ [biology, birds]
}

/**
 * # Collection transformation operations
 *
 * ## Map
 *
 * Map applies the given lambda function to each subsequent element and returns the list of the lambda results.
 * The order of results is the same as the original order of elements.
 *
 * ## Take
 *
 * To get the specified number of elements starting from the first, use the **take()** function.
 */
fun transformations() {
    val numbers = setOf(1, 2, 3)

    // Map
    val mapResult = numbers.map { it * 3 }
    println(mapResult) //  ⇒ [3, 6, 9]

    // Take
    val takeResult = numbers.take(2)
    println(takeResult) //  ⇒ [1, 2]
}

/**
 * # Eager and lazy filters
 *
 * Evaluation of expressions in lists:
 * * **Eager**: occurs regardless of whether the result is ever used
 * * **Lazy**: occurs only if necessary at runtime
 *
 * **Lazy** operations are more expensive individually than **eager** ones, and they should be limited to when there is a known benefit.
 * Using lazy evaluation is especially helpful when working with large collections
 * where you want to avoid performing expensive operations when you only need part of the results.
 *
 * Assume that you have a list of words.
 * The code below filters the words longer than three characters and prints the lengths of first four such words.
 *
 * Run and check output.
 */
fun eager() {
    val words: List<String> = "The quick brown fox jumps over the lazy dog".split(" ")

    val lengthsList = words
        .filter {
            println("filter: $it")
            it.length > 3
        }
        .map {
            println("length: ${it.length}")
            it.length
        }
        .take(4)

    println("Lengths of first 4 words longer than 3 chars:")
    println(lengthsList)
}

/**
 * # Sequence
 *
 * To make the filter lazy, you can use a **Sequence**, which is a collection that can only look at one item at a time,
 * starting at the beginning, and going to the end. Conveniently, this is exactly the API that a lazy filter needs.
 *
 * Run and check output.
 *
 * **lazy()** performs 10 steps while **eager()** performs 14 steps.
 */
fun lazy() {
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    // Convert the List to a Sequence
    val wordsSequence = words.asSequence()

    val lengthsSequence = wordsSequence
        .filter {
            println("filter: $it")
            it.length > 3
        }
        .map {
            println("length: ${it.length}")
            it.length
        }
        .take(4)

    println("Lengths of first 4 words longer than 3 chars")
    println("Sequence is $lengthsSequence")

    // Terminal operation: obtaining the result as a List
    println("Call .toList()")
    println(lengthsSequence.toList())
}

// Go back to slides