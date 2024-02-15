package au.com.boundless_systems.playground.kotlin_fundementals


// Resources to refer to or were I understood things from.
// https://stackoverflow.com/questions/45875491/what-is-a-receiver-in-kotlin
// https://kotlinlang.org/docs/lambdas.html#function-types

fun main() {
    val abdollahGreeter = Greeter("Abdollah")

    abdollahGreeter.sayHello()

    abdollahGreeter.sayHowDoYouDo()

    with(abdollahGreeter) {
        println("$name says I am well thanks for asking...")
    }

    // If we are to replicate how the with extension function above
    // works we can implement it as below
    caller(greeter = abdollahGreeter) {
        println("$name says then thanks god you are well...")
    }

    abdollahGreeter.sayBye()
}

class Greeter(internal val name : String) {
    fun sayHello() {
        println("$name says Hello..!!")
    }
}


fun Greeter.sayBye() {
    println("$name says Bye..!!")
}


val sayHowDoYouDo : Greeter.() -> Unit = {
    println("$name says how do you do ?...")
}


fun caller(greeter : Greeter, lambda : Greeter.() -> Unit) {
    lambda(greeter) // or greeter.lambda()
}