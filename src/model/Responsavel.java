package model;

public class Responsavel {
	private String primeiroNome;
	private String sobrenome;
	private String cPF;
	private String antecedentesPatologicos;
	private String patologiasFamiliares;
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getcPF() {
		return cPF;
	}
	public void setcPF(String cPF) {
		this.cPF = cPF;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getPatologiasFamiliares() {
		return patologiasFamiliares;
	}
	public void setPatologiasFamiliares(String patologiasFamiliares) {
		this.patologiasFamiliares = patologiasFamiliares;
	}
	public String getAntecedentesPatologicos() {
		return antecedentesPatologicos;
	}
	public void setAntecedentesPatologicos(String antecedentesPatologicos) {
		this.antecedentesPatologicos = antecedentesPatologicos;
	}

}
