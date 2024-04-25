import java.util.Scanner;
public class BibliotecaMenu {
    public static void main(String[] args) {
        RepositorioLivros repositorio = new RepositorioLivros();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Escolha a sua opção: ");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Emprestimo de Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    UserLivro.cadastrarLivro(args);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    break;
            } 
            scanner.close();
        }while (opcao != 5);
    }
}
