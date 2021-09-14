package Spring.web;

import Spring.web.dao.IPessoaDao;
import Spring.web.domain.Pessoa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class PrimeiroControlador {

    @Autowired(required = true)
    private IPessoaDao pessoaDao;



    @GetMapping("/")
        public String helloWorld(Model model)
        {
            Iterable<Pessoa> pessoas;
            pessoas = pessoaDao.findAll();
            //logs
            log.info("Executando o controlador");
            log.debug("Mais detalhes do controlador");

            //adicionando atributos ao objeto model

            model.addAttribute("pessoas", pessoas);




            return "index";
        }
}
