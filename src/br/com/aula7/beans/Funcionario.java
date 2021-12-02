package br.com.aula7.beans;

public class Funcionario extends Pessoa {
	private String dtAdmissao;
	private String dtDemissao;
	private double salario;
	private String departamento;

	public Funcionario(String nome, String cpf, String fone, String dtAdmissao, String dtDemissao, double salario,
			String departamento) {
		super(nome, cpf, fone);
		this.dtAdmissao = dtAdmissao;
		this.dtDemissao = dtDemissao;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public String getDtDemissao() {
		return dtDemissao;
	}

	public void setDtDemissao(String dtDemissao) {
		this.dtDemissao = dtDemissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void calcularParticipacaoLucros() {
		System.out.println("Participação Funcionário: " + (salario * 0.1));
	}

	@Override
	public void pesquisar() {

	}

	@Override
	public void salvar() {

	}

	@Override
	public void excluir() {

	}

}
