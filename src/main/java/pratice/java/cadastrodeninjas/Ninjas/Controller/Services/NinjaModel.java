package pratice.java.cadastrodeninjas.Ninjas.Controller.Services;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pratice.java.cadastrodeninjas.Missoes.MissoesModel;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
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


as1z