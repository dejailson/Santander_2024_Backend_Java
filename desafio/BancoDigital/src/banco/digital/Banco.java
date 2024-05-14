package banco.digital;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import banco.digital.cliente.Pessoa;
import banco.digital.conta.ContaBase;
import banco.digital.conta.Corrente;
import banco.digital.conta.Poupanca;
import banco.digital.exception.ContaNaoExisteException;
import banco.digital.exception.SaldoInsuficienteException;
import lombok.Getter;
import lombok.Setter;

public class Banco {
    @Getter
    @Setter
    private String nome;
    private List<ContaBase> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<ContaBase>();
    }

    public ContaDTO criarContaCorrente(Pessoa Cliente,Double limiteEspecial){
        var conta = new Corrente(Cliente, limiteEspecial);
        this.contas.add(conta);
        return new ContaDTO(conta.getAgencia(),conta.getNumero());
    }


    public ContaDTO criarContaPoupanca(Pessoa Cliente){
        var conta = new Poupanca(Cliente);
        this.contas.add(conta);
        return new ContaDTO(conta.getAgencia(),conta.getNumero());
    }

    public void depositar(int agencia,int numero,Double valor){
        var conta = procurarConta(agencia,numero);
       
        conta.depositar(valor);
    }

    public void sacar(int agencia,int numero,Double valor) throws SaldoInsuficienteException{
        var conta = procurarConta(agencia,numero);
        conta.sacar(valor);
    }

    public void transferir(int agenciaOrigem,int numeroOrigem,int agenciaDestino,int numeroDestino,Double valor) throws SaldoInsuficienteException{
        var contaOrigem = procurarConta(agenciaOrigem,numeroOrigem);
        var contaDestino = procurarConta(agenciaDestino,numeroDestino);
        contaOrigem.transferiri(valor,contaDestino);
    }

    public void visualizarExtrato(int agencia,int numero) {
        var conta = procurarConta(agencia,numero);
        conta.imprimirExtrato();
    }

    private ContaBase procurarConta(int agencia,int numero) throws ContaNaoExisteException{
        Predicate<ContaBase> restricao = conta -> conta.getAgencia() == agencia && conta.getNumero() == numero;

        return contas.stream().filter(restricao).findFirst().orElseThrow(ContaNaoExisteException::new);
    }

}
