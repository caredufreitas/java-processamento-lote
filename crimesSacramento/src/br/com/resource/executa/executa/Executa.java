package br.com.resource.executa.executa;

import java.io.FileNotFoundException;

import br.com.resource.processa.negocio.Processa;

public class Executa {

	public static void main(String[] args) throws FileNotFoundException {
		Processa.carregaArquivo();
	}

}
