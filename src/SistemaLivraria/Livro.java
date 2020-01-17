package SistemaLivraria;


public class Livro {

        private String titulo;
        private int paginas;
        private boolean aberto;
        private String genero;
        private String Autor;
        private String editora;
        private int paginaAtual;
        private int anoPublicacao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(String aberto) {
        this.aberto = aberto;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }



    public Livro(String titulo, int paginas, String aberto, String autor, String editora, int paginaAtual, int anoPublicacao) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.aberto = aberto;
        this.Autor = autor;
        this.editora = editora;
        this.paginaAtual = paginaAtual;
        this.anoPublicacao = anoPublicacao;

    }

    public String retornarDadosLivro() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                ", aberto=" + aberto +
                ", Autor='" + Autor + '\'' +
                ", editora='" + editora + '\'' +
                ", paginaAtual=" + paginaAtual +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }

public boolean abertoLivro(){
         if (this.aberto = true) {
         }
            return true;
        }
        else {
            return false;
        }
}







