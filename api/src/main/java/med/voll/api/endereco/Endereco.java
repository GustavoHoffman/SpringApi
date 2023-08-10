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

    public void atualizar(DadosEndereco dados) {
        if(dados.logradouro() != null)
        {
            this.logradouro = dados.logradouro();
        }
        if(dados.cep() != null)
        {
            this.cep = dados.cep();
        }
        if(dados.uf() != null)
        {
            this.uf = dados.uf();
        }
        if(dados.bairro() != null)
        {
            this.bairro = dados.bairro();
        }
        if(dados.numero() != null)
        {
            this.numero = dados.numero();
        }
        if(dados.complemento() != null)
        {
            this.complemento = dados.complemento();
        }
        if(dados.cidade() != null)
        {
            this.cidade = dados.cidade();
        }
    }

    public void atualizarInformacoes(DadosEndereco dados) {

        if (dados.logradouro() != null)
            this.logradouro = dados.logradouro();
        if (dados.cep() != null)
            this.cep = dados.cep();
        if (dados.bairro() != null)
            this.bairro = dados.bairro();
        if (dados.uf() != null)
            this.uf = dados.uf();
        if (dados.cidade() != null)
            this.cidade = dados.cidade();
        if (dados.complemento() != null)
            this.complemento = dados.complemento();
        if (dados.numero() != null)
            this.numero = dados.numero();
    }
}
