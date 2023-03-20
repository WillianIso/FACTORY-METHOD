package factoryMethod;

public class CalculadoraFactory {
    public OperacaoMatematica getOperacao(String operacao) {
        switch (operacao) {
            case "soma":
                return new Soma();
            case "subtracao":
                return new Subtracao();
            case "multiplicacao":
                return new Multiplicacao();
            case "divisao":
                return new Divisao();
            default:
                throw new IllegalArgumentException("Operação inválida");
        }
    }
}