fun main() {
class myClass{
    fun avg(a:Double,b:Double):Double{
        return (a+b)/2
    }
}
    // main()
    val x = myClass()
    val d = x.avg(45.0,78.0)
    println(d)
}