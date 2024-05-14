package banco.digital.conta;

import banco.digital.cliente.Pessoa;
import banco.digital.exception.SaldoInsuficienteException;
import lombok.Getter;

public abstract class ContaBase implements IRelatorio{

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    @Getter
    public int agencia;
    @Getter
	public int numero;
    
	protected double saldo;
	protected Pessoa cliente;
    

    public ContaBase(Pessoa cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void sacar(Double valor) throws SaldoInsuficienteException{
        System.out.println(valor+" "+this.saldo);
        if ((this.saldo < valor))
            throw new SaldoInsuficienteException();
        this.saldo -= valor;
    }

    public void transferiri(Double valor,ContaBase destino) throws SaldoInsuficienteException{
       this.sacar(valor);
       destino.depositar(valor);
    }

    protected void visualisarExtrado() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
