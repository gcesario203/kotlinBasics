package one.digitalInnovation.digionebank

//As classes funcionam diferente, parâmetros = atributos e dentro do bloco = methods
class Pessoa(pNome : String, pCpf : String)
{
    var nome: String = pNome

    var cpf: String = pCpf
        private set
}

fun main() {
    println("Insira seu nome")
    val lNome = readLine().toString()
    println("insira seu CPF")
    val lCpf = readLine().toString()
    val saboroso = Pessoa(lNome, lCpf)

    println("${saboroso.nome} -- ${saboroso.cpf}")
}