package test;
import factoryMethod.CalculadoraFactory;
import factoryMethod.OperacaoMatematica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private final CalculadoraFactory factory = new CalculadoraFactory();

    @Test
    void testSoma() {
        OperacaoMatematica operacao = factory.getOperacao("soma");
        double resultado = operacao.executar(2, 3);
        assertEquals(5.0, resultado, 0.00001);
    }

    @Test
    void testSubtracao() {
        OperacaoMatematica operacao = factory.getOperacao("subtracao");
        double resultado = operacao.executar(5, 3);
        assertEquals(2.0, resultado, 0.00001);
    }

    @Test
    void testMultiplicacao() {
        OperacaoMatematica operacao = factory.getOperacao("multiplicacao");
        double resultado = operacao.executar(2, 3);
        assertEquals(6.0, resultado, 0.00001);
    }

    @Test
    void testDivisao() {
        OperacaoMatematica operacao = factory.getOperacao("divisao");
        double resultado = operacao.executar(6, 3);
        assertEquals(2.0, resultado);
    }
}