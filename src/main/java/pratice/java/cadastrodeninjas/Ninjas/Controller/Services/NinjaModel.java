package pratice.java.cadastrodeninjas.Ninjas.Controller.Services;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;

    private String email;

    int idade;

    //@ManyToOne Um ninja pode ter uma missão
    @ManyToOne
    @JoinColumn (name = "missoes_id") //Foreing key ou chave estrangeira
    private MissoesModel missoes;

    public NinjaModel() {
    }
    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {}
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
