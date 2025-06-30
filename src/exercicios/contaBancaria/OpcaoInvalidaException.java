package exercicios.contaBancaria;

public class OpcaoInvalidaException extends RuntimeException {
    private int opcao;

    public OpcaoInvalidaException(int opcao) {
        super();
        this.opcao = opcao;
    }

    @Override
    public String toString() {
        return "A Opção " + opcao + " é inexistente. Insira novamente";
    }
}
