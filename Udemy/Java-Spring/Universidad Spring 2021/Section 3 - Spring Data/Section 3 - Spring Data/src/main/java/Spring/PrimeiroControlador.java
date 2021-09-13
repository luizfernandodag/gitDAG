package Spring;

import Spring.domain.Pessoa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class PrimeiroControlador {

    @Value("${index.saudacao}")
    private String saudacao;

        @GetMapping("/")
        public String helloWorld(Model model)
        {   //logs
            log.info("Executando o controlador");
            log.debug("Mais detalhes do controlador");
            //atributos do model: passados via protocolo get
                //Objetos pessoa:
                Pessoa pessoa = new Pessoa();
                pessoa.setNome("Luiz");
                pessoa.setSobrenome("Gadelha");
                pessoa.setEmail("email@email.com");
                pessoa.setTelefone("123456789");
                Pessoa pessoa2 = new Pessoa();
                pessoa2.setNome("Luiz");
                pessoa2.setSobrenome("Gadelha");
                pessoa2.setEmail("email@email.com");
                pessoa2.setTelefone("123456789");
                String mensagem = "Hello com thymeleaf";
                //Lista de pessoas
                List<Pessoa> pessoas = new ArrayList<Pessoa>();
                pessoas.add(pessoa);
                pessoas.add(pessoa2);
            //adicionando atributos ao objeto model
            model.addAttribute("mensagem", mensagem);
            model.addAttribute("saudacao",saudacao);
            model.addAttribute("pessoa",pessoa);
            model.addAttribute("pessoa2",pessoa2);
            model.addAttribute("pessoas", pessoas);




            return "index";
        }
}
