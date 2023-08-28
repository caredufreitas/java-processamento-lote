package br.com.resource.apartamentos.modelo;

public class Apartamento {
	
	private String apartamento;
	private String valor;

	public Apartamento(String[] linha) {
		this.carregaApartamento(linha);
	}
	
	public String getApartamento() {
		return apartamento;
	}
	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	private void carregaApartamento(String[] linha) {
		this.apartamento = linha[0];
		this.valor = linha[1];
	}
}
