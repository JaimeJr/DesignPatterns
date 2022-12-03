package br.com.alura.loja;
import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDesconto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("2000"), 1);
		CalculadoDeDescontos calculadora = new CalculadoDeDescontos();
		System.out.println(calculadora.calcular(orcamento));
	}

}
