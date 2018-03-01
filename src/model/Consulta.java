package model;

import java.sql.Date;

public class Consulta {
	private String numero_prontuario;
	private int pediatra_CRM;
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
	public String getNumero_prontuario() {
		return numero_prontuario;
	}
	public void setNumero_prontuario(String numero_prontuario) {
		this.numero_prontuario = numero_prontuario;
	}
	public int getPediatra_CRM() {
		return pediatra_CRM;
	}
	public void setPediatra_CRM(int pediatra_CRM) {
		this.pediatra_CRM = pediatra_CRM;
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
