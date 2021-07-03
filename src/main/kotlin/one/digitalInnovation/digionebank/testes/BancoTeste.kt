package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Banco

fun main(){
    val digiBank = Banco( nome = "teste", numero = "2132132132")

    println("${digiBank.nome} == ${digiBank.numero}")
}