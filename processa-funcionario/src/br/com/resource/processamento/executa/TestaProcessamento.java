package br.com.resource.processamento.executa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestaProcessamento {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File arquivo = new File("Ck_semvalor.csv");
		Scanner sc = new Scanner(arquivo);
		String[] arrPaulista = new String[606];
		String[] arrFuncGerente = new String[605];
		String[] arrFuncMascItau = new String[605];
		int cont = 0;
		int sexoF = 0;
		
		while(sc.hasNextLine()) {//processamento
			String linha = sc.nextLine();
			String[] arrLinha = linha.split(";");
			//26 colunas
			
			if(arrLinha.length == 26) {//Tarefa 1 selecionar coluna 20 e mostra coluna 5
				
				if(arrLinha[20].equals("RES. PAULISTA")) {
					arrPaulista[cont] = arrLinha[5];
				}
				if(arrLinha[25].equals("Feminino")) {//selecionar coluna 25 mostra qtd sexo Feminino
					sexoF++;
				}
				
				if(arrLinha[9].equals("ETIENNE HENRIQUE JENSEN FILHO")) {//selecionar coluna 9 e mostrar os funcionarios
					arrFuncGerente[cont] = arrLinha[5];
				}
				
				if(arrLinha[25].equals("Masculino") && arrLinha[16].equals("BANCO ITAU")) {//selecionar coluna 25 do sexo Masculino e coluna 16 do Banco Itau e mostra funcionarios
					arrFuncMascItau[cont] = arrLinha[5];
				}
			}
		
			cont++;
		}
		for (int i = 0; i < arrPaulista.length; i++) {
			if(arrPaulista[i] != null) {
				System.out.println("Funcionários que estão na Paulista: "+ arrPaulista[i]);
			}
		}
		System.out.println("|--------------------------------------------------------------------------------|");//processamento
		System.out.println("Quantidade de funcionária do sexo FEMININO: "+ sexoF);
		System.out.println("|--------------------------------------------------------------------------------|");
		for (int i = 0; i < arrFuncGerente.length; i++) {
			if (arrFuncGerente[i] != null) {
				System.out.println("Funcionários do Gerente ETIENNE HENRIQUE JENSEN FILHO: "+ arrFuncGerente[i]);
			}
		}
		System.out.println("|---------------------------------------------------------------------------------|");
		for (int j = 0; j < arrFuncMascItau.length; j++) {
			if(arrFuncMascItau[j] != null) {
				System.out.println("Funcinario Masculino que trabalha o banco Itaú: "+ arrFuncMascItau[j]);
			}
		}
	}

}
