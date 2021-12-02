package br.com.aula7.beans;

public class Paciente extends Pessoa {
	
	public Paciente() {
		super();
	}

	public Paciente(String nome, String cpf, String fone, String endereco) {
		super(nome, cpf, fone, endereco);
		
	}

	@Override
	public void pesquisar() {
		System.out.println("Pesquisar o Paciente");
		
	}


	@Override
	public void salvar() {
		System.out.println("Salvar o Paciente");
		
	}
	@Override
	public void excluir() {
		System.out.println("Excluir o Paciente");
		
	}

}
