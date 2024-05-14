package banco.digital.conta;

import banco.digital.cliente.Pessoa;
import banco.digital.exception.SaldoInsuficienteException;
import lombok.Getter;

public class Corrente extends ContaBase{

    @Getter
    private Double limiteEspecial;
    public Corrente(Pessoa cliente, Double limiteEspecial) {
        super(cliente);
        this.limiteEspecial = limiteEspecial;
    }

    
    @Override
    public void sacar(Double valor) throws SaldoInsuficienteException {
        if ((this.limiteEspecial + super.saldo) < valor)
            throw new SaldoInsuficienteException();
        if (valor - super.saldo == 0){
            super.saldo = 0;
            this.limiteEspecial -= valor;
        }else{
            super.sacar(valor);
        }
    }
    @Override
    public void imprimirExtrato() {
        super.visualisarExtrado();
        System.out.println(String.format("Limite Especial: %.2f", this.limiteEspecial));
    }
}
