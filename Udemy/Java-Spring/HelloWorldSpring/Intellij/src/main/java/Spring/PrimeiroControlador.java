package Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroControlador {
        @GetMapping("/")
        public String helloWorld()
        {
            return "Hello world com spring no intellij";
        }
}
