package br.com.aula7.beans;

public class Atendente extends Funcionario {

	public Atendente(String nome, String cpf, String fone, String dtAdmissao, String dtDemissao, double salario,
			String departamento) {
		super(nome, cpf, fone, dtAdmissao, dtDemissao, salario, departamento);
		
	}

	@Override
	public void pesquisar() {
		System.out.println("Pesquisar o Atendente");
		
	}

	@Override
	public void salvar() {
		System.out.println("Salvar o Atendente");
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluir o Atendente");
		
	}
	
	public void calcularParticipacaoLucros() {
		System.out.println("Participação Atendente: " + (super.getSalario() * 0.2));
	}	

}
