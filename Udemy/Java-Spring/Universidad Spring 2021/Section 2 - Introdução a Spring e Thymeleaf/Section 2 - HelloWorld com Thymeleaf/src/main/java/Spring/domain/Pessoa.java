package Spring.domain;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
//@Entity
//@Table(name = "pessoa")
public class Pessoa  {
  //  private static final long serialVersionUID = 1L;
   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
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
