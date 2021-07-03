package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.ClienteTipo

fun main()
{
    ClienteTipo.values().forEach { item ->
        println("${item.name} -- ${item.descricao}")
    }
}