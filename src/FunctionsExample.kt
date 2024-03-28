fun main(){
//    named argument
    println(add(a=5,b=8))
    println(add(b=2.0,a=5.0))
    println(power(2.0,3.0))
    println(power(b = 2.0,a=3.0))

}
//
////normal function
//fun add(num1: Int, num2: Int) : Int{
//    return num1 + num2
//}
//// one Liner function
//fun addOneLinerF(num1: Int , num2: Int): Int = num1 + num2
//
////default argument func
//
//fun addDefault(num1: Int =2, num2: Int = 3): Int {
//    return num1+num2
//}
//
////unit func
//
//fun unitAddF(num1: Int, num2: Int){
//    println(num1+num2)
//}


//function overloading

fun add(a: Int, b: Int): Int = a+b
fun add(a: Double , b: Double): Double = a+b

fun power(a: Double, b: Double):Double
{
    return Math.pow(a,b)
}