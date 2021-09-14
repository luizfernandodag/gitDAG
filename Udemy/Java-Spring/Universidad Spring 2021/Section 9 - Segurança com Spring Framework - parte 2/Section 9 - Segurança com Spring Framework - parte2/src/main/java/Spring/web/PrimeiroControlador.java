package Spring.web;

import Spring.web.domain.Pessoa;
import Spring.web.service.PessoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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

        @GetMapping("/guardar")
        public String guardar(Pessoa pessoa)
        {
            return "editar";
        }
        @PostMapping("/salvar")
        public String salvar(@Valid Pessoa pessoa, Errors errors)
        {
            if(errors.hasErrors())
            {
                return "editar";
            }
            pessoaService.savePessoa(pessoa);
            return "redirect:/";
        }

        @GetMapping("/editar/{id_pessoa}")
        public String editar(Pessoa pessoa, Model model)
        {
            Pessoa pessoaEditar = pessoaService.findPessoa(pessoa);
            model.addAttribute("pessoa", pessoaEditar);
            return "editar";
        }
        @GetMapping("/deletar/{id_pessoa}")
        public String deletar(Pessoa pessoa)
        {
            pessoaService.deletePessoa(pessoa);
            return "redirect:/";
        }



}
