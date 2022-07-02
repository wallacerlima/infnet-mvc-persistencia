package br.edu.infnet.appestabelecimento.model.domain;

import java.util.List;

public class Estabelecimento extends Usuario{
	
	private String cnpj;
	private String endereco;
	private boolean edtech;
	private List<Funcionario> funcionarios;
	
	public Estabelecimento() {
		
	}
	
	public Estabelecimento(Integer id) {
		this.setId(id);
	}
		
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isEdtech() {
		return edtech;
	}
	public void setEdtech(boolean edtech) {
		this.edtech = edtech;
	}
	
	

}
