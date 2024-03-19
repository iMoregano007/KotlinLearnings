fun main(){
    println("Normal function")
    println(add(55,5))

    println("One Liner function")
    println(addOneLinerF(55,5))

    println("Default Argument function")
    println(addDefault())

    println("Unit function")
    unitAddF(55,5)
}

//normal function
fun add(num1: Int, num2: Int) : Int{
    return num1 + num2
}
// one Liner function
fun addOneLinerF(num1: Int , num2: Int): Int = num1 + num2

//default argument func

fun addDefault(num1: Int =2, num2: Int = 3): Int {
    return num1+num2
}

//unit func

fun unitAddF(num1: Int, num2: Int){
    println(num1+num2)
}