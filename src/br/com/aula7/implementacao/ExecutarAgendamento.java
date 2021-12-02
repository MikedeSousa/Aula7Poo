package br.com.aula7.implementacao;

import java.util.Scanner;

import br.com.aula7.beans.Agendamento;
import br.com.aula7.beans.Medico;
import br.com.aula7.beans.Paciente;

public class ExecutarAgendamento {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informa��es do Paciente");

		System.out.println("Digite o nome: ");
		String nomePaciente = leitor.nextLine();

		System.out.println("Digite o cpf: ");
		String cpf = leitor.nextLine();

		System.out.println("Digite o fone: ");
		String fone = leitor.nextLine();
		
		System.out.println("Digite o endere�o: ");
		String endereco = leitor.nextLine();

		Paciente paciente = new Paciente(nomePaciente, cpf, fone, endereco);

		System.out.println("Informa��es do M�dico");

		System.out.println("Digite o nome: ");
		String nomeMedico = leitor.nextLine();

		System.out.println("Digite o cpf do M�dico: ");
		String cpfMedico = leitor.nextLine();

		System.out.println("Digite o fone do M�dico: ");
		String foneMedico = leitor.nextLine();

		System.out.println("Digite a especialidade do M�dico: ");
		String especialidade = leitor.nextLine();

		System.out.println("Digite o crm do M�dico: ");
		String crm = leitor.nextLine();

		//Medico medico = new Medico(nomeMedico, cpfMedico, foneMedico, especialidade, crm);

		System.out.println("Data: ");
		String data = leitor.nextLine();

		System.out.println("Hora: ");
		String hora = leitor.nextLine();

		System.out.println("Atendente: ");
		String atendente = leitor.nextLine();

		System.out.println("Valor: ");
		double valor = leitor.nextDouble();

		leitor.close();

		//Agendamento agenda = new Agendamento(paciente, data, hora, medico, atendente, valor);

	//	agenda.agendar();

	}

}
