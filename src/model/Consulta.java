package model;

public class Consulta {
	private String numeroProntuario;
	private int pediatraCRM;
	private String dataHora;
	private String qPD;
	private String hDA;
	private String iS;
	private double peso;
	private double comprimento;
	private double perimetroCefalico;
	private String observacaoExamefisico;
	private String diagnostico;
	private String conduta;
	private String observacoesFinais;
	
	public Consulta(String numeroProntuario, int pediatraCRM, String dataHora, String qPD, String hDA, String iS,
			double peso, double comprimento, double perimetroCefalico, String observacaoExamefisico, String diagnostico,
			String conduta, String observacoesFinais) {
		super();
		this.numeroProntuario = numeroProntuario;
		this.pediatraCRM = pediatraCRM;
		this.dataHora = dataHora;
		this.qPD = qPD;
		this.hDA = hDA;
		this.iS = iS;
		this.peso = peso;
		this.comprimento = comprimento;
		this.perimetroCefalico = perimetroCefalico;
		this.observacaoExamefisico = observacaoExamefisico;
		this.diagnostico = diagnostico;
		this.conduta = conduta;
		this.observacoesFinais = observacoesFinais;
	}
	public String getNumeroprontuario() {
		return numeroProntuario;
	}
	public void setNumeroprontuario(String numero_prontuario) {
		this.numeroProntuario = numero_prontuario;
	}
	public int getPediatraCRM() {
		return pediatraCRM;
	}
	public void setPediatraCRM(int pediatra_CRM) {
		this.pediatraCRM = pediatra_CRM;
	}
	public String getqPD() {
		return qPD;
	}
	public void setqPD(String qPD) {
		this.qPD = qPD;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String gethDA() {
		return hDA;
	}
	public void sethDA(String hDA) {
		this.hDA = hDA;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getiS() {
		return iS;
	}
	public void setiS(String iS) {
		this.iS = iS;
	}
	public double getPerimetroCefalico() {
		return perimetroCefalico;
	}
	public void setPerimetroCefalico(double perimetroCefalico) {
		this.perimetroCefalico = perimetroCefalico;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public String getObservacaoExamefisico() {
		return observacaoExamefisico;
	}
	public void setObservacaoExamefisico(String observacaoExamefisico) {
		this.observacaoExamefisico = observacaoExamefisico;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getObservacoesFinais() {
		return observacoesFinais;
	}
	public void setObservacoesFinais(String observacoesFinais) {
		this.observacoesFinais = observacoesFinais;
	}
	public String getConduta() {
		return conduta;
	}
	public void setConduta(String conduta) {
		this.conduta = conduta;
	}
	
	
	
}
