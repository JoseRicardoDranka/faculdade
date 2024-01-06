fun main() {
    val LambdaPrimo: (Int)-> Boolean ={
        var result=true
        for(i in 2..it/2){
        	if(it%i==0){
        		result = false
            	break
            } 
        }
        result
    }
    
    println(LambdaPrimo(75))
}