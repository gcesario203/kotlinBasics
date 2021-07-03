package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Gerente


fun main()
{
    val gerenteIncrivel = Gerente("Cesao gerente", "123", 1.2)

    println("${gerenteIncrivel.nome} -- ${gerenteIncrivel.salario} -- ${gerenteIncrivel.calcularAuxilio()}")
}