import java.util.ArrayList;
import java.util.List;

public class RepositorioLivros {
    private static List<Livro> livros = new ArrayList<>();

    // Cadastro
    public static void cadastrarLivro(Livro livro){
        for (Livro livroExistente : livros){
            if (livroExistente.getTitulo().equals(livro.getTitulo())){
                System.out.println("Livro já cadastrado!");
                return;
            }
        }
        livros.add(livro);
        System.out.println("Livro cadastrado!");
    }

    // listagem
    public static void listarLivros(){
        if (livros.isEmpty()){
            System.out.println("Não há nenhum livro cadastrado!");
        }else{
            for (Livro livro : livros){
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Numero de paginas: " + livro.getPaginas());
            System.out.println("Data de lançamento: " + livro.getAnoDeLancamento());
        }}
    }

    // Emprestimo
    public static void emprestimo(String titulo){
        for (Livro livro: livros){
            if (livro.getTitulo().equals(titulo)){
              if (!livro.isEmprestado()){
                livro.setEmprestado(true);
                System.out.println("Emprestimo realizado com sucesso!");
                return;
            }  
              else{
                System.out.println("Este livro já está emprestado.");
                return;
              }
            }
        }
        System.out.println("Livro não encontrado!");
    }
    // Devolução
    public static void devolverLivro(String titulo){
        for (Livro livro : livros){
            if (livro.getTitulo().equals(titulo)){
                if (!livro.isEmprestado()){
                    livro.setEmprestado(false);
                    System.out.println("Devolução realizada com sucesso!");
                    return;
                }
            else{
                System.out.println("Este livro já foi devolvido");
                return;
                 }
            }
        } 
        System.out.println("Livro não encontrado!");
    }
}

