package Coursera.studingtests.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;

@SpringBootTest
class CalculadoraControllerTest {

    @Autowired
    private CalculadoraService service;

    @Test
    void retornaASomaDeAMaisBQuandoOUsuarioPassarOsValores() {

        int numeroUm = 25;
        int numeroDois = 25;
        String resultadoEsperado = "A soma de " + 25 + " mais " + 25 + " equivale a: " + 50 + "!";

        String resultado = service.soma(numeroUm, numeroDois);

        Assertions.assertEquals(resultado, resultadoEsperado);
    }

    @Test
    void mutationTestSomaToSubtracao() {

        CalculadoraService serviceMock = Mockito.mock(CalculadoraService.class);

        int numeroUm = 25;
        int numeroDois = 25;
        String resultadoEsperado = "A soma de " + 25 + " mais " + 25 + " equivale a: " + 50 + "!";

        when(serviceMock.soma(numeroUm, numeroDois)).thenReturn("A soma de " + 25 + " mais " + 25 + " equivale a: " + 0 + "!");


        String resultado = service.soma(numeroUm, numeroDois);

        Assertions.assertEquals(resultado, resultadoEsperado);
    }

    @Test
    void retornaASomaDeAMaisBQuandoOUsuarioPassarOsValoresMinimos() {

        int numeroUm = 1;
        int numeroDois = 1;
        String resultadoEsperado = "A soma de " + 1 + " mais " + 1 + " equivale a: " + 2 + "!";

        String resultado = service.soma(numeroUm, numeroDois);

        Assertions.assertEquals(resultado, resultadoEsperado);
    }

    @Test
    void retornaASomaDeAMaisBQuandoOUsuarioPassarOsValoresMaximos() {

        int numeroUm = 499999999;
        int numeroDois = 499999999;
        String resultadoEsperado = "A soma de " + 499999999 + " mais " + 499999999 + " equivale a: " + 999999998 + "!";

        String resultado = service.soma(numeroUm, numeroDois);

        Assertions.assertEquals(resultado, resultadoEsperado);
    }

    @Test
    void retornaUmTextoQuandoPassarUmValorMaiorQue499999999() {

        int numeroUm = 500000000;
        int numeroDois = 100000;
        String resultadoEsperado = "Valor máximo atingido!";

        String resultado = service.soma(numeroUm, numeroDois);

        Assertions.assertEquals(resultado, resultadoEsperado);

    }

    @Test
    void retornaASubtracaoDeAMenosBQuandoOUsuarioPassarOsValores() {

        int numeroUm = 50;
        int numeroDois = 12;
        String resultadoEsperado = "A subtracao de " + 50 + " menos " + 12 + " equivale a: " + 38 + "!";

        String resultado = service.subtracao(numeroUm, numeroDois);

        Assertions.assertEquals(resultado, resultadoEsperado);
    }

    @Test
    void retornaAMultiplicacaoDeAVezesBQuandoOUsuarioPassarOsValores() {

        int numeroUm = 10;
        int numeroDois = 12;
        String resultadoEsperado = "A multiplicação de " + 10 + " vezes " + 12 + " equivale a: " + 120 + "!";

        String resultado = service.multiplicacao(numeroUm, numeroDois);

        Assertions.assertEquals(resultado, resultadoEsperado);
    }

    @Test
    void retornaUmTextoQuandoPassadoUmValorIgualAZeroParaMultiplicar() {

        int numeroUm = 0;
        int numeroDois = 12;
        String resultadoEsperado = "Não há como fazer multiplicação por 0!";

        String resultado = service.multiplicacao(numeroUm, numeroDois);

        Assertions.assertEquals(resultado, resultadoEsperado);
    }

    @Test
    void retornaUmTextoQuandoPassadoUmValorIgualAZeroParaDividisao() {

        int numeroUm = 0;
        int numeroDois = 12;
        String resultadoEsperado = "Não há como fazer divisao por 0!";

        String resultado = service.divisao(numeroUm, numeroDois);

        Assertions.assertEquals(resultado, resultadoEsperado);
    }

    @Test
    void retornaADivisaoDeADivididoPorBQuandoOUsuarioPassarOsValores() {

        int numeroUm = 100;
        int numeroDois = 5;
        String resultadoEsperado = "A divisao de " + 100 + " dividido por " + 5 + " equivale a: " + 20 + "!";

        String resultado = service.divisao(numeroUm, numeroDois);

        Assertions.assertEquals(resultado, resultadoEsperado);
    }
}