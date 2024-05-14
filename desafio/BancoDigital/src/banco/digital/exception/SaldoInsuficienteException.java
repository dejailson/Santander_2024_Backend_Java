package banco.digital.exception;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException() {
        super("Saldo Insufienciente");
    }    
}
