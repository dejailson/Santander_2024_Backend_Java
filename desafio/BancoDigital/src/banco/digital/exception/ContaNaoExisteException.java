package banco.digital.exception;

public class ContaNaoExisteException extends RuntimeException{

    public ContaNaoExisteException() {
        super("Conta Não Existe");
    }
    
}
