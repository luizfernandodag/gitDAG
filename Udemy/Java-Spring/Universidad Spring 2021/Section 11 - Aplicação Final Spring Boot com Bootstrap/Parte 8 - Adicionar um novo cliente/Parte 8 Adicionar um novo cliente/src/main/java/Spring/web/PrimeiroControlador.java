package Spring.web;

import Spring.web.domain.Pessoa;
import Spring.web.service.PessoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@Slf4j
public class PrimeiroControlador {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/")
        public String inicio(Model model, @AuthenticationPrincipal User user)
        {
            List<Pessoa> pessoas;
            pessoas = pessoaService.listPessoa();
            //logs
            log.info("Executando o controlador");
            log.info("Usuario logado: " + user.toString());
            log.debug("Mais detalhes do controlador");
            //calculando saldo total e número de pessoas
            double saldoTotal = 0D;
            for(Pessoa p: pessoas)
            {
                if(p.getSaldo()!=null)
                saldoTotal += p.getSaldo();
            }

            //adicionando atributos ao objeto model
            model.addAttribute("saldoTotal", saldoTotal);
            model.addAttribute("totalClientes",pessoas.size());
            model.addAttribute("pessoas", pessoas);
            return "index";
        }

        @RequestMapping(value = "/salvar", method= RequestMethod.GET)
        public String guardar(Pessoa pessoa)
        {
            return "editar";
        }
        @RequestMapping(value = "/editar", method=RequestMethod.POST)
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
