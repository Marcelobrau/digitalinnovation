package one.digitalinnovation.digionebank

class Pessoa(
    val nome: String = "jether",
    val cpf: String  = "12.123.123-11"
)

fun main(){
    val jether =  Pessoa()

    println(jether.nome)
    println(jether.cpf)
}

