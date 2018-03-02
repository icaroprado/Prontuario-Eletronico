package model;

import java.util.ArrayList;

public class Funcionario {

	private String cPF;
	private String primeiroNome;
	private String sobrenome;
	private String login;
	private String senha;
	private String email;
	private byte atribuicoes;//se eh gestor, ou outro possivel tipo de cargo a ser incluido aqui
	private ArrayList<String> telefone;
	public String getcPF() {
		return cPF;
	}
	public void setcPF(String cPF) {
		this.cPF = cPF;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<String> getTelefone() {
		return telefone;
	}
	public void setTelefone(ArrayList<String> telefone) {
		this.telefone = telefone;
	}
	public byte getAtribuicoes() {
		return atribuicoes;
	}
	public void setAtribuicoes(byte atribuicoes) {
		this.atribuicoes = atribuicoes;
	} 
}
