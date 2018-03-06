package model;

public class Pediatra extends Funcionario {
	private int cRM;
	
	public Pediatra() {
		this.setAtribuicoes(1);
	};

	public Pediatra(String cPF, String nome,int cRM, String login, String senha, String email, String telefone) {
		this.setcPF(cPF);
		this.setNome(nome);
		this.setLogin(login);
		this.setSenha(senha);
		this.setAtribuicoes(1);
		this.setTelefone(telefone);
		this.setcRM(cRM);
		
	}
	public Pediatra(Funcionario funcionario, int crm) {
		this.cRM=crm;
		this.setAtribuicoes(1);
		this.setNome(funcionario.getNome());
		this.setLogin(funcionario.getLogin());
		this.setcPF(funcionario.getcPF());
		this.setSenha(funcionario.getSenha());
		this.setTelefone(funcionario.getTelefone());
		
	}
	
	public int getcRM() {
		return cRM;
	}
	
	

	public void setcRM(int cRM) {
		this.cRM = cRM;
	}
}
