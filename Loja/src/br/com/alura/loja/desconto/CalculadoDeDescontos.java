package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoDeDescontos {

	public BigDecimal calcular(Orcamento orcamento)	{
	  Desconto desconto = new DescontoCincoItens(new DescontoValorQuinhentos(new SemDesconto()));
	  return desconto.calcular(orcamento);	  
	}
}
