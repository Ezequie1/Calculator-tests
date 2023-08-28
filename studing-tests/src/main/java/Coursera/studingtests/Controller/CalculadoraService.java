package Coursera.studingtests.Controller;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CalculadoraService {

    public String soma(int numeroUm, int numeroDois){

        if (numeroUm > 499999999 || numeroDois > 499999999) return "Valor máximo atingido!";

        int resultado = numeroUm + numeroDois;

        return "A soma de " + numeroUm + " mais " + numeroDois + " equivale a: " + resultado + "!";
    }

    public String subtracao(int numeroUm, int numeroDois) {

        int resultado = numeroUm - numeroDois;

        return "A subtracao de " + numeroUm + " menos " + numeroDois + " equivale a: " + resultado + "!";
    }

    public String multiplicacao(int numeroUm, int numeroDois) {

        if( numeroUm == 0 || numeroDois == 0) return "Não há como fazer multiplicação por 0!";

        int resultado = numeroUm * numeroDois;

        return "A multiplicação de " + numeroUm + " vezes " + numeroDois + " equivale a: " + resultado + "!";
    }

    public String divisao(int numeroUm, int numeroDois) {

        if( numeroUm == 0 || numeroDois == 0) return "Não há como fazer divisao por 0!";

        int resultado = numeroUm / numeroDois;

        return "A divisao de " + numeroUm + " dividido por " + numeroDois + " equivale a: " + resultado + "!";
    }
}
