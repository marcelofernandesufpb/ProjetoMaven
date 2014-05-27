package br.ufpb.projeto;


public class Pessoa {
	
	private int idade;
	private String nome;
	private String cidade;
	private String bairro;
	private String rua;
	
	public Pessoa(){
		idade = 20;
		nome = "Maria";
		cidade = "João Pessoa";
		bairro = "Mangabeira";
		rua = "Rua pedro Batista";
	}
	
	
	public void setIdade(int i){
		this.idade = i;
	}
   
	public int getIdade(){
		return this.idade;
	}
	
	public void setNome(String n){
		this.nome = n;
	}
   
	public String getNome(){
		return this.nome;
	}
	
	public void setCidade(String c){
		this.cidade = c;
	}
   
	public String getCidade(){
		return this.cidade;
	}
	
	public void setBairro(String b){
		this.bairro = b;
	}
   
	public String getBairro(){
		return this.bairro;
	}
	
	public void setRua(String r){
		this.rua = r;
	}
   
	public String getRua(){
		return this.rua;
	}
}
