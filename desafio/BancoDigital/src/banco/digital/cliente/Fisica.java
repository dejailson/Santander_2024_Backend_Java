package banco.digital.cliente;

import lombok.Getter;

public class Fisica extends Pessoa{
    
    @Getter
    private String cpf;

    public Fisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }
}
