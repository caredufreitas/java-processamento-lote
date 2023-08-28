package br.com.resource.apartamento.executa;

import java.io.FileNotFoundException;

import br.com.resource.apartamento.negocio.Condominio;

public class Executa {
	public static void main(String[] args) throws FileNotFoundException {
		
		Condominio.processaArquivo();
	}
}
