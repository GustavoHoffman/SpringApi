package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        System.out.println(dados.crm());
    }

    @GetMapping
    public String getMedico(){
        return "Hello Spring!!!";
    }

    @PutMapping
    public String editar(){
        return "Hello Spring!!!";
    }
}
