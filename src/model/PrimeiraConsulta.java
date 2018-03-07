package model;

public class PrimeiraConsulta extends Consulta {
	
	public PrimeiraConsulta(String numeroProntuario, int pediatraCRM, String dataHora, String qPD, String hDA, String iS,
			float peso, float comprimento, float perimetroCefalico, String observacaoExamefisico, String diagnostico,
			String conduta, String observacoesFinais) {
		super(numeroProntuario, pediatraCRM, dataHora, qPD, hDA, iS, peso, comprimento, perimetroCefalico,
				observacaoExamefisico, diagnostico, conduta, observacoesFinais);
		// TODO Auto-generated constructor stub
	}
	private byte  alimentacaoPrimeiroSemestre;
	private byte  alimentacaoSegundoSemestre;
	private String evolucaoAlimentacao;
	private byte firmouCabeca;
	private byte fixouOlhar;
	private byte primeiroSorriso;
	private byte sentouSemApoio;
	private byte primeiraPalavra;
	private byte primeirosDentes;
	private byte largouFraldasDuranteDia;
	private byte largouFraldasDuranteNoite;
	private byte engatinhou;
	private byte andou;
	private byte enxergaBem;
	private byte ouveBem;
	private byte aproveitamentoEscolar;
	private byte comportamentoSocial;
	private String antecedentesVacinais;
	private String medicacoesEmUso;
	private byte condicoesDeSonoAtuais;
	private byte apetite;
	private String habitoUrinario;
	private String habitoIntestinal;
	private byte atividadeFisica;
	private byte alimentacaoAtual;
	private String observacaoAlimentacaoAtual;
	private String doencasAnterioresRelevantes;
	private String operacoesRelevantes;
	private String sofreuAcidentes;
	private String sofreuInternacoes;
	private String alergias;
	private String usoMedicamentos;
	private float iMC;
	private String observacaoExameFisico;
	
	
	
