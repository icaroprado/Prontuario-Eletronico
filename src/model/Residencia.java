package model;

public class Residencia {
	private String responsavelPrimeiroNome;
	private String pacienteNumeroProntuario;
	private float rendaAproximadaFamilia;
	private byte cohabitantes;
	private byte numeroDeComodos;
	private byte numeroDeBanheiros;
	private byte possuiAguaTratada;
	private byte possuiRedeDeEsgoto;
	private byte possuiColetaDeLixo;
	private byte possuiRedeEletrica;
	private byte possuiAnimaisDeEstimacao;
	private String ruaLogradouro;
	private int numeroResidencia;
	private String cEP;
	public String getResponsavelPrimeiroNome() {
		return responsavelPrimeiroNome;
	}
	public void setResponsavelPrimeiroNome(String responsavelPrimeiroNome) {
		this.responsavelPrimeiroNome = responsavelPrimeiroNome;
	}
	public String getPacienteNumeroProntuario() {
		return pacienteNumeroProntuario;
	}
	public void setPacienteNumeroProntuario(String pacienteNumeroProntuario) {
		this.pacienteNumeroProntuario = pacienteNumeroProntuario;
	}
	public byte getCohabitantes() {
		return cohabitantes;
	}
	public void setCohabitantes(byte cohabitantes) {
		this.cohabitantes = cohabitantes;
	}
	public float getRendaAproximadaFamilia() {
		return rendaAproximadaFamilia;
	}
	public void setRendaAproximadaFamilia(float rendaAproximadaFamilia) {
		this.rendaAproximadaFamilia = rendaAproximadaFamilia;
	}
	public byte getNumeroDeComodos() {
		return numeroDeComodos;
	}
	public void setNumeroDeComodos(byte numeroDeComodos) {
		this.numeroDeComodos = numeroDeComodos;
	}
	public byte getNumeroDeBanheiros() {
		return numeroDeBanheiros;
	}
	public void setNumeroDeBanheiros(byte numeroDeBanheiros) {
		this.numeroDeBanheiros = numeroDeBanheiros;
	}
	public byte getPossuiAguaTratada() {
		return possuiAguaTratada;
	}
	public void setPossuiAguaTratada(byte possuiAguaTratada) {
		this.possuiAguaTratada = possuiAguaTratada;
	}
	public byte getPossuiColetaDeLixo() {
		return possuiColetaDeLixo;
	}
	public void setPossuiColetaDeLixo(byte possuiColetaDeLixo) {
		this.possuiColetaDeLixo = possuiColetaDeLixo;
	}
	public byte getPossuiRedeDeEsgoto() {
		return possuiRedeDeEsgoto;
	}
	public void setPossuiRedeDeEsgoto(byte possuiRedeDeEsgoto) {
		this.possuiRedeDeEsgoto = possuiRedeDeEsgoto;
	}
	public byte getPossuiAnimaisDeEstimacao() {
		return possuiAnimaisDeEstimacao;
	}
	public void setPossuiAnimaisDeEstimacao(byte possuiAnimaisDeEstimacao) {
		this.possuiAnimaisDeEstimacao = possuiAnimaisDeEstimacao;
	}
	public byte getPossuiRedeEletrica() {
		return possuiRedeEletrica;
	}
	public void setPossuiRedeEletrica(byte possuiRedeEletrica) {
		this.possuiRedeEletrica = possuiRedeEletrica;
	}
	public String getRuaLogradouro() {
		return ruaLogradouro;
	}
	public void setRuaLogradouro(String ruaLogradouro) {
		this.ruaLogradouro = ruaLogradouro;
	}
	public int getNumeroResidencia() {
		return numeroResidencia;
	}
	public void setNumeroResidencia(int numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
	}
	public String getcEP() {
		return cEP;
	}
	public void setcEP(String cEP) {
		this.cEP = cEP;
	}
}
