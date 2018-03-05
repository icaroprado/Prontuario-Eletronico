package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FacadeServicos implements Servicos {
	
	private PreparedStatement stm;
	private Connection con;	
	
	public FacadeServicos(Connection con) {
		//stm = con.prepareStatement("");
		this.con=con;
	}
	public FacadeServicos() {
		
	}

	@Override
	public void exibirGraficoIMC() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirGraficoPerimetroCefalico() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirGraficoComprimento() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirGraficoPeso() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirFormPrimeiraConsulta() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirFormConsultas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirFormCadastroPaciente() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirFormCadastroPediatra() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirRelatorio() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirFormLogin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cadastrarPediatra(Pediatra pediatra) throws SQLException {
		// Usaremos prepared statement pra deixar mais organizado, pois são muitas entradas em algumas tabelas
		String sql= 
					"INSERT INTO bancopediatria.funcionario(cpf,nome,login,senha,telefone, email) "
				+	"values (?,?,?,?,?,?); "
				+   "INSERT INTO bancopediatria.pediatra (funcionario_cpf, crm, outrasatribuicoes) "
				+	"values (?,?,?); ";				
				
		setStm(con.prepareStatement(sql));
		stm.setString(1, pediatra.getcPF());
		stm.setString(2, pediatra.getNomeCompleto());
		stm.setString(3, pediatra.getLogin());
		stm.setString(4, pediatra.getSenha());
		stm.setString(5, pediatra.getTelefone());
		stm.setString(6, pediatra.getEmail());
		stm.setString(7, pediatra.getcPF());
		stm.setInt(8, pediatra.getcRM());
		stm.setInt(9, pediatra.getAtribuicoes());
		//stm.executeQuery();
		stm.execute();
		
	}

	@Override
	public void cadastrarFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}
	public PreparedStatement getStm() {
		return stm;
	}
	public void setStm(PreparedStatement stm) {
		this.stm = stm;
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	@Override
	public void cadastrarPaciente(Paciente paciente) throws SQLException {
		String sql= 
					"INSERT INTO bancopediatria.paciente(primeironome,sobenome,numeroprontuario,rg,datanascimento, naturalidade, "
				+   "nomepai,nomemae,cpfpai,cpfmae,numeroregistrocivilnascimento,numerodeclaracaonascidovivo,numerocartaosus,racacoretnia,"
				+   "sexo, gruposanguineo ) "
				+	"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); ";
		setStm(con.prepareStatement(sql));
		stm.setString(1, paciente.getPrimeiroNome());
		stm.setString(2, paciente.getSobrenome());
		stm.setString(3, paciente.getNumeroProntuario());
		stm.setString(4, paciente.getRg());
		stm.setString(5, paciente.getDataNascimento());
		stm.setString(6, paciente.getNaturalidade());
		stm.setString(7, paciente.getNomePai());
		stm.setString(8, paciente.getNomeMae());
		stm.setString(9, paciente.getCpfPai());
		stm.setString(10, paciente.getCpfMae());
		stm.setString(11, paciente.getNumeroRegistroCivilNascimento());
		stm.setString(12, paciente.getNumeroDeclaracaoNascidoVivo());
		stm.setString(13, paciente.getNumeroCartaoSus() );
		stm.setString(14, paciente.getRacaCorEtnia() );
		stm.setString(15, paciente.getSexo());
		stm.setInt(16, paciente.getGrupoSanguineo());
		stm.execute();
		
	}

	

}
