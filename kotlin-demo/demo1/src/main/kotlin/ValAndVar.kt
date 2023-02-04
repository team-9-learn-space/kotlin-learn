import java.util.Scanner

const val MY_NAME = "JACK"
fun main() {
    val number: Number //no initialized
    number = 1.23 // initialized
    println(number)
    val list = mutableListOf("1", 1, 2, 3)
    val num = 1.1
    println("num = ${num}")
    list.add('$')
    println(list)
    val result = println(MY_NAME) //kotlin.Unit eq Java void, reference this function not have return
    println(result)
    for (i in 1..6){
        for (j in 0 until i){
            print("#")
        }
        println()
    }
    println(Byte.MAX_VALUE)
    println(Short.MAX_VALUE)
    println(Int.MAX_VALUE)
    println(Long.MAX_VALUE)
    val num1 = 0
    val num2 = 1
    val bool = readln().toBoolean();
    println(num1/num2)
    println(bool)
}