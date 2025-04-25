public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario, String departamento, String cpf, String dataNasc) {
        super(nome, salario, departamento, cpf, dataNasc);
    }
    @Override
    public void MostrarDados() {
        System.out.println("Cargo: Desenvolvedor");
        super.MostrarDados();
    }
    public void Programar(){
        System.out.println("Programando");
    }
}
