package Spring.web;

import Spring.web.domain.Pessoa;
import Spring.web.service.PessoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class PrimeiroControlador {

    @Autowired
    private PessoaService pessoaService;



    @GetMapping("/")
        public String helloWorld(Model model)
        {
            Iterable<Pessoa> pessoas;
            pessoas = pessoaService.listPessoa();
            //logs
            log.info("Executando o controlador");
            log.debug("Mais detalhes do controlador");

            //adicionando atributos ao objeto model

            model.addAttribute("pessoas", pessoas);




            return "index";
        }
}
