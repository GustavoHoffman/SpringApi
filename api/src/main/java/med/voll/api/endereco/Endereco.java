package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String uf;
    private String cidade;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.cep = endereco.cep();
        this.uf = endereco.uf();
        this.bairro= endereco.bairro();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.cidade = endereco.cidade();
    }
}
