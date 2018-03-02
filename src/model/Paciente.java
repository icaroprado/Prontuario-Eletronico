package model;

import java.util.ArrayList;

public class Paciente {
	private String primeiroNome;
	private String numeroProntuario;
	private String sobrenome;
	private String rg;
	private String dataNascimento;
	private String naturalidade;
	private String nomePai;
	private String nomeMae;
	private String cpfPai;
	private String cpfMae;
	private String numeroRegistroCivilNascimento;
	private String numeroDeclaracaoNascidoVivo;
	private String numeroCartaoSus;
	private String racaCorEtnia;
	private char sexo;
	private byte grupoSanguineo;
	private ArrayList<String> telefone;
	
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getNumeroProntuario() {
		return numeroProntuario;
	}
	public void setNumeroProntuario(String numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getCpfPai() {
		return cpfPai;
	}
	public void setCpfPai(String cpfPai) {
		this.cpfPai = cpfPai;
	}
	public String getCpfMae() {
		return cpfMae;
	}
	public void setCpfMae(String cpfMae) {
		this.cpfMae = cpfMae;
	}
	public String getNumeroRegistroCivilNascimento() {
		return numeroRegistroCivilNascimento;
	}
	public void setNumeroRegistroCivilNascimento(String numeroRegistroCivilNascimento) {
		this.numeroRegistroCivilNascimento = numeroRegistroCivilNascimento;
	}
	public String getNumeroDeclaracaoNascidoVivo() {
		return numeroDeclaracaoNascidoVivo;
	}
	public void setNumeroDeclaracaoNascidoVivo(String numeroDeclaracaoNascidoVivo) {
		this.numeroDeclaracaoNascidoVivo = numeroDeclaracaoNascidoVivo;
	}
	public String getNumeroCartaoSus() {
		return numeroCartaoSus;
	}
	public void setNumeroCartaoSus(String numeroCartaoSus) {
		this.numeroCartaoSus = numeroCartaoSus;
	}
	public String getRacaCorEtnia() {
		return racaCorEtnia;
	}
	public void setRacaCorEtnia(String racaCorEtnia) {
		this.racaCorEtnia = racaCorEtnia;
	}
	public byte getGrupoSanguineo() {
		return grupoSanguineo;
	}
	public void setGrupoSanguineo(byte grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}	
	public ArrayList<String> getTelefone() {
		return telefone;
	}
	public void setTelefone(ArrayList<String> telefone) {
		this.telefone = telefone;
	} 

}
