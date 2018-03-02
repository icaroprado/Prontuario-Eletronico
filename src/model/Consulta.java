package model;

import java.sql.Date;

public class Consulta {
	private String numeroProntuario;
	private int pediatraCRM;
	private Date dataHora;
	private String qPD;
	private String hDA;
	private String iS;
	private float peso;
	private float comprimento;
	private float perimetroCefalico;
	private String observacaoExamefisico;
	private String diagnostico;
	private String conduta;
	private String observacoesFinais;
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
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public String gethDA() {
		return hDA;
	}
	public void sethDA(String hDA) {
		this.hDA = hDA;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getiS() {
		return iS;
	}
	public void setiS(String iS) {
		this.iS = iS;
	}
	public float getPerimetroCefalico() {
		return perimetroCefalico;
	}
	public void setPerimetroCefalico(float perimetroCefalico) {
		this.perimetroCefalico = perimetroCefalico;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
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