	public byte getAlimentacaoPrimeiroSemestre() {
		return alimentacaoPrimeiroSemestre;
	}
	public void setAlimentacaoPrimeiroSemestre(byte alimentacaoPrimeiroSemestre) {
		this.alimentacaoPrimeiroSemestre = alimentacaoPrimeiroSemestre;
	}
	public byte getAlimentacaoSegundoSemestre() {
		return alimentacaoSegundoSemestre;
	}
	public void setAlimentacaoSegundoSemestre(byte alimentacaoSegundoSemestre) {
		this.alimentacaoSegundoSemestre = alimentacaoSegundoSemestre;
	}
	public String getEvolucaoAlimentacao() {
		return evolucaoAlimentacao;
	}
	public void setEvolucaoAlimentacao(String evolucaoAlimentacao) {
		this.evolucaoAlimentacao = evolucaoAlimentacao;
	}
	public byte getFirmouCabeca() {
		return firmouCabeca;
	}
	public void setFirmouCabeca(byte firmouCabeca) {
		this.firmouCabeca = firmouCabeca;
	}
	public byte getPrimeiroSorriso() {
		return primeiroSorriso;
	}
	public void setPrimeiroSorriso(byte primeiroSorriso) {
		this.primeiroSorriso = primeiroSorriso;
	}
	public byte getSentouSemApoio() {
		return sentouSemApoio;
	}
	public void setSentouSemApoio(byte sentouSemApoio) {
		this.sentouSemApoio = sentouSemApoio;
	}
	public byte getFixouOlhar() {
		return fixouOlhar;
	}
	public void setFixouOlhar(byte fixouOlhar) {
		this.fixouOlhar = fixouOlhar;
	}
	public byte getPrimeiraPalavra() {
		return primeiraPalavra;
	}
	public void setPrimeiraPalavra(byte primeiraPalavra) {
		this.primeiraPalavra = primeiraPalavra;
	}
	public byte getPrimeirosDentes() {
		return primeirosDentes;
	}
	public void setPrimeirosDentes(byte primeirosDentes) {
		this.primeirosDentes = primeirosDentes;
	}
	public byte getLargouFraldasDuranteDia() {
		return largouFraldasDuranteDia;
	}
	public void setLargouFraldasDuranteDia(byte largouFraldasDuranteDia) {
		this.largouFraldasDuranteDia = largouFraldasDuranteDia;
	}
	public byte getLargouFraldasDuranteNoite() {
		return largouFraldasDuranteNoite;
	}
	public void setLargouFraldasDuranteNoite(byte largouFraldasDuranteNoite) {
		this.largouFraldasDuranteNoite = largouFraldasDuranteNoite;
	}
	public byte getEngatinhou() {
		return engatinhou;
	}
	public void setEngatinhou(byte engatinhou) {
		this.engatinhou = engatinhou;
	}
	public byte getAndou() {
		return andou;
	}
	public void setAndou(byte andou) {
		this.andou = andou;
	}
	public byte getOuveBem() {
		return ouveBem;
	}
	public void setOuveBem(byte ouveBem) {
		this.ouveBem = ouveBem;
	}
	public byte getAproveitamentoEscolar() {
		return aproveitamentoEscolar;
	}
	public void setAproveitamentoEscolar(byte aproveitamentoEscolar) {
		this.aproveitamentoEscolar = aproveitamentoEscolar;
	}
	public byte getEnxergaBem() {
		return enxergaBem;
	}
	public void setEnxergaBem(byte enxergaBem) {
		this.enxergaBem = enxergaBem;
	}
	public byte getComportamentoSocial() {
		return comportamentoSocial;
	}
	public void setComportamentoSocial(byte comportamentoSocial) {
		this.comportamentoSocial = comportamentoSocial;
	}
	public String getAntecedentesVacinais() {
		return antecedentesVacinais;
	}
	public void setAntecedentesVacinais(String antecedentesVacinais) {
		this.antecedentesVacinais = antecedentesVacinais;
	}
	public byte getCondicoesDeSonoAtuais() {
		return condicoesDeSonoAtuais;
	}
	public void setCondicoesDeSonoAtuais(byte condicoesDeSonoAtuais) {
		this.condicoesDeSonoAtuais = condicoesDeSonoAtuais;
	}
	public String getMedicacoesEmUso() {
		return medicacoesEmUso;
	}
	public void setMedicacoesEmUso(String medicacoesEmUso) {
		this.medicacoesEmUso = medicacoesEmUso;
	}
	public byte getApetite() {
		return apetite;
	}
	public void setApetite(byte apetite) {
		this.apetite = apetite;
	}
	public String getHabitoUrinario() {
		return habitoUrinario;
	}
	public void setHabitoUrinario(String habitoUrinario) {
		this.habitoUrinario = habitoUrinario;
	}
	public String getHabitoIntestinal() {
		return habitoIntestinal;
	}
	public void setHabitoIntestinal(String habitoIntestinal) {
		this.habitoIntestinal = habitoIntestinal;
	}
	public byte getAtividadeFisica() {
		return atividadeFisica;
	}
	public void setAtividadeFisica(byte atividadeFisica) {
		this.atividadeFisica = atividadeFisica;
	}
	public byte getAlimentacaoAtual() {
		return alimentacaoAtual;
	}
	public void setAlimentacaoAtual(byte alimentacaoAtual) {
		this.alimentacaoAtual = alimentacaoAtual;
	}
	public String getObservacaoAlimentacaoAtual() {
		return observacaoAlimentacaoAtual;
	}
	public void setObservacaoAlimentacaoAtual(String observacaoAlimentacaoAtual) {
		this.observacaoAlimentacaoAtual = observacaoAlimentacaoAtual;
	}
	public String getDoencasAnterioresRelevantes() {
		return doencasAnterioresRelevantes;
	}
	public void setDoencasAnterioresRelevantes(String doencasAnterioresRelevantes) {
		this.doencasAnterioresRelevantes = doencasAnterioresRelevantes;
	}
	public String getOperacoesRelevantes() {
		return operacoesRelevantes;
	}
	public void setOperacoesRelevantes(String operacoesRelevantes) {
		this.operacoesRelevantes = operacoesRelevantes;
	}
	public String getSofreuAcidentes() {
		return sofreuAcidentes;
	}
	public void setSofreuAcidentes(String sofreuAcidentes) {
		this.sofreuAcidentes = sofreuAcidentes;
	}
	public String getSofreuInternacoes() {
		return sofreuInternacoes;
	}
	public void setSofreuInternacoes(String sofreuInternacoes) {
		this.sofreuInternacoes = sofreuInternacoes;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getUsoMedicamentos() {
		return usoMedicamentos;
	}
	public void setUsoMedicamentos(String usoMedicamentos) {
		this.usoMedicamentos = usoMedicamentos;
	}
	public float getiMC() {
		return iMC;
	}
	public void setiMC(float iMC) {
		this.iMC = iMC;
	}
	public String getObservacaoExameFisico() {
		return observacaoExameFisico;
	}
	public void setObservacaoExameFisico(String observacaoExameFisico) {
		this.observacaoExameFisico = observacaoExameFisico;
	}
	
	
}
