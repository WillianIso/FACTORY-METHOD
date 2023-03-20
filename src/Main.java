import factoryMethod.CalculadoraFactory;
import factoryMethod.OperacaoMatematica;

public class Main {
    public static void main(String[] args) {
        CalculadoraFactory factory = new CalculadoraFactory();
        OperacaoMatematica operacao = factory.getOperacao("soma");
        double resultado = operacao.executar(2, 3);
        System.out.println(resultado); //  5.0
    }
}