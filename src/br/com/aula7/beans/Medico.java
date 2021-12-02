package br.com.aula7.beans;

public class Medico extends Funcionario{	
	private String especialidade;
	private String crm;	
	
	public Medico(String nome, String cpf, String fone, String dtAdmissao, String dtDemissao, double salario,
			String departamento, String especialidade, String crm) {
		super(nome, cpf, fone, dtAdmissao, dtDemissao, salario, departamento);
		this.especialidade = especialidade;
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public void pesquisar() {
		System.out.println("Pesquisando M�dico");
		
	}

	@Override
	public void salvar() {
		System.out.println("Salvando M�dico");
		
	}

	@Override
	public void excluir() {
		System.out.println("Excluindo M�dico");
		
	}
	@Override
	public void calcularParticipacaoLucros() {
		System.out.println("Participa��o M�dico: " + (super.getSalario() * 0.5));
	}	

}
