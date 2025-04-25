public class Gerente extends Funcionario{
    public Gerente(String nome, double salario, String departamento, String cpf, String dataNasc) {
        super(nome, salario, departamento, cpf, dataNasc);
    }
    @Override
    public void MostrarDados() {
        super.MostrarDados();
        System.out.println("Cargo: Gerente");
    }
    public void  RealizarReuniao(){
        System.out.println("Uma reunião está sendo realizada");
    }
}
