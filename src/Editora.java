package SistemaLivraria;

public class Editora {

    private String nome;
    private int ano;
    private int endereco;
    private String pais;
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Editora(String nome, int ano, int endereco, String pais, String estado) {
        this.nome = nome;
        this.ano = ano;
        this.endereco = endereco;
        this.pais = pais;
        this.estado = estado;
    }

    public String retornarDadosEditora() {
        return "Editora{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", endereco=" + endereco +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
