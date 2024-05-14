import banco.digital.Banco;
import banco.digital.cliente.Fisica;
import banco.digital.exception.SaldoInsuficienteException;

public class App {
    public static void main(String[] args) throws Exception {
        var bradesco = new Banco("Bradesco");

        var pessoaFisica = new Fisica("Carlos Santos", "123.231.243-34");

        var pessoaJuridica = new Fisica("Amanda Nunes", "222.231.243-34");

        var poupanca = bradesco.criarContaPoupanca(pessoaFisica);
        var corrente = bradesco.criarContaCorrente(pessoaJuridica, Double.valueOf(1000));

        bradesco.depositar(poupanca.agencia(), poupanca.numero(), Double.valueOf(200));
        bradesco.depositar(corrente.agencia(), corrente.numero(), Double.valueOf(200));

        bradesco.visualizarExtrato(poupanca.agencia(), poupanca.numero());
        bradesco.visualizarExtrato(corrente.agencia(), corrente.numero());
        bradesco.transferir(poupanca.agencia(), poupanca.numero(), corrente.agencia(), corrente.numero(), Double.valueOf(100));
        bradesco.visualizarExtrato(poupanca.agencia(), poupanca.numero());
        bradesco.visualizarExtrato(corrente.agencia(), corrente.numero());

        try{
            bradesco.sacar(poupanca.agencia(), poupanca.numero(), Double.valueOf(200));
        }catch(SaldoInsuficienteException e){
            System.err.println("Operação não concluída");
            System.err.println(e.getMessage());
        }
        
    }
}
