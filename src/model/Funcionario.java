package model;

public class Funcionario {

	private String cPF;
	private String primeiroNome;
	private String sobrenome;
	private String login;
	private String senha;
	private String email;
	private int atribuicoes;//se eh gestor, ou outro possivel tipo de cargo a ser incluido aqui
	private String telefone;
	
	public Funcionario() {};
	public Funcionario(String cPF,String primeiroNome, String sobrenome, String login, String senha, String email, String telefone) {
		this.setcPF(cPF);
		this.setPrimeiroNome(primeiroNome);
		this.setSobrenome(sobrenome);
		this.setLogin(login);
		this.setSenha(senha);
		this.setAtribuicoes(0);
		this.setTelefone(telefone);	
	}
	
	public String getcPF() {
		return cPF;
	};
	public void setcPF(String cPF) {
		this.cPF = cPF;
	};
	public String getSobrenome() {
		return sobrenome;
	};
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	};
	public String getPrimeiroNome() {
		return primeiroNome;
	};
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	};
	public String getSenha() {
		return senha;
	};
	public void setSenha(String senha) {
		this.senha = senha;
	};
	public String getLogin() {
		return login;
	};
	public void setLogin(String login) {
		this.login = login;
	};
	public String getEmail() {
		return email;
	};
	public void setEmail(String email) {
		this.email = email;
	};
	public String getTelefone() {
		return telefone;
	};
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	};
	public int getAtribuicoes() {
		return atribuicoes;
	};
	public void setAtribuicoes(int atribuicoes) {
		this.atribuicoes = atribuicoes;
	}; 
	public String getNomeCompleto() {
		return primeiroNome+sobrenome;
	}
}
