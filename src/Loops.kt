fun main(){
//    print 2's table using while loop
    val num = 2
    var index = 1

    println( "print 2's table using while loop")


    while(index <= 10){
        println("" + num +" * " + index + " = " + num*index++)
    }
    index = 1
//     print 2's table using do while loop
    println( "print 2's table using do while loop")
    do{
        println("" + num +" * " + index + " = " + num*index++)

    } while(index <= 10)

//    for loop
    println( "print 2's table using for loop")

    var i = 1
    index = i
    for(i in 1..10){
        println("" + num +" * " + index + " = " + num*index++)
    }
}