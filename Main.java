import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
       
        int opcao = -1;     

        while (opcao != 0) {
            System.out.println("\n--- SISTEMA DE USUÁRIOS ---");
            System.out.println("1 - Cadastrar (Create)");
            System.out.println("2 - Listar (Read)");
            System.out.println("3 - Atualizar (Update)");
            System.out.println("4 - Deletar (Delete)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do novo usuário: ");
                    usuarios.add(leitor.nextLine());
                    System.out.println("Usuário cadastrado!");
                    break;
                case 2:
                    System.out.println("\nLista de Usuários:");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(i + " - " + usuarios.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Digite o índice do usuário para atualizar: ");
                    int indexAlt = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Novo nome: ");
                    usuarios.set(indexAlt, leitor.nextLine());
                    System.out.println("Atualizado com sucesso!");
                    break;
                case 4:
                    System.out.print("Digite o índice para deletar: ");
                    int indexDel = leitor.nextInt();
                    usuarios.remove(indexDel);
                    System.out.println("Usuário removido!");
                    break;
                default:           
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        leitor.close();
        System.out.println("Sistema encerrado.");
    }
}