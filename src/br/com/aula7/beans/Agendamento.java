package br.com.aula7.beans;

public class Agendamento {
	// Atributo
	private Paciente paciente;
	private String data;
	private String hora;
	private Medico medico;
	private double valor;
	private String atendente;

	// Construtor vazio e cheio
	public Agendamento() {
	}

	public Agendamento(Paciente paciente, String data, String hora, Medico medico, String atendente, double valor) {
		super();
		this.paciente = paciente;
		this.data = data;
		this.hora = hora;
		this.medico = medico;
		this.atendente = atendente;
		this.valor = valor;
	}

	// Getters e Setteres
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}
	
	//Metodo
	public void agendar() {
		System.out.println("Paciente: " + paciente.getNome() + " Data: " + data + " Hora: " + hora);
	}

}
