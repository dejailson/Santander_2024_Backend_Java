package banco.digital.cliente;

import lombok.Getter;

public class Juridica extends Pessoa{

    @Getter
    private String cnpj;
    public Juridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }
}
