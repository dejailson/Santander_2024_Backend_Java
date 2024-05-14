package banco.digital.cliente;

import lombok.Getter;

public abstract class Pessoa {
    
    private static int CODIGO_PADRAO = 1;
    @Getter
    private int codigo;
    @Getter
    private String nome;

    public Pessoa(String nome) {
        this.codigo = CODIGO_PADRAO++;
        this.nome = nome;
    }
}
