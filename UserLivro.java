import java.util.Scanner;

public class UserLivro{
    public static void UserCadastra(RepositorioLivros repositorio){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Titulo do livro: ");
        String titulo = scanner.nextLine();
        
        System.out.println("Digite o Autor do livro: ");
        String autor = scanner.nextLine();

        System.out.println("Digite o Numero de paginas do livro: ");
        int paginas = scanner.nextInt();

        System.out.println("Digite o Ano de lançamento do livro: ");
        int anoDeLancamento = scanner.nextInt();
        
        Livro livro = new Livro(titulo, autor, paginas, anoDeLancamento);

        // salvamento no repositorio
        RepositorioLivros.cadastrarLivro(livro);

    }
}
