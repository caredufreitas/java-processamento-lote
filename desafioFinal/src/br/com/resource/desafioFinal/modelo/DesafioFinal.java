package br.com.resource.desafioFinal.modelo;

import java.math.BigDecimal;

public class DesafioFinal {
	private Long diferencaDias;
	private String subProduto;
	private BigDecimal quantidade;
	private int idPrecoOperacao;
	private int idPrecoMercado;
	private int numPrazoDiasCorridos;
	private BigDecimal precoMercado;
	
	
	
	public DesafioFinal(Long diferencaDias, String subProduto, BigDecimal quantidade, int idPrecoOperacao,
			int idPrecoMercado, int numPrazoDiasCorridos, BigDecimal precoMercado) {
		super();
		this.diferencaDias = diferencaDias;
		this.subProduto = subProduto;
		this.quantidade = quantidade;
		this.idPrecoOperacao = idPrecoOperacao;
		this.idPrecoMercado = idPrecoMercado;
		this.numPrazoDiasCorridos = numPrazoDiasCorridos;
		this.precoMercado = precoMercado;
	}
	
	public Long getDiferencaDias() {
		return diferencaDias;
	}
	public void setDiferencaDias(Long diferencaDias) {
		this.diferencaDias = diferencaDias;
	}
	public String getSubProduto() {
		return subProduto;
	}
	public void setSubProduto(String subProduto) {
		this.subProduto = subProduto;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	public int getIdPrecoOperacao() {
		return idPrecoOperacao;
	}
	public void setIdPrecoOperacao(int idPrecoOperacao) {
		this.idPrecoOperacao = idPrecoOperacao;
	}
	public int getIdPrecoMercado() {
		return idPrecoMercado;
	}
	public void setIdPrecoMercado(int idPrecoMercado) {
		this.idPrecoMercado = idPrecoMercado;
	}
	public int getNumPrazoDiasCorridos() {
		return numPrazoDiasCorridos;
	}
	public void setNumPrazoDiasCorridos(int numPrazoDiasCorridos) {
		this.numPrazoDiasCorridos = numPrazoDiasCorridos;
	}
	public BigDecimal getPrecoMercado() {
		return precoMercado;
	}
	public void setPrecoMercado(BigDecimal precoMercado) {
		this.precoMercado = precoMercado;
	}
	
}
