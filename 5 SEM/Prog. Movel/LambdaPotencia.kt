fun main() {
    val LambdaPotencia: (Int , Int)-> Int ={n1,n2->
        var r = 1
        for(i in 1..n2){
            r *= n1
        }
        r
    }
    println(LambdaPotencia(5,2))
}