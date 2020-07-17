package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Congregacoes;
import entities.Contribuinte;
import entities.Missionario;
import entities.Oferta;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Digite a quantidade de cadastro: ");
		int N = sc.nextInt();
		Contribuinte contribuinte;
		Missionario missionario;

		List<Pessoa> pessoa = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			System.out.print("Digite 'M' missionario/'C' contribuinte: ");
			char F = sc.next().charAt(0);
			if (F == 'm' || F == 'M') {
				System.out.print("Digite o nome do Missionario: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Sexo Masculino/Feminino: ");
				String sexo = sc.nextLine();
				System.out.print("Digite a idade: ");
				int idade = sc.nextInt();
				System.out.print("Digite o RG: ");
				sc.nextLine();
				int RG = sc.nextInt();
				System.out.print("Digite o CPF: ");
				sc.nextLine();
				int CPF = sc.nextInt();
				missionario = new Missionario(name, sexo, idade, RG, CPF);
				pessoa.add(missionario);
				System.out.println();
			} else {
				System.out.print("Digite o nome do Contribuinte: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Sexo M/F: ");
				String sexo = sc.nextLine();
				System.out.print("Digite a idade: ");
				int idade = sc.nextInt();
				System.out.print("Congregação: ");
				sc.nextLine();
				String nomeCongregacao = sc.nextLine();
				System.out.print("Distrito: ");
				int distrito = sc.nextInt();
				System.out.print("Oferta: ");
				double ofert = sc.nextDouble();
				System.out.print("Data: ");
				Date data = sdf.parse(sc.next());
				Oferta oferta = new Oferta(ofert, data);
				contribuinte = new Contribuinte(name, sexo, idade, 
						new Congregacoes(nomeCongregacao, distrito));
				contribuinte.addOferta(oferta);
				pessoa.add(contribuinte);
				System.out.println();
			}
		}
		for (Pessoa p : pessoa) {
			System.out.println(p);
		}

		sc.close();
	}

}
