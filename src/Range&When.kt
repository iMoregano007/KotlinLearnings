fun main(){

//    Range Example

    println("Range Example")
    var num = 12
    println(--num in 1 until 12)

//    Range && When code example
    println("Range && When Combined Example")
    var number = 10
    val result = when(number++) {
        in 1..10 -> "Number lies b/w 1 to 10"
        in 11..20 -> "Number lies b/w 11 to 20"
        else -> "Number either less than 1 or greater than 20"
    }
//    when is an alternate version of switch case in java

    println(result)
    print(number)


}