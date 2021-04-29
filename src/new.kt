//fun main() {
  //  fun displaysGreeting(message:string,name: string = "Guest"){
    //    println("Hello $name,$message")
    //}
//}
fun main() {
    //package maths
    fun findNthFibonacciNo(n: Int): Int {
        var a = 0
        var b = 1
        var c: Int
        if(n == 0) {
            return a
        }
        for(i in 2..n) {
            c = a+b
            a = b
            b = c
        }
        return b
    }

}