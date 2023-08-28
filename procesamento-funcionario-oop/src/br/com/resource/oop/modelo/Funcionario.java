package br.com.resource.oop.modelo;

public class Funcionario {
	
	private String nomeEmpregado;
	private String nomeGerente;
	private String alocacao;
	private String localTrabalho;
	private String sexo;
	
	public Funcionario(String[] linha) {
		carregaFuncionario(linha);
	}
	
	public String getNomeEmpregado() {
		return nomeEmpregado;
	}
	public void setNomeEmpregado(String nomeEmpregado) {
		this.nomeEmpregado = nomeEmpregado;
	}
	public String getNomeGerente() {
		return nomeGerente;
	}
	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}
	public String getAlocacao() {
		return alocacao;
	}
	public void setAlocacao(String alocacao) {
		this.alocacao = alocacao;
	}
	public String getLocalTrabalho() {
		return localTrabalho;
	}
	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	private void carregaFuncionario(String[] linha) {
		this.nomeEmpregado = linha[5];
		this.nomeGerente = linha[9];
		this.alocacao = linha[16];
		this.localTrabalho = linha[20];
		this.sexo = linha[25];		
	}
	
}
