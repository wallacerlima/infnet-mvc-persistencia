package br.edu.infnet.appendereco.model.domain;


public class Endereco {
	
	private int id;
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	
	public Endereco() {
		
	}
	
	public Endereco(String cep) {
		this.cep = cep;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getId());
		sb.append(" - ");
		sb.append(getLogradouro());
		sb.append(", ");
		sb.append(getComplemento());
		sb.append(", ");
		sb.append(getBairro());
		sb.append(" - ");
		sb.append(getLocalidade());
		sb.append("/");
		sb.append(getUf());
		sb.append(" CEP: ");
		sb.append(getCep());
		
		return sb.toString();
	}
	
	

}
