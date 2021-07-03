package one.digitalInnovation.digionebank

class Analista(
    nome: String,
    cpf: String,
    salario: Double) :
    Funcionario(
        nome,
        cpf, salario
    ) {
    override fun calcularAuxilio() : Double
    {
        return this.salario * 0.1
    }
}