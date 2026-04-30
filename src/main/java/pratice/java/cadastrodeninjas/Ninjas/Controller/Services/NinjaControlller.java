package pratice.java.cadastrodeninjas.Ninjas.Controller.Services;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaControlller {

    @GetMapping("/boasvindas")
    @PostMapping
    @PutMapping
    @DeleteMapping
    @PatchMapping
    public String boasVindas() {
        return "Bem vindo ao cadastro de ninjas!";
    }
}
