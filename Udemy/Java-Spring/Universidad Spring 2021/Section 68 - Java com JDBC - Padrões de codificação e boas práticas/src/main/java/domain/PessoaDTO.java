package domain;

public class PessoaDTO {
    private int id_pessoa;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    public PessoaDTO() {

    }

    public PessoaDTO(int id_pessoa, String nome, String sobrenome, String email, String telefone) {
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id_pessoa=" + id_pessoa +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
