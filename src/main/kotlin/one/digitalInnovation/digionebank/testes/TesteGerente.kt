package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Gerente


fun main()
{
    val gerenteIncrivel = Gerente("Cesao gerente", "123", 1.2, senha = "incrivelASenha")

    println("${gerenteIncrivel.nome} -- ${gerenteIncrivel.salario} -- ${gerenteIncrivel.calcularAuxilio()}")

    var confirmSenha = false

    while (confirmSenha == false)
    {
        println("Digite sua senha")
        confirmSenha = gerenteIncrivel.login(readLine().toString())

        if(confirmSenha)
            println("LOGOU")
        else
            println("TENTE NOVAMENTEKKKKKKKKK")
    }
}