fun main() {
    val LambdaMetade: (Double)-> Double ={n1->
        var r:Double
            r = n1/2
        r
    }
    println(LambdaMetade(5.0))
}