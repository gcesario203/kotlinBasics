package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Analista

fun main()
{
    val analistaIncrivel = Analista("Cesao", "123", 1.2)

    println("${analistaIncrivel.nome} -- ${analistaIncrivel.salario} -- ${analistaIncrivel.calcularAuxilio()}")
}