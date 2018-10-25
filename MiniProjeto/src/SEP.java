import java.util.Scanner;

public class SEP {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// vetores
		String vetor_nome[] = new String[500];
		String vetor_data[] = new String[500];
		String vetor_usuário[] = new String[500];
		String vetor_senha[] = new String[500];
		String vetor_usuário_cadastrado[] = new String[500];
		double vetor_renda_total[] = new double[500];
		int vetor_membro[] = new int[500];

		// opções
		int opção = 1, opção_2 = 1, opção_3 = 3;

		// contadores
		int contador_cadastro = 0, contador_confirmar, confirmar = 0, usuário_salário=0;

		// login
		String usuário = "", senha = "";
		String continuar_p_person = "";

		// gastos R$
		double água, energia, internet, alimentação, cartão_de_crédito, soma_gastos = 0;

		// percentuais dos gastos
		double percentual_água, percentual_internet, percentual_alimentação, percentual_energia,
				percentual_cartão_de_crédito, percentual_poupança;

		// variáveis de salvar configuração
		double salvar_água = 0, salvar_energia = 0, salvar_internet = 0, salvar_alimentação = 0,
				salvar_cartão_de_crédito = 0, salvar_poupança = 0;

		do {

			// menu inicial

			System.out.println("Sistema Econômico Pessoal");
			System.out.println("");
			System.out.println("[1] - Realizar Cadastro");
			System.out.println("[2] - Login");
			System.out.println("[3] - Descrição");
			System.out.println("[0] - Finalizar programa");
			opção = scan.nextInt();

			// ---------

			switch (opção) {

			case 1:

				// CADASTRO PESSOAL

				System.out.println("Cadastro \n \n");

				System.out.println("Nome: ");
				vetor_nome[contador_cadastro] = scan.next();

				System.out.println("Data de nascimento: ");
				vetor_data[contador_cadastro] = scan.next();

				do {

					confirmar = 0;

					System.out.println("Nome de usuário: ");
					vetor_usuário[contador_cadastro] = scan.next();

					for (int i = 0; i < contador_cadastro; i++) {

						if (vetor_usuário[i].equalsIgnoreCase(vetor_usuário[contador_cadastro])) {

							confirmar++;

						}
					}

					if (confirmar >= 1) {

						System.out.println("Usuário já cadastrado, tente outro nome de usuário!");
					}

				} while (confirmar != 0);
				// ---------------------

				System.out.println("Senha: ");
				vetor_senha[contador_cadastro] = scan.next();

				System.out.println("Quantos membros seu grupo familiar tem? ");
				vetor_membro[contador_cadastro] = scan.nextInt();

				System.out.println("Qual a renda total do seu grupo familiar (R$)? ");
				vetor_renda_total[contador_cadastro] = scan.nextDouble();

				// E.U.L.A.

				contador_cadastro++;

				// ----------

				break;

			case 2:

				// ÁREA DE LOGIN
				do {

					contador_confirmar = 0;

					System.out.println("Digite seu nome de usuário: ");
					usuário = scan.next();

					System.out.println("Digite a senha: ");
					senha = scan.next();

					for (int i = 0; i < vetor_usuário.length; i++) {

						if (usuário.equals(vetor_usuário[i])) {
							contador_confirmar++;
							usuário_salário = i;
						}
					}

					for (int i = 0; i < vetor_senha.length; i++) {

						if (senha.equals(vetor_senha[i])) {
							contador_confirmar++;
						}
					}

					if (contador_confirmar != 2) {
						System.out.println("Nome de usuário ou senha não existe/incorreto! \n");
					}

				} while (contador_confirmar != 2);
				// ----------

				// APÓS LOGIN

				System.out.println("Olá, " + usuário + ". Bem vindo ao Sistema Econômico Pessoal!");
				System.out.println("[1] - Ver plano configurado para seu perfil");
				System.out.println("[2] - Criar plano personalizado");
				System.out.println("[3] - Exibir relatório");
				System.out.println("[0] - Voltar");
				// ------------
				opção_2 = scan.nextInt();

				switch (opção_2) {

				case 1:

					if (vetor_renda_total[usuário_salário] <= 1000) {

						salvar_água = 0.05;
						salvar_energia = 0.07;
						salvar_alimentação = 0.2;
						salvar_internet = 0.1;
						salvar_cartão_de_crédito = 0.2;
						salvar_poupança = 0.2;

					}
					if (vetor_renda_total[usuário_salário] > 1000 && vetor_renda_total[usuário_salário] <= 2500) {

						salvar_água = 0.05;
						salvar_energia = 0.05;
						salvar_alimentação = 0.25;
						salvar_internet = 0.07;
						salvar_cartão_de_crédito = 0.2;
						salvar_poupança = 0.2;

					}
					if (vetor_renda_total[usuário_salário] > 2500 && vetor_renda_total[usuário_salário] <= 5000) {

						salvar_água = 0.04;
						salvar_energia = 0.04;
						salvar_alimentação = 0.2;
						salvar_internet = 0.05;
						salvar_cartão_de_crédito = 0.2;
						salvar_poupança = 0.3;

					}
					if (vetor_renda_total[usuário_salário] > 5000 && vetor_renda_total[usuário_salário] <= 7500) {

						salvar_água = 0.04;
						salvar_energia = 0.06;
						salvar_alimentação = 0.2;
						salvar_internet = 0.05;
						salvar_cartão_de_crédito = 0.2;
						salvar_poupança = 0.3;

					}
					if (vetor_renda_total[usuário_salário] > 7500 && vetor_renda_total[usuário_salário] <= 10000) {

						salvar_água = 0.04;
						salvar_energia = 0.06;
						salvar_alimentação = 0.2;
						salvar_internet = 0.05;
						salvar_cartão_de_crédito = 0.2;
						salvar_poupança = 0.35;

					}
					if (vetor_renda_total[usuário_salário] > 10000) {

						salvar_água = 0.04;
						salvar_energia = 0.06;
						salvar_alimentação = 0.2;
						salvar_internet = 0.05;
						salvar_cartão_de_crédito = 0.2;
						salvar_poupança = 0.35;

					}

					System.out.println("Olá " + usuário);
					System.out.println(" ");
					System.out.println("Esses são os gastos máximos que vê tem de acordo com o seu salário: ");
					System.out.println(" ");
					System.out.println("Água: " + (salvar_água * 100) + "%");
					System.out.println("Energia: " + (salvar_energia * 100) + "%");
					System.out.println("Alimentação: " + (salvar_alimentação * 100) + "%");
					System.out.println("Internet: " + (salvar_internet * 100) + "%");
					System.out.println("Cartão de crédito: " + (salvar_cartão_de_crédito * 100) + "%");
					System.out.println("Poupança: " + (salvar_poupança * 100) + "%");
					System.out.println(" ");

					break;

				case 2:

					percentual = 100;

					System.out.println("PLANO PERSONALIZADO");
					System.out.println("Selecione o percentual desejado para cada item a seguir: ");
					System.out.println("Por padrão do sistema, o percentual máximo é de 60%!");

					do {
						do {
							System.out.println("Água: ");
							percentual_água = scan.nextDouble();
							if (percentual_água < 0 || percentual_água > 60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
						} while (percentual_água < 0 || percentual_água > 60);
						cálculo_plano_personalizado(percentual_água);
					} while (confirmação_p_person != 0);

					do {
						do {
							System.out.println("Energia: ");
							percentual_energia = scan.nextDouble();

							if (percentual_energia < 0 || percentual_energia > 60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
						} while (percentual_energia < 0 || percentual_energia > 60);
						cálculo_plano_personalizado(percentual_energia);
					} while (confirmação_p_person != 0);

					do {
						do {
							System.out.println("Alimentação: ");
							percentual_alimentação = scan.nextDouble();

							if (percentual_alimentação < 0 || percentual_alimentação > 60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
						} while (percentual_alimentação < 0 || percentual_alimentação > 60);
						cálculo_plano_personalizado(percentual_alimentação);
					} while (confirmação_p_person != 0);

					do {
						do {
							System.out.println("Internet: ");
							percentual_internet = scan.nextDouble();

							if (percentual_internet < 0 || percentual_internet > 60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
						} while (percentual_internet < 0 || percentual_internet > 60);
						cálculo_plano_personalizado(percentual_internet);
					} while (confirmação_p_person != 0);

					do {
						do {
							System.out.println("Cartão de crédito: ");
							percentual_cartão_de_crédito = scan.nextDouble();

							if (percentual_cartão_de_crédito < 0 || percentual_cartão_de_crédito > 60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
						} while (percentual_cartão_de_crédito < 0 || percentual_cartão_de_crédito > 60);
						cálculo_plano_personalizado(percentual_cartão_de_crédito);
					} while (confirmação_p_person != 0);

					do {
						do {
							System.out.println("Poupança: ");
							percentual_poupança = scan.nextDouble();

							if (percentual_poupança < 0 || percentual_poupança > 60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
						} while (percentual_poupança < 0 || percentual_poupança > 60);
						cálculo_plano_personalizado(percentual_poupança);
					} while (confirmação_p_person != 0);

					System.out.println("Configuração do plano: \n");
					System.out.println("Água: " + percentual_água + "%");
					System.out.println("Energia: " + percentual_energia + "%");
					System.out.println("Alimentação: " + percentual_alimentação + "%");
					System.out.println("Internet: " + percentual_internet + "%");
					System.out.println("Cartão de crédito: " + percentual_cartão_de_crédito + "%");
					System.out.println("Poupança: " + percentual_poupança + "% \n");

					System.out.println("Continuar? (S/N)");
					continuar_p_person = scan.next();

					//////////////////////////////////

					// SWITCH de confirmação de plano
					switch (continuar_p_person) {
					case "S":

						// salvar_configuração();

						salvar_água = percentual_água;
						salvar_alimentação = percentual_alimentação;
						salvar_cartão_de_crédito = percentual_cartão_de_crédito;
						salvar_energia = percentual_energia;
						salvar_internet = percentual_internet;
						salvar_poupança = percentual_poupança;

						System.out.println("Plano configurado com sucesso!");

						break;
					case "N":
						percentual_água = salvar_água;
						percentual_energia = salvar_energia;
						percentual_alimentação = salvar_alimentação;
						percentual_internet = salvar_internet;
						percentual_cartão_de_crédito = salvar_cartão_de_crédito;
						percentual_poupança = salvar_poupança;

						System.out.println("Alterações canceladas pelo usuário!");

						break;

					default:
						System.out.println("Opção incorreta, por favor tente novamente!");

						break;
					}

					break;

				case 3:
					
					if (salvar_água==0) {
						System.out.println("Para exibir seu primeiro relatório, verifique seu plano atual");
					}else {
					
						
					double vAgua = 	(vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário]*salvar_água)));
					double vEnergia = 	(vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário]*salvar_energia)));
					double vAlimentacao = 	(vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário]*salvar_alimentação)));
					double vInternet = 	(vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário]*salvar_internet)));
					double vCredCard = 	(vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário]*salvar_cartão_de_crédito)));
					double vPoupanca = 	(vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário] - (vetor_renda_total[usuário_salário]*salvar_poupança)));
					double vTotal = vAgua+vEnergia+vAlimentacao+vInternet+vCredCard+vPoupanca;
					
					
					System.out.println("Exibindo relatório...");
					
					System.out.println("Gastos máximos permitido:");
					System.out.println("Água: R$"+vAgua);
					System.out.println("Energia: R$"+vEnergia);
					System.out.println("Alimentação: R$"+vAlimentacao);
					System.out.println("Internet: R$"+vInternet);
					System.out.println("Cartão de crédito: R$"+vCredCard);
					System.out.println("Poupança: R$"+vPoupanca);
					System.out.println("Total de gastos: R$"+vTotal);
					System.out.println("Renda restante: R$"+(vetor_renda_total[usuário_salário]-vTotal));
					}
					break;
				default:

					System.out.println("Opção incorreta, por favor tente novamente!");
					break;

				}

				break;

			case 3:

				System.out.println("==============================================================");
				System.out.println("			Sistema Econômico pessoal (SEP)\n\n"
						+ "O SEP foi criado com a finalidade de facilitar o gerenciamento de gastos mensal, \n"
						+ "com planos de economia baseados no perfil do usuário. Nele você pode realizar um\n"
						+ "cadastro com seus dados pessoais e, após uma rápida análise do perfil cadastrado,\n"
						+ "o programa mostrará a configuração de plano econômico mais adequada para você. Nesta\n"
						+ "configuração serão apresentados valores máximos para cada gasto (água, energia, etc)\n"
						+ "onde este valor representa o limite máximo de gasto que você pode efetuar para que o\n"
						+ "controle econômico aconteça. Além disso, independentemente do perfil do usuário, o\n"
						+ "plano econômico que for configurado contará com uma poupança, onde sempre será recomendado\n"
						+ "ao usuário separar uma parte da renda mensal para uma poupança. Para usuários mais \n"
						+ "experientes em controles financeiros e que queira usar o programa apenas para monitorar\n"
						+ "seus gastos, há a opção de plano personalizado para que ele mesmo altere os parâmetros\n"
						+ "de percentual de gastos de seu plano.\n\n");

			}

		} while (opção != 0);

		if (opção == 0) {
			System.out.println("PROGRAMA FINALIZADO PELO USUÁRIO");
		}

	}

	///////////////////////////// MÉTODOS //////////////////////////////////

	static double percentual;

	public static void cálculo_plano_personalizado(double x) {

		if (x <= percentual) {
			percentual = percentual - x;
			confirmação_p_person = 0;
			System.out.println("Pontos percentuais restantes a serem distribuídos = " + percentual + "%");
		} else {
			confirmação_p_person = 1;
			System.out.println("valor não pode ser aceitado pois não há "
					+ " pontos percentuais suficientes a serem distribuídos (Restam " + percentual + "%)");

		}
	}

	static int confirmação_p_person = 1;

	public static void salvar_configuração() {

		/*
		 * salvar_água=percentual_água; salvar_alimentação=percentual_alimentação;
		 * salvar_cartão_de_crédito=percentual_cartão_de_crédito;
		 * salvar_energia=percentual_energia; salvar_internet=percentual_internet;
		 * salvar_poupança=percentual_poupança;
		 */
	}

}
