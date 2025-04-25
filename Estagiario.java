public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salario, String departamento, String cpf, String dataNasc) {
        super(nome, salario, departamento, cpf, dataNasc);
    }
    @Override
    public void MostrarDados() {
        System.out.println("Cargo: Estagiario");
        super.MostrarDados();
    }
}
