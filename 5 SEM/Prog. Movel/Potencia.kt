fun potencia(x:Int, p:Int=2):Int{
    var r=1
    for(i in 1..p)
        r*=x
    return r
}

fun main(){
    println(potencia(5))
}