package Spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PrimeiroControlador {
        @GetMapping("/")
        public String helloWorld()
        {
            log.info("Executando o controlador");
            log.debug("Mais detalhes do controlador");
            return "Hello world com spring no intellij";
        }
}
