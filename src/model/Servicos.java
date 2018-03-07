package model;


import java.sql.SQLException;

public interface Servicos {
	public void exibirGraficoIMC();
	public void exibirGraficoPerimetroCefalico();
	public void exibirGraficoComprimento();
	public void exibirGraficoPeso();
	public void exibirFormPrimeiraConsulta();
	public void exibirFormConsultas();
	public void exibirFormCadastroPaciente();
	public void exibirFormCadastroPediatra();
	public void exibirRelatorio();
	public void exibirFormLogin();
	public void cadastrarPediatra(Pediatra pediatra) throws SQLException;
	public void cadastrarFuncionario(Funcionario funcionario);
	public void cadastrarPaciente(Paciente paciente) throws SQLException;
	
	public Paciente buscarPaciente(String numeroProntuario) throws SQLException;
	public Pediatra realizarLogin(String login, String senha) throws SQLException;
	public void registrarConsulta(String numeroProntuario, int crm, String dataHora, String qpd, String hda, String is,
			double peso, double comprimento, double perimetroCefalico, String obeservacaoExameFisico, String diagnostico,
			String conduta, String observacoesFinais) throws SQLException;
	
	}
