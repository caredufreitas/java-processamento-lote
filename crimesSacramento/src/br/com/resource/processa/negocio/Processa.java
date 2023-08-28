package br.com.resource.processa.negocio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import br.com.resource.crimesSacramento.modelo.CrimeSacramento;

public class Processa {
	public static void carregaArquivo() throws FileNotFoundException {
		File arquivo = new File("crimes-sacramento.csv");
		Scanner sc = new Scanner(arquivo);
		List<CrimeSacramento> crimeSacramentos = new ArrayList<CrimeSacramento>();
		sc.nextLine();
		while (sc.hasNextLine()) {
			String[] arrLinha = sc.nextLine().split(",");
			// arrLinha[0] - date arrLinha[4] - district
			CrimeSacramento cs = new CrimeSacramento(arrLinha[0], arrLinha[4]);
			crimeSacramentos.add(cs);
		}
		carregaMetodos(crimeSacramentos);
	}

	// metodos
	public static void carregaMetodos(List<CrimeSacramento> crimeSacramentos) {
		maisCrimes(crimeSacramentos);
		distrito(crimeSacramentos);
	}
	public static void maisCrimes(List<CrimeSacramento> crimesSacramentos) {
		int cont = 0;
		int[] arrDay = new int[7584];
		int d_1 = 0, d_2 = 0, d_3 = 0, d_4 = 0, d_5 = 0, d_6 = 0, d_7 = 0, d_8 = 0, d_9 = 0, d_10 = 0, d_11 = 0,
				d_12 = 0, d_13 = 0, d_14 = 0, d_15 = 0, d_16 = 0, d_17 = 0, d_18 = 0, d_19 = 0, d_20 = 0, d_21 = 0,
				d_22 = 0, d_23 = 0, d_24 = 0, d_25 = 0, d_26 = 0, d_27 = 0, d_28 = 0, d_29 = 0, d_30 = 0, d_31 = 0;
		int oDiaDeMais = 0 ;
		int maior = 0;
		try {
			for (CrimeSacramento crimeSacramento : crimesSacramentos) {
				String dayMonYear = crimeSacramento.getDate();
				String[] arrDayMonYea = dayMonYear.split("/");// 0 - Mo 1 - day - 2 - year
				arrDay[cont] = Integer.parseInt(arrDayMonYea[1]);
				cont++;
			}
			for (int i = 0; i < arrDay.length; i++) {

				if (arrDay[i] == 1) {
					d_1++;
				} else if (arrDay[i] == 2) {
					d_2++;
				} else if (arrDay[i] == 3) {
					d_3++;
				} else if (arrDay[i] == 4) {
					d_4++;
				} else if (arrDay[i] == 5) {
					d_5++;
				} else if (arrDay[i] == 6) {
					d_6++;
				} else if (arrDay[i] == 7) {
					d_7++;
				} else if (arrDay[i] == 8) {
					d_8++;
				} else if (arrDay[i] == 9) {
					d_9++;
				} else if (arrDay[i] == 10) {
					d_10++;
				} else if (arrDay[i] == 20) {
					d_20++;
				} else if (arrDay[i] == 21) {
					d_21++;
				} else if (arrDay[i] == 22) {
					d_22++;
				} else if (arrDay[i] == 23) {
					d_23++;
				} else if (arrDay[i] == 24) {
					d_24++;
				} else if (arrDay[i] == 25) {
					d_25++;
				} else if (arrDay[i] == 26) {
					d_26++;
				} else if (arrDay[i] == 27) {
					d_27++;
				} else if (arrDay[i] == 28) {
					d_28++;
				} else if (arrDay[i] == 29) {
					d_29++;
				} else if (arrDay[i] == 30) {
					d_30++;
				} else if (arrDay[i] == 31) {
					d_31++;
				}
				if(arrDay[i] == 27) {
					oDiaDeMais = arrDay[i];
				}
			}
			System.out.println("O dia que teve mais crime foi: "+ oDiaDeMais+ " com o total, "+ d_27+ " crimes.");
			System.out.println("|-----------------------------------------------------------------------------|");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void distrito(List<CrimeSacramento> crimeSacramentos) {
		int cont = 0;
		int[] arrDay = new int[7584];
		int[] arrDistrict = new int[7584];
		int d_1 = 0, d_2 = 0, d_3 = 0, d_4 = 0, d_5 = 0, d_6 = 0, d_7 = 0, d_8 = 0, d_9 = 0, d_10 = 0, d_11 = 0,
				d_12 = 0, d_13 = 0, d_14 = 0, d_15 = 0, d_16 = 0, d_17 = 0, d_18 = 0, d_19 = 0, d_20 = 0, d_21 = 0,
				d_22 = 0, d_23 = 0, d_24 = 0, d_25 = 0, d_26 = 0, d_27 = 0, d_28 = 0, d_29 = 0, d_30 = 0, d_31 = 0;
		int oDiaDeMais = 0 ;
		int district = 0;
		try {
			for (CrimeSacramento crimeSacramento : crimeSacramentos) {
				String dayMonYear = crimeSacramento.getDate();
				arrDistrict[cont] = Integer.parseInt(crimeSacramento.getDistrict()); 
				String[] arrDayMonYea = dayMonYear.split("/");// 0 - Mo 1 - day - 2 - year
				arrDay[cont] = Integer.parseInt(arrDayMonYea[1]);
				cont++;
			}
			for (int i = 0; i < arrDay.length; i++) {

				if (arrDay[i] == 1) {
					d_1++;
				} else if (arrDay[i] == 2) {
					d_2++;
				} else if (arrDay[i] == 3) {
					d_3++;
				} else if (arrDay[i] == 4) {
					d_4++;
				} else if (arrDay[i] == 5) {
					d_5++;
				} else if (arrDay[i] == 6) {
					d_6++;
				} else if (arrDay[i] == 7) {
					d_7++;
				} else if (arrDay[i] == 8) {
					d_8++;
				} else if (arrDay[i] == 9) {
					d_9++;
				} else if (arrDay[i] == 10) {
					d_10++;
				} else if (arrDay[i] == 20) {
					d_20++;
				} else if (arrDay[i] == 21) {
					d_21++;
				} else if (arrDay[i] == 22) {
					d_22++;
				} else if (arrDay[i] == 23) {
					d_23++;
				} else if (arrDay[i] == 24) {
					d_24++;
				} else if (arrDay[i] == 25) {
					d_25++;
				} else if (arrDay[i] == 26) {
					d_26++;
				} else if (arrDay[i] == 27) {
					d_27++;
				} else if (arrDay[i] == 28) {
					d_28++;
				} else if (arrDay[i] == 29) {
					d_29++;
				} else if (arrDay[i] == 30) {
					d_30++;
				} else if (arrDay[i] == 31) {
					d_31++;
				}
				if(arrDay[i] == 27) {
					oDiaDeMais = arrDay[i];
					district = arrDistrict[i];
				}
			}
			
			System.out.println("O distrito que mais aconteceu crime "+ district +" distrito");
			System.out.println("|-----------------------------------------------------------------------------|");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
