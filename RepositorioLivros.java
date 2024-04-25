import java.util.ArrayList;
import java.util.List;

public class RepositorioLivros {
    private List<Livro> livros;

    public RepositorioLivros(){
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro){
        livros.add(livro);
    }

    public List<Livro> listarLivros(){
        return livros;
    }

    // Emprestimo
    public void emprestimo(String titulo){
        for (Livro livro: livros){
            if (livro.getTitulo().equals(titulo)){
              if (!livro.isEmprestado()){
                livro.setEmprestado(true);
                System.out.println("Emprestimo realizado com sucesso!");
              }  
              else{
                System.out.println("Este livro já está emprestado.");
              }
                return;
            }
            System.out.println("Livro não encontrado!");
        }
    }

    public void devolverLivro(String titulo){
        for (Livro livro : livros){
            if (livro.getTitulo().equals(titulo)){
                if (!livro.isEmprestado()){
                    livro.setEmprestado(false);
                    System.out.println("Devolução realizada com sucesso!");
                }
            else{
                System.out.println("Este livro já foi devolvido");
            }
                return;
            }
            System.out.println("Livro não encontrado!");
        }
    }
}

