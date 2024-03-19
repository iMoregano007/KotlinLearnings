//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {

    var score: Int = 12
    score *= 2
    score++
    val result = if(score %2 == 0) "even" else "odd"
    println(score)
    println(result)

}