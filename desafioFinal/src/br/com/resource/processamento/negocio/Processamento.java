/*
 * separa os dados que contém no arquivo e faz regra de negócio reusltado = vl_preco * quantidade
 * entre o prazo de dias corridos na diferença entre dt_inicio e a dt_fim.
 * @author carlosFreitas
 */
package br.com.resource.processamento.negocio;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Processamento {

	/* metodo de processamento dos arquivos operacoes.csv e dadosMercado.csv */
	public static void processaArquivo() throws IOException {
		System.out.println("Inicio processamento.");
		List<String> listaOperacao = Files.readAllLines(Paths.get("Operacoes.csv"));
		List<String> listaMercado = Files.readAllLines(Paths.get("DadosMercado.csv"));

		// operacoes.csv, dataInicio[1], dataFim[2], subProduto[9], quantidade[12],
		// idPrecoOperacao[13]
		for (String linhaOperacao : listaOperacao.subList(1, listaOperacao.size())) {
			String[] arrOperacao = linhaOperacao.split(";");
			try {
				LocalDate dtInicio = LocalDate.parse(arrOperacao[1], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				LocalDate dtFim = LocalDate.parse(arrOperacao[2], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				long diferencaDias = ChronoUnit.DAYS.between(dtInicio, dtFim);
				String sProduto = arrOperacao[9];
				BigDecimal qtd = new BigDecimal(Double.parseDouble(arrOperacao[12].replace(',', '.')));

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Fim processamento. ");
		}
	}
}
