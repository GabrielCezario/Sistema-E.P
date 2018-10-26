
import java.util.Scanner;

public class SEP {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// vetores
		String vetNome[] = new String[500];
		String vetData[] = new String[500];
		String vetUsuario[] = new String[500];
		String vetSenha[] = new String[500];
		float vetRendaT[] = new float[500];
		

		// opções
		int opcao1 = 1, opcao2 = 1;

		// contadores
		int contCadastro = 0, contConfirmar, confirmar = 0, usuarioPosicao = 0;

		// login
		String usuario = "", senha = "", voltar;
		String continuarPlanoPers = "";

		// gastos R$
		float vAgua, vEnergia, vInternet, vAlimentacao, vCredCard, vPoupanca, vTotal= 0;

		// percentuais dos gastos
		float percAgua, percInternet, percAlimentacao, percEnergia,
				percCredCard, percPoupanca;

		// variáveis de salvar configuração
		float salvarAgua = 0, salvarEnergia = 0, salvarInternet = 0, salvarAlimentacao = 0,
				salvarCredCard = 0, salvarPoupanca = 0;

		
		do {

			// menu inicial
			System.out.println("\n\n");
			System.out.println(
					"//======================================\\\\\n"
					+"||	Sistema Econômico Pessoal	||\n"
					+"||>====================================<||\n"
					+"||	[1] - Realizar Cadastro		||\n"
					+"||	[2] - Login			||\n"
					+"||	[3] - Descrição			||\n"
					+"||	[0] - Finalizar programa	||\n"
					+"\\\\======================================//");
			System.out.print("=>");
			opcao1 = scan.nextInt();
			
			

			switch (opcao1) {

			case 1:

				// CADASTRO PESSOAL
				System.out.println("\n\n");
				System.out.println(
						 "#======================#\n"
						+"| 	CADASTRO       |\n"
						+"#======================#");

				System.out.print(
						 "+---------------+\n"
						+"|     Nome 	|\n"
						+"+---------------+\n"
						+"=>");
				vetNome[contCadastro] = scan.next();

				System.out.print(
						 "+-----------------------+\n"
						+"|  Data de nascimento	|\n"
						+"+-----------------------+\n"
						+"=>");
				vetData[contCadastro] = scan.next();

				do {

					confirmar = 0;

					System.out.print(
							 "+-----------------------+\n"
							+"|  Nome de usuario 	|\n"
							+"+-----------------------+\n"
							+"=>");
					vetUsuario[contCadastro] = scan.next();

					for (int i = 0; i < contCadastro; i++) {

						if (vetUsuario[i].equalsIgnoreCase(vetUsuario[contCadastro])) {

							confirmar++;

						}
					}

					if (confirmar >= 1) {

						System.out.println(
								 "#===============================================================#\n"
								+"|	Usuário já cadastrado, tente outro nome de usuário!	|\n"
								+"#===============================================================#");
					}

				} while (confirmar != 0);
				// ---------------------

				System.out.print(
						 "+-----------+\n"
						+"|   Senha   |\n"
						+"+-----------+\n"
						+"=>");
				vetSenha[contCadastro] = scan.next();


				System.out.print(
						 "+------------------------------------------------------+\n"
						+"|    Qual a renda total do seu grupo familiar (R$)?    |\n"
						+"+------------------------------------------------------+\n"
						+"=>");
				vetRendaT[contCadastro] = scan.nextFloat();

				

				contCadastro++;
				
				
				System.out.println(
						 "#==============================#\n"
						+"|	CADASTRO REALIZADO!    |\n"
						+"#==============================#");

				System.out.print(
						 "+-------------------------------------------------------+\n"
						+"|	Tecle [ENTER] para ir ao menu principal 	|\n"
						+"+-------------------------------------------------------+");
				voltar = scan.nextLine();
				voltar = scan.nextLine();

				break;

			case 2:
				
				// ÁREA DE LOGIN
				do {
				
				do {

					contConfirmar = 0;

					System.out.print(
							 "+---------------------------------------+\n"
							+"|	Digite seu nome de usuário	|\n"
							+"+---------------------------------------+\n"
							+ "=>");
					usuario = scan.next();

					System.out.print(
							 "+-----------------------+\n"
							+"|    Digite a senha	|\n"
							+"+-----------------------+\n"
							+"=>");
					senha = scan.next();

					for (int i = 0; i < vetUsuario.length; i++) {

						if (usuario.equals(vetUsuario[i])) {
							contConfirmar++;
							usuarioPosicao = i;
						}
						
					
					}

					

						if (senha.equals(vetSenha[usuarioPosicao])) {
							contConfirmar++;
						}
					

					if (contConfirmar != 2) {
						
						
						System.out.println(
								 "#=======================================================#\n"
								+"|	Nome de usuário ou senha não existe/incorreto! 	|\n"
								+"#=======================================================#\n");
					
					
					}

				} while (contConfirmar != 2);
				

				do {
				
				// APÓS LOGIN
				System.out.println("\n\n");
				System.out.println(
						 "//==============================================================\\\\\n"
						+"||	Olá, " + usuario + ". Bem vindo ao Sistema Econômico Pessoal!	||\n"
						+"||>============================================================<||\n"
						+"||	[1] - Ver plano recomendado para seu perfil		||\n"
						+"||	[2] - Criar plano personalizado				||\n"
						+"||	[3] - Exibir relatório					||\n"
						+"||	[0] - Deslogar						||\n"
						+"\\\\==============================================================//");
				System.out.println("=>");
				// ------------
				opcao2 = scan.nextInt();
				
				

				switch (opcao2) {

				case 1:

					if (vetRendaT[usuarioPosicao] <= 1000) {

						salvarAgua = 0.05f;
						salvarEnergia = 0.07f;
						salvarAlimentacao = 0.2f;
						salvarInternet = 0.1f;
						salvarCredCard = 0.2f;
						salvarPoupanca = 0.2f;

					}
					if (vetRendaT[usuarioPosicao] > 1000 && vetRendaT[usuarioPosicao] <= 2500) {

						salvarAgua = 0.05f;
						salvarEnergia = 0.05f;
						salvarAlimentacao = 0.25f;
						salvarInternet = 0.07f;
						salvarCredCard = 0.2f;
						salvarPoupanca = 0.2f;

					}
					if (vetRendaT[usuarioPosicao] > 2500 && vetRendaT[usuarioPosicao] <= 5000) {

						salvarAgua = 0.04f;
						salvarEnergia = 0.04f;
						salvarAlimentacao = 0.2f;
						salvarInternet = 0.05f;
						salvarCredCard = 0.2f;
						salvarPoupanca = 0.3f;

					}
					if (vetRendaT[usuarioPosicao] > 5000 && vetRendaT[usuarioPosicao] <= 7500) {

						salvarAgua = 0.04f;
						salvarEnergia = 0.06f;
						salvarAlimentacao = 0.2f;
						salvarInternet = 0.05f;
						salvarCredCard = 0.2f;
						salvarPoupanca = 0.3f;

					}
					if (vetRendaT[usuarioPosicao] > 7500 && vetRendaT[usuarioPosicao] <= 10000) {

						salvarAgua = 0.04f;
						salvarEnergia = 0.06f;
						salvarAlimentacao = 0.2f;
						salvarInternet = 0.05f;
						salvarCredCard = 0.2f;
						salvarPoupanca = 0.35f;

					}
					if (vetRendaT[usuarioPosicao] > 10000) {

						salvarAgua = 0.04f;
						salvarEnergia = 0.06f;
						salvarAlimentacao = 0.2f;
						salvarInternet = 0.05f;
						salvarCredCard = 0.2f;
						salvarPoupanca = 0.35f;

					}
					System.out.println("\n\n");
					System.out.println(
					 "//======================================================\\\\\n"
					+"||	Percentuais recomendados para seu perfil	||\n"
					+"||>====================================================<||\n"
					+"||	Água: " + (salvarAgua * 100) + "% 					||\n"
					+"||	Energia: " + (salvarEnergia * 100) + "% 					||\n"
					+"||	Alimentação: " + (salvarAlimentacao * 100) + "%				||\n"
					+"||	Internet: " + (salvarInternet * 100) + "%					||\n"
					+"||	Cartão de crédito: " + (salvarCredCard * 100) + "% 			||\n"
					+"||	Poupança: " + (salvarPoupanca * 100) + "% 				||\n"
					+"\\\\======================================================//");
					

					System.out.print(
							 "+---------------------------------------+\n"
							+"|	Tecle [ENTER] para voltar 	|\n"
							+"+---------------------------------------+");
					voltar = scan.nextLine();
					voltar = scan.nextLine();
					
					
					break;

				case 2:

					percentual = 100;
					System.out.println("\n\n");
					System.out.println(
					 "//===============================================================\\\\\n"
					+"||			PLANO PERSONALIZADO			 ||\n"
					+"||>=============================================================<||\n"
					+"||	Digite o percentual desejado para cada item a seguir! 	 ||\n"
					+"||	Por padrão do sistema, o percentual máximo permitido   	 ||\n"
					+"||	de um item é de até 60%!				 ||\n"
					+"\\\\===============================================================//");
					System.out.println("\n");

					do {
						do {
						
							System.out.print(
									 "+-----------+\n"
									+"|   Água    |\n"
									+"+-----------+\n"
									+"=>");
						
							percAgua = scan.nextFloat();
							if (percAgua < 0 || percAgua > 60) {
								
								System.out.println(
										 "#=======================================#\n"
										+"| Percentual inválido, tente novamente! |\n"
										+"#=======================================#");
						
							}
						} while (percAgua < 0 || percAgua > 60);
						cálculo_plano_personalizado(percAgua);
					} while (confirmarPlanoPers != 0);

					do {
						do {
						
							System.out.print(
									 "+---------------+\n"
									+"|    Energia    |\n"
									+"+---------------+\n"
									+"=>");
						
							percEnergia = scan.nextFloat();

							if (percEnergia < 0 || percEnergia > 60) {
							
								System.out.println(
										 "#=======================================#\n"
										+"| Percentual inválido, tente novamente! |\n"
										+"#=======================================#");
							
							}
						} while (percEnergia < 0 || percEnergia > 60);
						cálculo_plano_personalizado(percEnergia);
					} while (confirmarPlanoPers != 0);

					do {
						do {
						
							System.out.print(
									 "+-------------------+\n"
									+"|    Alimentação    |\n"
									+"+-------------------+\n"
									+"=>");
							
							percAlimentacao = scan.nextFloat();

							if (percAlimentacao < 0 || percAlimentacao > 60) {
							
								System.out.println(
										 "#=======================================#\n"
										+"| Percentual inválido, tente novamente! |\n"
										+"#=======================================#");
							
							}
						} while (percAlimentacao < 0 || percAlimentacao > 60);
						cálculo_plano_personalizado(percAlimentacao);
					} while (confirmarPlanoPers != 0);

					do {
						do {
							
							System.out.print(
									 "+---------------+\n"
									+"|    Internet   |\n"
									+"+---------------+\n"
									+"=>");
						
							percInternet = scan.nextFloat();

							if (percInternet < 0 || percInternet > 60) {
							
								System.out.println(
										 "#=======================================#\n"
										+"| Percentual inválido, tente novamente! |\n"
										+"#=======================================#");
						
							}
						} while (percInternet < 0 || percInternet > 60);
						cálculo_plano_personalizado(percInternet);
					} while (confirmarPlanoPers != 0);

					do {
						do {
						
							System.out.print(
									 "+-------------------------+\n"
									+"|    Cartão de crédito    |\n"
									+"+-------------------------+\n"
									+"=>");
							
							percCredCard = scan.nextFloat();

							if (percCredCard < 0 || percCredCard > 60) {
							
								System.out.println(
										 "#=======================================#\n"
										+"| Percentual inválido, tente novamente! |\n"
										+"#=======================================#");
							
							}
						} while (percCredCard < 0 || percCredCard > 60);
						cálculo_plano_personalizado(percCredCard);
					} while (confirmarPlanoPers != 0);

					do {
						do {
							
							System.out.print(
									 "+----------------+\n"
									+"|    Poupança    |\n"
									+"+----------------+\n"
									+"=>");
							
							percPoupanca = scan.nextFloat();

							if (percPoupanca < 0 || percPoupanca > 60) {
								
								System.out.println(
										 "#=======================================#\n"
										+"| Percentual inválido, tente novamente! |\n"
										+"#=======================================#");
							
							}
						} while (percPoupanca < 0 || percPoupanca > 60);
						cálculo_plano_personalizado(percPoupanca);
					} while (confirmarPlanoPers != 0);

					System.out.println("\n\n");
					System.out.println(
							 "//==============================================\\\\\n"
							+"||		Configuração do plano 		||\n"
							+"||>============================================<||\n"
							+"||						||\n"
							+"||		Água: " + percAgua + "%			||\n"
							+"||		Energia: " + percEnergia + "%			||\n"
							+"||		Alimentação: " + percAlimentacao + "%		||\n"
							+"||		Internet: " + percInternet + "%			||\n"
							+"||		Cartão de Créd.: " + percCredCard + "%		||\n"
							+"||		Poupança: " + percPoupanca + "%			||\n"
							+"||						||\n"
							+"\\\\==============================================//");

					do {
					
					System.out.print(
							 "+-----------------------+\n"
							+"|   Continuar? (S/N)    |\n"
							+"+-----------------------+\n"
							+ "=>");
					
					continuarPlanoPers = scan.next();
					
					
						if (!continuarPlanoPers.equalsIgnoreCase("S") && (!continuarPlanoPers.equalsIgnoreCase("N"))) {
						
							
							System.out.println(
									 "+-------------------------------------------------------+\n"
									+"|	Opção incorreta, por favor tente novamente!	|\n"
									+"+-------------------------------------------------------+");
					}

						
					}while(!continuarPlanoPers.equalsIgnoreCase("S") && (!continuarPlanoPers.equalsIgnoreCase("N")));
					
					
					if (continuarPlanoPers.equalsIgnoreCase("S")) {
						
						salvarAgua = percAgua/100;
						salvarAlimentacao = percAlimentacao/100;
						salvarCredCard = percCredCard/100;
						salvarEnergia = percEnergia/100;
						salvarInternet = percInternet/100;
						salvarPoupanca = percPoupanca/100;

						System.out.println(
								 "#=======================================#\n"
								+"|	Plano configurado com sucesso!	|\n"
								+"#=======================================#");
						
					}
					if (continuarPlanoPers.equalsIgnoreCase("N")) {
						
						percAgua = salvarAgua;
						percEnergia = salvarEnergia;
						percAlimentacao = salvarAlimentacao;
						percInternet = salvarInternet;
						percCredCard = salvarCredCard;
						percPoupanca = salvarPoupanca;

						System.out.println(
								 "#===============================================#\n"
								+"|	Alterações canceladas pelo usuário!	|\n"
								+"#===============================================#");
						
						
					}
					

					System.out.print(
							 "+---------------------------------------+\n"
							+"|	Tecle [ENTER] para voltar 	|\n"
							+"+---------------------------------------+");
					voltar = scan.nextLine();
					voltar = scan.nextLine();
					
					
					break;

				case 3:

					if (salvarAgua == 0) {
						System.out.println(
								 "#=====================================================================================#\n"
								+"|    Para exibir seu primeiro relatório, primeiro verifique seu plano recomendado!    |\n"    
								+"#=====================================================================================#");
						
							

						System.out.print(
								 "+---------------------------------------+\n"
								+"|	Tecle [ENTER] para voltar 	|\n"
								+"+---------------------------------------+");
						voltar = scan.nextLine();
						voltar = scan.nextLine();
						
					} else {

						vAgua = (vetRendaT[usuarioPosicao] - (vetRendaT[usuarioPosicao]
								- (vetRendaT[usuarioPosicao] * salvarAgua)));
						vEnergia = (vetRendaT[usuarioPosicao] - (vetRendaT[usuarioPosicao]
								- (vetRendaT[usuarioPosicao] * salvarEnergia)));
						vAlimentacao = (vetRendaT[usuarioPosicao] - (vetRendaT[usuarioPosicao]
								- (vetRendaT[usuarioPosicao] * salvarAlimentacao)));
						vInternet = (vetRendaT[usuarioPosicao] - (vetRendaT[usuarioPosicao]
								- (vetRendaT[usuarioPosicao] * salvarInternet)));
						vCredCard = (vetRendaT[usuarioPosicao] - (vetRendaT[usuarioPosicao]
								- (vetRendaT[usuarioPosicao] * salvarCredCard)));
						vPoupanca = (vetRendaT[usuarioPosicao] - (vetRendaT[usuarioPosicao]
								- (vetRendaT[usuarioPosicao] * salvarPoupanca)));
						vTotal = vAgua + vEnergia + vAlimentacao + vInternet + vCredCard + vPoupanca;

						System.out.println("\n\n");
						System.out.println(
								"//======================================\\\\\n"
								+"||		RELATÓRIO 		||\n"
								+"||>====================================<||\n"
								+"||	Nome: "+vetNome[usuarioPosicao]+"			||\n"
								+"||	Data Nasc.: "+vetData[usuarioPosicao]+" 		||\n"
								+"||	Renda total no mês: "+vetRendaT[usuarioPosicao]+"	||\n"				
								+"||>------------------------------------<||");
						
						System.out.printf("||	Água: R$%.2f			||%n" , vAgua);
						System.out.printf("||	Energia: R$%.2f 		||%n" , vEnergia);
						System.out.printf("||	Alimentação: R$%.2f 		||%n" , vAlimentacao);
						System.out.printf("||	Internet: R$%.2f 		||%n" , vInternet);
						System.out.printf("||	Cartão de crédito: R$%.2f 	||%n" , vCredCard);
						System.out.printf("||	Poupança: R$%.2f 		||%n" , vPoupanca);
						System.out.printf("||	Total de gastos: R$%.2f	||%n" , vTotal);
						System.out.printf("||	Renda restante: R$%.2f	||%n" , (vetRendaT[usuarioPosicao] - vTotal));
						System.out.println("\\\\======================================//");
					
						System.out.print(
								 "+---------------------------------------+\n"
								+"|	Tecle [ENTER] para voltar 	|\n"
								+"+---------------------------------------+");
						voltar = scan.nextLine();
						voltar = scan.nextLine();
						
					
					
					}
					
					break;
					
				case 0: 
					opcao2=0;
					break;
				default:

					System.out.println(
							 "+-------------------------------------------------------+\n"
							+"|	Opção incorreta, por favor tente novamente!	|\n"
							+"+-------------------------------------------------------+");
					break;

				}

				}while(opcao2!=0);
				}while(opcao2!=0);
				break;

			case 3:

				System.out.println("\n\n");
				System.out.println(
						  "//======================================================================================================\\\\\n"
						+ "||			Sistema Econômico pessoal (SEP)							||\n"
						+ "||													||\n"
						+ "||	O SEP foi criado com a finalidade de facilitar o gerenciamento de gastos mensal			||\n"
						+ "||	com planos de economia baseados no perfil do usuário. Nele você pode realizar um		||\n"
						+ "||	cadastro com seus dados pessoais e, após uma rápida análise do perfil cadastrado,		||\n"	
						+ "||	o programa mostrará a configuração de plano econômico mais adequada para você. Nesta		||\n"
						+ "||	configuração serão apresentados valores máximos para cada gasto (água, energia, etc)		||\n"
						+ "||	onde este valor representa o limite máximo de gasto que você pode efetuar para que o		||\n"
						+ "||	controle econômico aconteça. Além disso, independentemente do perfil do usuário, o		||\n"
						+ "||	plano econômico que for configurado contará com uma poupança, onde sempre será 	 		||\n"
						+ "||	recomendado ao usuário separar uma parte da renda mensal para uma poupança. Para usuários	||\n"
						+ "||	mais experientes em controles financeiros e que queira usar o programa apenas para 	 	||\n"
						+ "||	monitorar seus gastos, há a opção de plano personalizado para que ele mesmo altere os		||\n"
						+ "||	parâmetros de percentual de gastos de seu plano. Há ainda, uma área de relatório onde		||\n"
						+ "||	mostrará os valores em reais equivalente a quanto o usuário poderá gastar para continuar	||\n"
						+ "||	no limite máximo economizando seu dinheiro.							||\n"
						+ "||													||\n"
						+ "\\\\======================================================================================================//");

				System.out.print(
						 "+---------------------------------------+\n"
						+"|	Tecle [ENTER] para voltar 	|\n"
						+"+---------------------------------------+");
				voltar = scan.nextLine();
				voltar = scan.nextLine();
				
				break;
			
			case 0:	
				opcao1=0;
				break;
				
				
			default:

				System.out.println(
						 "+-------------------------------------------------------+\n"
						+"|	Opção incorreta, por favor tente novamente!	|\n"
						+"+-------------------------------------------------------+");
				break;	
			}

		} while (opcao1 != 0);

		
		
			
		
		if (opcao1 == 0) {
			System.out.println(
					 "+-----------------------------------------------+\n"
					+"|	 PROGRAMA FINALIZADO PELO USUÁRIO	|\n"
					+"+-----------------------------------------------+");
		}

	}

	// Método para calcular restante de percentuais

	static double percentual;
	static int confirmarPlanoPers = 1;
	
	public static void cálculo_plano_personalizado(double x) {

		if (x <= percentual) {
			percentual = percentual - x;
			confirmarPlanoPers = 0;
			
			System.out.println(
					 "#=======================================================================#\n"
					+"|	Pontos percentuais restantes a serem distribuídos = " + percentual + "%	|\n"
					+"#=======================================================================#");
		
		
		} else {
			confirmarPlanoPers = 1;
			System.out.println(
					 "#===============================================================#\n"
					+"|	Valor não pode ser aceitado pois não há                 |\n"
					+"|	pontos percentuais suficientes a serem distribuídos     |\n"
					+"|	Restam " + percentual + "%						|\n"
					+"#===============================================================#");

		}
	}

	
	

}
