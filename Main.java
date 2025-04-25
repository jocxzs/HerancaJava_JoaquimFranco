import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcao;
        Scanner op = new Scanner(System.in);

        do{
            System.out.println("-MENU-");
            System.out.println("1-Cadastrar");
            System.out.println("2-Mostrar todos registros");
            System.out.println("0-Sair");
            System.out.print("Escolha uma opção: ");
            opcao = op.nextInt();
            op.nextLine();

            switch (opcao) {
                case 0 -> {
                }
                case 1 -> {
                    Funcionario.CadastroFuncionarios.cadastrarNovoFuncionario();
                    break;
                }
                case 2 -> {
                    Funcionario.CadastroFuncionarios.exibirTodosFuncionarios();
                    break;
                }
                default -> System.out.println("Opção inválida");
            }
        }while(opcao != 0);
            System.out.println("Programa encerrado.");
            op.close();
    }

}
