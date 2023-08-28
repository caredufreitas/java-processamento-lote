package br.com.resource.crimesSacramento.modelo;

public class CrimeSacramento {
	
	private String date;
	private String district;
	
	
	public CrimeSacramento() {
		super();
	}
	
	public CrimeSacramento(String date, String district) {
		this.carregaCrimeSacramento(date, district);
	}

	private void carregaCrimeSacramento(String date, String district) {
		this.date = date;
		this.district = district;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
}
