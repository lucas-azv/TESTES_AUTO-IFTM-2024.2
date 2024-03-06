import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.edu.iftm.tspi.Calculadora;

public class CalculadoraTest {
    
    @Test
    void testeSomaDoisInteirosRetornaCorreto(){
        Calculadora calc = new Calculadora();

        int numero1 = 10;
        int numero2 = 20;
        int resultadoEsperado = 30;

        int resultado = calc.somar(numero1, numero2);

        if(resultadoEsperado!=resultado){
            System.out.println("Resultado não esperado" + resultado);
        } else{
            System.out.println("passou no teste!");
        }
        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}