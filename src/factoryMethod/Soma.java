package factoryMethod;

public class Soma implements OperacaoMatematica {
    @Override
    public double executar(double numero1, double numero2) {
        return numero1 + numero2;
    }
}