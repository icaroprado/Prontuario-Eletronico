package model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class FacadeServicos implements Servicos {
	
	private PreparedStatement stm;
	private Connection con;	
	private ResultSet rs;	
	
	public FacadeServicos(Connection con) {
		//stm = con.prepareStatement("");
		this.con=con;
	}
	
	public Date conversorData(String data) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");	
		//Date dataConvertida = new Date();
		try {
			return sdf1.parse(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
		stm.setString(2, pediatra.getNome());
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
	@Override
	public Pediatra realizarLogin(String login, String senha) throws SQLException {
		String sql =
				"SELECT * FROM bancopediatria.funcionario as f "
			+   "WHERE f.login = ? AND f.senha= ?";
		setStm(con.prepareStatement(sql));
		stm.setString(1, login);
		stm.setString(2, senha);		
		rs = stm.executeQuery();
		Pediatra pediatra = null;
		if (rs.isBeforeFirst() ){
			rs.next();
			Funcionario funcionario = new Funcionario(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			sql =
					"SELECT * FROM bancopediatria.pediatra as f "
				+	"WHERE f.funcionario_cpf = ?  ";
				setStm(con.prepareStatement(sql));
				stm.setString(1, funcionario.getcPF());
				rs= stm.executeQuery();
				if (rs.isBeforeFirst()) {					
					rs.next();
					pediatra = new Pediatra(funcionario,rs.getInt(1));					
					return pediatra;
				}	
		}
		return pediatra ;
	}
	@Override
	public Paciente buscarPaciente(String numeroProntuario) throws SQLException {
		String sql = 
					"SELECT * FROM bancopediatria.paciente AS p "
				+ 	"WHERE p.numeroprontuario = ? ";
		setStm(con.prepareStatement(sql));
		stm.setString(1, numeroProntuario);
		rs = stm.executeQuery();
		Paciente paciente = null;
		if (rs.isBeforeFirst()) {
			rs.next();
			paciente = new Paciente(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
					rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),
					rs.getString(14),rs.getString(15).charAt(0), rs.getInt(16) );
			sql = 
					"SELECT telefone FROM bancopediatria.telefonespacientes as t "
				+	"WHERE t.paciente_numeroprontuario = ? ";
			setStm(con.prepareStatement(sql));
			stm.setString(1, numeroProntuario);
			rs = stm.executeQuery();
			if (rs.isBeforeFirst()) {
				ArrayList<String> telefones = new ArrayList<String>();
				while (rs.next()) {
					telefones.add(rs.getString(1));
				}
				paciente.setTelefone(telefones);
			}
			return paciente;
		}
		
		
		return paciente;
	}
	@Override
		public void registrarConsulta(String numeroProntuario, int crm, String dataHora, String qpd, String hda,String is, double peso, double comprimento, double perimetroCefalico,
				String observacaoExameFisico,String diagnostico, String conduta, String observacoesFinais) throws SQLException {
		String sql = 
					"INSERT INTO bancopediatria.consultas(paciente_numeroprontuario,pediatra_crm,queixaprincipalduracao,historiadoencaatual,interrogatoriosintomatico," 
				+   "peso,comprimento,perimetrocefalico,observacaoexamefisico,diagnostico,conduta,observacoesfinais,dataehora ) "
				+   "VALUES	(?,?,?,?,?,?,?,?,?,?,?,?,?);";
		setStm(con.prepareStatement(sql));
		stm.setString(1, numeroProntuario);
		stm.setInt(2, crm);
		stm.setString(3,qpd);
		stm.setString(4,hda);
		stm.setString(5,is);
		stm.setDouble(6,peso);
		stm.setDouble(7,comprimento);
		stm.setDouble(8,perimetroCefalico);
		stm.setString(9, observacaoExameFisico);
		stm.setString(10,diagnostico);
		stm.setString(11, conduta);
		stm.setString(12, observacoesFinais);		
		stm.setString(13, dataHora);
		stm.execute();
		
	}

	

}
