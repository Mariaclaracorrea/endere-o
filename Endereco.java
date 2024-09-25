package Atividades;

public class Endereco {
	
	private String rua;
	private int numero;
	private String bairro;
	private String cep;
	private Cidade cidade;
	
	public Endereco(String rua, int numero,String bairro, String cep, Cidade cidade) { 
	  this.rua= rua;
	  this.numero= numero;
	  this.bairro= bairro;
	  this.cep= cep;
	  this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public  String getBairro() {
		return bairro;
	}
	public void setBarro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	

}
