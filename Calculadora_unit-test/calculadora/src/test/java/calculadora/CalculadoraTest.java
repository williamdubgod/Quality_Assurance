package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc = new Calculadora();
	@Test
	public void testSoma() {
		int valor1 = 2;
		int valor2 = 2;
		int resultado = calc.somar(valor1,valor2);
		assertEquals(4, resultado);
		System.out.println("O resultado da soma de "+ valor1 + " e " + valor2 + " é: " + resultado);
		
	}
	@Test
	public void testSubtrai() {
		int valor1 = 2;
		int valor2 = 1;
		int resultado = calc.subtrair(valor1,valor2);
		assertEquals(1, resultado);
		System.out.println("O resultado da subtracao de "+ valor1 + " e " + valor2 + " é: " + resultado);
		
	}
	@Test
	public void testMultiplica() {
		int valor1 = 2;
		int valor2 = 5;
		int resultado = calc.multiplicar(valor1,valor2);
		assertEquals(10, resultado);
		System.out.println("O resultado da multiplicacao de "+ valor1 + " e " + valor2 + " é: " + resultado);
		
	}
	@Test
	public void testDividir() {
		int valor1 = 10;
		int valor2 = 5;
		int resultado = calc.dividir(valor1,valor2);
		assertEquals(2, resultado);
		System.out.println("O resultado da divisao de "+ valor1 + " e " + valor2 + " é: " + resultado);
		
	}
	
}
