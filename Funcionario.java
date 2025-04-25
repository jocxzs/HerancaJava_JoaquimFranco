import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario extends Pessoa 
{
    private String nome;
    private double  salario;
    private String departamento;

    // Construtor Funcionario
    public Funcionario(String nome, double salario, String departamento, String cpf, String dataNasc) {
        super(cpf, dataNasc);
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }
    public Funcionario(){};

    // Metodos Getters
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    // Metodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Metodos da classe
    public void MostrarDados(){
        System.out.println("SOBRE O FUNCIONÁRIO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("CPF:" + getCpf());
        System.out.println("Data de nascimento:" + getDataNasc());
    }
    public void BaterPonto(){
        System.out.println("O ponto foi batido");
    }
    public class CadastroFuncionarios {
        private static List<Funcionario> funcionariosCadastrados = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

        public static void cadastrarNovoFuncionario() {
            System.out.println("-Cadastrar Novo Funcionário-");
            System.out.println("Digite o tipo de funcionário (gerente, desenvolvedor, estagiario ou funcionario):");
            String tipo = scanner.nextLine().toLowerCase();

            System.out.println("Digite o nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite o salário:");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite o departamento:");
            String departamento = scanner.nextLine();

            System.out.println("Digite o CPF:");
            String cpf = scanner.nextLine();

            System.out.println("Digite a data de nascimento(DD/MM/AAAA)");
            String dataNasc = scanner.nextLine();

            switch (tipo) {
                case "gerente":
                    Gerente gerente = new Gerente(nome, salario, departamento, cpf, dataNasc);
                    funcionariosCadastrados.add(gerente);
                    System.out.println("Gerente " + nome + " cadastrado com sucesso!");
                    break;
                case "desenvolvedor":
                    Desenvolvedor desenvolvedor = new Desenvolvedor(nome, salario, departamento, cpf, dataNasc);
                    funcionariosCadastrados.add(desenvolvedor);
                    System.out.println("Desenvolvedor " + nome + " cadastrado com sucesso!");
                    break;
                case "estagiario":
                    Estagiario estagiario = new Estagiario(nome, salario, departamento, cpf, dataNasc);
                    funcionariosCadastrados.add(estagiario);
                    System.out.println("Estagiário " + nome + " cadastrado com sucesso!");
                    break;
                case "funcionario":
                    Funcionario funcionario = new Funcionario(nome, salario, departamento, cpf, dataNasc);
                    funcionariosCadastrados.add(funcionario);
                    System.out.println("Funcionário " + nome + " cadastrado com sucesso!");
                    break;
                default:
                    System.out.println("Tipo de funcionário inválido.");
        }
    }

    public static void exibirTodosFuncionarios() {
        if (funcionariosCadastrados.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        }else{
        System.out.println("Lista de Funcionários Cadastrados");
        for (Funcionario funcionario : funcionariosCadastrados) {
            funcionario.MostrarDados();
        }
        }
    }
}
}
