/*class Pessoa(_nome: String,_idade: Int){
    val nome:String =_nome
    val idade:Int = _idade   
}

fun main(){
    val p:Pessoa=Pessoa("zeh",23)
    println("${p.nome},${p.idade}")
}
*/

class Pessoa(
    val nome: String,
	val idade: Int
)

fun main(){
    val p:Pessoa=Pessoa("zeh",23)
    println("${p.nome},${p.idade}")
}