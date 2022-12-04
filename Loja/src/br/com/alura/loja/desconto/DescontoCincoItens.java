package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoCincoItens extends Desconto{

	public DescontoCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento)
	{
    	return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
}
