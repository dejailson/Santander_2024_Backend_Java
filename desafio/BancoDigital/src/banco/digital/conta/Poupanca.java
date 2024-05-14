package banco.digital.conta;

import banco.digital.cliente.Pessoa;

public class Poupanca extends ContaBase{

    public Poupanca(Pessoa cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
       super.visualisarExtrado();
    }
    
}
