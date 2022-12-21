package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;		
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Erro");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Erro");		
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Erro");		
	}
}
