package SistemaLivraria;

public class Autor {
    private String nome;
    private String sobrrenome;
    private String generoLiterario;
    private String sexo;
    private String pais;
    private String cidade;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrrenome() {
        return sobrrenome;
    }

    public void setSobrrenome(String sobrrenome) {
        this.sobrrenome = sobrrenome;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Autor(String nome, String sobrrenome, String generoLiterario, String sexo, String pais, String cidade, int idade) {
        this.nome = nome;
        this.sobrrenome = sobrrenome;
        this.generoLiterario = generoLiterario;
        this.sexo = sexo;
        this.pais = pais;
        this.cidade = cidade;
        this.idade = idade;
    }



    public String retornarDadosAutor() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", sobrrenome='" + sobrrenome + '\'' +
                ", generoLiterario='" + generoLiterario + '\'' +
                ", sexo='" + sexo + '\'' +
                ", pais='" + pais + '\'' +
                ", cidade='" + cidade + '\'' +
                ", idade=" + idade +
                '}';
    }
}
