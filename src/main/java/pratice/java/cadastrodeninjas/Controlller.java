package pratice.java.cadastrodeninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controlller {

    @GetMapping("/boasvindas")
    @PostMapping
    @PutMapping
    @DeleteMapping
    @PatchMapping
    public String boasVindas() {
        return "Bem vindo ao cadastro de ninjas!";
    }
}
