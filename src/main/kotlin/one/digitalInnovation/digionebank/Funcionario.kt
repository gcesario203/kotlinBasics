package one.digitalInnovation.digionebank


abstract class Funcionario(
    nome : String,
    cpf: String,
    var salario : Double
    ) : Pessoa(nome, cpf)
{
        abstract fun calcularAuxilio() : Double
}