
import kotlinx.coroutines.*

class SuspendFunction {
    suspend fun makeBreakfast(): String {
        println("Starting breakfast")
        delay(4000) // suspends for 2 seconds
        return "Breakfast is Ready!"
    }
}

fun main() = runBlocking {
    println("Good Morning")

    launch {
        val breakfast = SuspendFunction().makeBreakfast()
        println(breakfast)
    }

    println("I can do other things while breakfast is being made!")
}
