package Spring.web.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pessoa;
    @NotEmpty(message = "Erro em nome - Não pode ser vazio")
    private String nome;
    @NotEmpty(message = "Erro em sobrenome - Não pode ser vazio")
    private String sobrenome;
    @NotEmpty(message = "Erro em email - Não pode ser vazio")
    private String email;
    @NotEmpty(message = "Erro em telefone - Não pode ser vazio")
    private String telefone;

}
