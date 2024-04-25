import java.util.Scanner;

public class UserLivro{
    public static void cadastrarLivro(String[] args){
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

        System.out.println("\nTítulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Paginas: " + livro.getPaginas());
        System.out.println("Ano de Publicação: " + livro.getAnoDeLancamento());

        scanner.close();
    }
}
