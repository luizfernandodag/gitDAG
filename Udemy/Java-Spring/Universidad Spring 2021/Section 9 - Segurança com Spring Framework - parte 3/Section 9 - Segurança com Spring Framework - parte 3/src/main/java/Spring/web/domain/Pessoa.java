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
    @NotEmpty
    private String nome;
    @NotEmpty
    private String sobrenome;
    @NotEmpty
    private String email;
    @NotEmpty
    private String telefone;

}
