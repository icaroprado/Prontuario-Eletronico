package model;

public class Pediatra extends Funcionario {
	private int cRM;
	
	public Pediatra() {
		this.setAtribuicoes(1);
	};

	public Pediatra(String cPF, String primeiroNome, String sobrenome,int cRM, String login, String senha, String email, String telefone) {
		this.setcPF(cPF);
		this.setPrimeiroNome(primeiroNome);
		this.setSobrenome(sobrenome);
		this.setLogin(login);
		this.setSenha(senha);
		this.setAtribuicoes(1);
		this.setTelefone(telefone);
		this.setcRM(cRM);
		
	}
	
	public int getcRM() {
		return cRM;
	}
	
	

	public void setcRM(int cRM) {
		this.cRM = cRM;
	}
}
