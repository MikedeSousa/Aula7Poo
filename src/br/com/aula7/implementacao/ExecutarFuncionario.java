package br.com.aula7.implementacao;

import br.com.aula7.beans.Atendente;
import br.com.aula7.beans.Funcionario;
import br.com.aula7.beans.Medico;

public class ExecutarFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Fausto","123456cpf", "989898", "01/11/2021", null, 4000, "Adm");
		Medico m1 = new Medico("Dra.Ana", "123456789cpf", "9898", "01/01/2021", null, 4000, "PA", "Pediatria", "135crm");
		Atendente at1 = new Atendente("Marco", "123321cpf", "00911", "01/09/2020", null, 4000, "Adm");
		
		System.out.println("Nome: " + f1.getNome() + " Salário: " + f1.getSalario());
		f1.calcularParticipacaoLucros();
		System.out.println("");
		
		System.out.println("Nome: " + m1.getNome()+ " Salário: " + f1.getSalario() + " crm: " + m1.getCrm());
		m1.calcularParticipacaoLucros();
		System.out.println("");
		
		System.out.println("Atendente Nome: " + at1.getNome() + " Salário: " + at1.getSalario());
		at1.calcularParticipacaoLucros();
	}

}
