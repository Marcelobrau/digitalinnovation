package one.digitalinnovation.digionebank

class Pessoa{
    val nome: String = "jether"
    val cpf: String  = "12.123.123-11"

    constructor()

    fun pesssoainfo() = "$nome e $cpf"
}

fun main(){
    val jether =  Pessoa()

    println(jether.pesssoainfo())

}

