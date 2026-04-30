package pratice.java.cadastrodeninjas.Missoes;

import jakarta.persistence.*;
import pratice.java.cadastrodeninjas.Ninjas.Controller.Services.NinjaModel;

import java.util.List;

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


}
