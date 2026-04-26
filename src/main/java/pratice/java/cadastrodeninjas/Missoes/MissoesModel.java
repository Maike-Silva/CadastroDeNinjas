package pratice.java.cadastrodeninjas.Missoes;

import jakarta.persistence.*;
import pratice.java.cadastrodeninjas.Ninjas.Controller.Services.NinjaModel;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue( strategy = jakarta.persistence.GenerationType.IDENTITY)

    private Long id;

    private String nome;

    private String dificuldade;

    //@OneToMany Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }
    public MissoesModel(String nome, String dificuldade, NinjaModel ninjas) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.ninjas = ninjas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDificuldade() {
        return dificuldade;
    }
    public void setDificuldade(String dificuldade) {}
    public NinjaModel getNinjas() {
        return ninjas;
    }
    public void setNinjas(NinjaModel ninjas) {
        this.ninjas = ninjas;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
