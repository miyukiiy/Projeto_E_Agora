package projeto1;

import java.util.Scanner;

public class teste_vocacional_metodo {
	
	private int desempate = 0;
	
	//Matematica
	private int xvezesmat = 0;
	private int respostamat = 0;
	private int nenhumamat = 0;

	//Naturalista
	private int xvezesnatu = 0;
	private int respostanatu = 0;
	private int nenhumanatu = 0;

	//Interpessoal
	private int xvezesinter = 0;
	private int respostainter = 0;
	private int nenhumainter = 0;

	//Corporal
	private int xvezescorp = 0;
	private int respostacorp = 0;
	private int nenhumacorp = 0;
	
		//M�todo inteligencia
		public void inteligencias() {
		
		Scanner leia = new Scanner(System.in);
		String[] mat = new String[3];
		String[] natu = new String[3];
		String[] inter = new String[3];
		String[] corp = new String[3];		
		
		
		// Matematica
		mat[0] = "\nPergunta 1 - Voc� tem facilidade em organizar suas tarefas, atividades e rotina a partir de listas e esquemas ?";
		mat[1] = "\nPergunta 2 - Voc� gosta de jogos de racioc�nio l�gico, como xadrez, puzzles, quebra � cabe�as ?";
		mat[2] = "\nPergunta 3 - Voc� consegue fazer contas simples de matem�tica de cabe�a de forma r�pida?";		
		
		for(int i = 0; i < 3; i++) {
			System.out.println(mat[i]);
			respostamat = leia.nextInt();
			
			if(respostamat == 1) {
				xvezesmat++;
			}
			else if(respostamat == 2){
				nenhumamat++;
			}
			
			else{
				while(respostamat!=1 && respostamat!=2) {
				System.out.println("Insira uma resposta v�lida: ");
				respostamat = leia.nextInt();
				if(respostamat == 1) {
					xvezesmat++;
				}
				else if(respostamat == 2){
					nenhumamat++;
				}
				}
			}
		}
		//Naturalista
		natu[0] = "\nPergunta 4 - Voc� participa de causas sociais relacionadas ao meio ambiente ?";
		natu[1] = "\nPergunta 5 - Voc� tem Alta tend�ncia � explora��o do meio ambiente e curiosidade sobre ele ?";
		natu[2] = "\nPergunta 6 - Voc� tem facilidade para adapta��o em diferentes ambientes ou habitats ?";
		for(int i = 0; i < 3; i++) {
			System.out.println(natu[i]);
			respostanatu = leia.nextInt();
			
			if(respostanatu == 1) {
				xvezesnatu++;
			}
			else if(respostanatu == 2){
				nenhumanatu++;
			}
			else{
				while(respostanatu!=1 && respostanatu!=2) {
				System.out.println("Insira uma resposta v�lida: ");
				respostanatu = leia.nextInt();
				if(respostanatu == 1) {
					xvezesnatu++;
				}
				else if(respostanatu == 2){
					nenhumanatu++;
				}
			}
			}
		}
		//Interpessoal
		inter[0] = "\nPergunta 7 - Voc� se considera comunicativo(a) ?";
		inter[1] = "\nPergunta 8 - Voc� tem facilidade de  compreender os sentimentos do pr�ximo ?";
		inter[2] = "\nPergunta 9 - Voc� sempre se mant�m humorado(a) e otimista ?";
		for(int i = 0; i < 3; i++) {
			System.out.println(inter[i]);
			respostainter = leia.nextInt();
			
			if(respostainter == 1) {
				xvezesinter++;
			}
			else if(respostainter == 2){
				nenhumainter++;
			}
			else{
				while(respostainter!=1 && respostainter!=2) {
				System.out.println("Insira uma resposta v�lida: ");
				respostainter = leia.nextInt();
				if(respostainter == 1) {
					xvezesinter++;
				}
				else if(respostainter == 2){
					nenhumainter++;
				}
			}
			}
		}
		//Corporal
		corp[0] = "\nPergunta 10 - Voc� gosta de se exercitar ou dan�ar ?";
		corp[1] = "\nPergunta 11 - Voc� tem uma boa coordena��o motora ?";
		corp[2] = "\nPergunta 12 - Voc� gosta de atuar ?";
		for(int i = 0; i < 3; i++) {
			System.out.println(corp[i]);
			respostacorp = leia.nextInt();
			
			if(respostacorp == 1) {
				xvezescorp++;
			}
			else if(respostacorp == 2){
				nenhumacorp++;
			}
			else{
				while(respostacorp!=1 && respostacorp!=2) {
				System.out.println("Insira uma resposta v�lida: ");
				respostacorp = leia.nextInt();
				if(respostacorp == 1) {
					xvezescorp++;
				}
				else if(respostacorp == 2){
					nenhumacorp++;
				}
			}
			}
		}
		
		//Qual a maior inteligenca
		
		if(xvezesmat>xvezesnatu && xvezesmat> xvezesinter && xvezesmat> xvezescorp){
			System.out.println("\n=============================================================");
			System.out.println("=    A sua principal intelig�ncia � a L�gico Matem�tica:    ="
						   + "\n============================================================="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    A intelig�ncia l�gico-matem�tica est� diretamente ligada � capacidade de manipular n�meros  e padr�es l�gicos        ="
						   + "\n=    fazendo uso da raz�o.Tamb�m refere-se � habilidade de analisar as situa��es de maneira abstrata ou a partir de       ="
						   + "\n=    conceitos cient�ficos. As pessoas cuja intelig�ncia predominante � a l�gico-matem�tica possuem mais facilidade       ="
						   + "\n=    em realizar c�lculos,bem como resolver problemas de forma anal�tica.                                                 ="
						   + "\n=                                                                                                                         ="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    Profiss�es: Engenheiro, Profissional TI, Biom�dico, Arquiteto, Jogador profissional de Poker.                        ="
						   + "\n=                                                                                                                         ="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    Cursos: Automa��o Industrial, Ci�ncias Cont�beis, Estat�stica e Economia                                             ="
						   + "\n=                                                                                                                         ="
						   + "\n===========================================================================================================================");
		}
		else if(xvezesnatu > xvezesmat&& xvezesnatu > xvezesinter && xvezesnatu > xvezescorp) {
			System.out.println("\n=======================================================");
			System.out.println("=    A sua principal intelig�ncia � a Naturalista:    ="
						   + "\n======================================================="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    A intelig�ncia naturalista � definida como a capacidade para perceber o meio ambiente e realizar classifica��es,     ="
						   + "\n=    distin��es e manipula��es dos diferentes elementos que o comp�em; objetos, plantas ou animais e seus detalhes.       ="
						   + "\n=    Al�m disso, implica a habilidade para realizar conex�es e rela��es entre esses componentes, com o objetivo de        ="
						   + "\n=    melhorar a intera��o com o ambiente por meio das informa��es coletadas. Essa defini��o abrange tanto o contexto      ="
						   + "\n=    urbano, suburbano, como rural.                                                                                       ="
						   + "\n=                                                                                                                         ="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    Profiss�es: Veterin�ria, Biologo, Meteorologista.                                                                    ="
						   + "\n=                                                                                                                         ="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    Cursos: Astronomia, Agronomia, Seguran�a florestal, Ci�ncia da Computa��o.                                           ="
						   + "\n=                                                                                                                         ="
						   + "\n===========================================================================================================================");

		}
		else if(xvezesinter > xvezesmat && xvezesinter > xvezesnatu && xvezesinter > xvezescorp){
			System.out.println("\n==============================================================");
			System.out.println("=    A sua principal intelig�ncia � a L�gico Interpessoal:    ="
						   + "\n==============================================================="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    A intelig�ncia interpessoal � a habilidade de se relacionar com as outras pessoas. Quando uma pessoa tem             ="
						   + "\n=    intelig�ncia interpessoal, ela � capaz de entender melhor os outros e suas emo��es, bem como necessidades,           ="
						   + "\n=    inten��es e motiva��es. tanto, � emp�tica, simp�tica, amig�vel, mais extrovertida e comunicativa, al�m de            ="
						   + "\n=    carism�tica e com um humor para cima.                                                                                ="
						   + "\n=                                                                                                                         ="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    Profiss�es: Professor, Psic�logo, M�dico, Gerente e Gestor, Vendedor, Advogado e Pol�tico.                           ="
						   + "\n=                                                                                                                         ="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    Cursos: Pedagogia, Psicologia, Medicina, administra��o, Gest�o Comercial, Direito, Rela��es p�blicas.                ="
						   + "\n=                                                                                                                         ="
						   + "\n===========================================================================================================================");
		}
		else if(xvezescorp > xvezesmat&& xvezescorp > xvezesnatu && xvezescorp > xvezesinter){
			System.out.println("\n===================================================");
			System.out.println("=    A sua principal intelig�ncia � a Corporal:    ="
						   + "\n===================================================="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    A intelig�ncia corporal compreende a capacidade que o ser humano tem em controlar e equilibrar seus movimentos       ="
						   + "\n=    corporais, utilizando seu corpo como um meio para se expressar. A pessoa que possui o dom�nio da intelig�ncia        ="
						   + "\n=    corporal-cinest�sica possui completo controle e precis�o sobre o seu corpo, podendo ter movimentos bem               ="
						   + "\n=    flex�veis e coordenados.                                                                                             ="
						   + "\n=                                                                                                                         ="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    Profiss�es: Dan�arino, Ator, Atleta, Artistas pl�sticos.                                                             ="
						   + "\n=                                                                                                                         ="
						   + "\n==========================================================================================================================="
						   + "\n=                                                                                                                         ="
						   + "\n=    Cursos: Dan�a, Artes c�nicas, Esportismo, Artes.                                                                     ="
						   + "\n=                                                                                                                         ="
						   + "\n===========================================================================================================================");
		}
		
		//Caso o usu�rio coloque tudo n�o
		if(nenhumamat==3 && nenhumanatu==3 && nenhumainter==3 && nenhumacorp==3) {
			System.out.println("\nVoc� selecionou nenhum sim, fa�a o teste novamente");
		}
		
		//Caso o usu�rio coloque tudo sim
		if(xvezesmat==3 && xvezesnatu==3 && xvezesinter==3 && xvezescorp==3) {
			System.out.println("\nVoc� selecionou nenhum n�o, fa�a o teste novamente");
		}
		
		//Caso alguma inteligencia de igual a outra
		
		else if(xvezesmat==xvezesnatu && xvezesmat>xvezesinter && xvezesmat>xvezescorp) {
			System.out.println("Voce se simpatiza com n�meros ?");
			desempate = leia.nextInt();
			if(desempate==1){
				System.out.println("\n=============================================================");
				System.out.println("=    A sua principal intelig�ncia � a L�gico Matem�tica:    ="
							   + "\n============================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia l�gico-matem�tica est� diretamente ligada � capacidade de manipular n�meros  e padr�es l�gicos        ="
							   + "\n=    fazendo uso da raz�o.Tamb�m refere-se � habilidade de analisar as situa��es de maneira abstrata ou a partir de       ="
							   + "\n=    conceitos cient�ficos. As pessoas cuja intelig�ncia predominante � a l�gico-matem�tica possuem mais facilidade       ="
							   + "\n=    em realizar c�lculos,bem como resolver problemas de forma anal�tica.                                                 ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Engenheiro, Profissional TI, Biom�dico, Arquiteto, Jogador profissional de Poker.                        ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Automa��o Industrial, Ci�ncias Cont�beis, Estat�stica e Economia                                             ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
			}
			else {
				System.out.println("\n=======================================================");
				System.out.println("=    A sua principal intelig�ncia � a Naturalista:    ="
							   + "\n======================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia naturalista � definida como a capacidade para perceber o meio ambiente e realizar classifica��es,     ="
							   + "\n=    distin��es e manipula��es dos diferentes elementos que o comp�em; objetos, plantas ou animais e seus detalhes.       ="
							   + "\n=    Al�m disso, implica a habilidade para realizar conex�es e rela��es entre esses componentes, com o objetivo de        ="
							   + "\n=    melhorar a intera��o com o ambiente por meio das informa��es coletadas. Essa defini��o abrange tanto o contexto      ="
							   + "\n=    urbano, suburbano, como rural.                                                                                       ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Veterin�ria, Biologo, Meteorologista.                                                                    ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Astronomia, Agronomia, Seguran�a florestal, Ci�ncia da Computa��o.                                           ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
				}	
			}
		
		else if(xvezesmat==xvezesinter && xvezesmat>xvezesnatu && xvezesmat>xvezescorp) {
			System.out.println("Voce se simpatiza com n�meros ?");
			desempate = leia.nextInt();
			if(desempate==1){
				System.out.println("\n=============================================================");
				System.out.println("=    A sua principal intelig�ncia � a L�gico Matem�tica:    ="
							   + "\n============================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia l�gico-matem�tica est� diretamente ligada � capacidade de manipular n�meros  e padr�es l�gicos        ="
							   + "\n=    fazendo uso da raz�o.Tamb�m refere-se � habilidade de analisar as situa��es de maneira abstrata ou a partir de       ="
							   + "\n=    conceitos cient�ficos. As pessoas cuja intelig�ncia predominante � a l�gico-matem�tica possuem mais facilidade       ="
							   + "\n=    em realizar c�lculos,bem como resolver problemas de forma anal�tica.                                                 ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Engenheiro, Profissional TI, Biom�dico, Arquiteto, Jogador profissional de Poker.                        ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Automa��o Industrial, Ci�ncias Cont�beis, Estat�stica e Economia                                             ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
			}
			else {
				System.out.println("\n==============================================================");
				System.out.println("=    A sua principal intelig�ncia � a L�gico Interpessoal:    ="
							   + "\n==============================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia interpessoal � a habilidade de se relacionar com as outras pessoas. Quando uma pessoa tem             ="
							   + "\n=    intelig�ncia interpessoal, ela � capaz de entender melhor os outros e suas emo��es, bem como necessidades,           ="
							   + "\n=    inten��es e motiva��es. tanto, � emp�tica, simp�tica, amig�vel, mais extrovertida e comunicativa, al�m de            ="
							   + "\n=    carism�tica e com um humor para cima.                                                                                ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Professor, Psic�logo, M�dico, Gerente e Gestor, Vendedor, Advogado e Pol�tico.                           ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Pedagogia, Psicologia, Medicina, administra��o, Gest�o Comercial, Direito, Rela��es p�blicas.                ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
				}	
			}
		
		else if(xvezesmat==xvezescorp && xvezesmat>xvezesnatu && xvezesmat>xvezesinter) {
			System.out.println("Voce se simpatiza com n�meros ?");
			desempate = leia.nextInt();
			if(desempate==1){
				System.out.println("\n=============================================================");
				System.out.println("=    A sua principal intelig�ncia � a L�gico Matem�tica:    ="
							   + "\n============================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia l�gico-matem�tica est� diretamente ligada � capacidade de manipular n�meros  e padr�es l�gicos        ="
							   + "\n=    fazendo uso da raz�o.Tamb�m refere-se � habilidade de analisar as situa��es de maneira abstrata ou a partir de       ="
							   + "\n=    conceitos cient�ficos. As pessoas cuja intelig�ncia predominante � a l�gico-matem�tica possuem mais facilidade       ="
							   + "\n=    em realizar c�lculos,bem como resolver problemas de forma anal�tica.                                                 ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Engenheiro, Profissional TI, Biom�dico, Arquiteto, Jogador profissional de Poker.                        ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Automa��o Industrial, Ci�ncias Cont�beis, Estat�stica e Economia                                             ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
			}
			else {
				System.out.println("\n===================================================");
				System.out.println("=    A sua principal intelig�ncia � a Corporal:    ="
							   + "\n===================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia corporal compreende a capacidade que o ser humano tem em controlar e equilibrar seus movimentos       ="
							   + "\n=    corporais, utilizando seu corpo como um meio para se expressar. A pessoa que possui o dom�nio da intelig�ncia        ="
							   + "\n=    corporal-cinest�sica possui completo controle e precis�o sobre o seu corpo, podendo ter movimentos bem               ="
							   + "\n=    flex�veis e coordenados.                                                                                             ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Dan�arino, Ator, Atleta, Artistas pl�sticos.                                                             ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Dan�a, Artes c�nicas, Esportismo, Artes.                                                                     ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
				}	
			}
		
		else if(xvezesmat==xvezesinter && xvezesmat>xvezesnatu && xvezesmat>xvezescorp) {
			System.out.println("Voce se simpatiza com n�meros ?");
			desempate = leia.nextInt();
			if(desempate==1){
				System.out.println("\n=============================================================");
				System.out.println("=    A sua principal intelig�ncia � a L�gico Matem�tica:    ="
							   + "\n============================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia l�gico-matem�tica est� diretamente ligada � capacidade de manipular n�meros  e padr�es l�gicos        ="
							   + "\n=    fazendo uso da raz�o.Tamb�m refere-se � habilidade de analisar as situa��es de maneira abstrata ou a partir de       ="
							   + "\n=    conceitos cient�ficos. As pessoas cuja intelig�ncia predominante � a l�gico-matem�tica possuem mais facilidade       ="
							   + "\n=    em realizar c�lculos,bem como resolver problemas de forma anal�tica.                                                 ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Engenheiro, Profissional TI, Biom�dico, Arquiteto, Jogador profissional de Poker.                        ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Automa��o Industrial, Ci�ncias Cont�beis, Estat�stica e Economia                                             ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
			}
			else {
				System.out.println("\n==============================================================");
				System.out.println("=    A sua principal intelig�ncia � a L�gico Interpessoal:    ="
							   + "\n==============================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia interpessoal � a habilidade de se relacionar com as outras pessoas. Quando uma pessoa tem             ="
							   + "\n=    intelig�ncia interpessoal, ela � capaz de entender melhor os outros e suas emo��es, bem como necessidades,           ="
							   + "\n=    inten��es e motiva��es. tanto, � emp�tica, simp�tica, amig�vel, mais extrovertida e comunicativa, al�m de            ="
							   + "\n=    carism�tica e com um humor para cima.                                                                                ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Professor, Psic�logo, M�dico, Gerente e Gestor, Vendedor, Advogado e Pol�tico.                           ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Pedagogia, Psicologia, Medicina, administra��o, Gest�o Comercial, Direito, Rela��es p�blicas.                ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
				}	
			}
		
		else if(xvezesnatu==xvezesinter && xvezesnatu>xvezesmat && xvezesnatu>xvezescorp) {
			System.out.println("Voce se simpatiza com a natureza ?");
			desempate = leia.nextInt();
			if(desempate==1){
				System.out.println("\n=======================================================");
				System.out.println("=    A sua principal intelig�ncia � a Naturalista:    ="
							   + "\n======================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia naturalista � definida como a capacidade para perceber o meio ambiente e realizar classifica��es,     ="
							   + "\n=    distin��es e manipula��es dos diferentes elementos que o comp�em; objetos, plantas ou animais e seus detalhes.       ="
							   + "\n=    Al�m disso, implica a habilidade para realizar conex�es e rela��es entre esses componentes, com o objetivo de        ="
							   + "\n=    melhorar a intera��o com o ambiente por meio das informa��es coletadas. Essa defini��o abrange tanto o contexto      ="
							   + "\n=    urbano, suburbano, como rural.                                                                                       ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Veterin�ria, Biologo, Meteorologista.                                                                    ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Astronomia, Agronomia, Seguran�a florestal, Ci�ncia da Computa��o.                                           ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
			}
			else {
				System.out.println("\n==============================================================");
				System.out.println("=    A sua principal intelig�ncia � a L�gico Interpessoal:    ="
							   + "\n==============================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia interpessoal � a habilidade de se relacionar com as outras pessoas. Quando uma pessoa tem             ="
							   + "\n=    intelig�ncia interpessoal, ela � capaz de entender melhor os outros e suas emo��es, bem como necessidades,           ="
							   + "\n=    inten��es e motiva��es. tanto, � emp�tica, simp�tica, amig�vel, mais extrovertida e comunicativa, al�m de            ="
							   + "\n=    carism�tica e com um humor para cima.                                                                                ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Professor, Psic�logo, M�dico, Gerente e Gestor, Vendedor, Advogado e Pol�tico.                           ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Pedagogia, Psicologia, Medicina, administra��o, Gest�o Comercial, Direito, Rela��es p�blicas.                ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
				}	
			}
		else if(xvezesnatu==xvezescorp && xvezesnatu>xvezesmat && xvezesnatu>xvezesinter) {
			System.out.println("Voce se simpatiza com a natureza ?");
			desempate = leia.nextInt();
			if(desempate==1){
				System.out.println("\n=======================================================");
				System.out.println("=    A sua principal intelig�ncia � a Naturalista:    ="
							   + "\n======================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia naturalista � definida como a capacidade para perceber o meio ambiente e realizar classifica��es,     ="
							   + "\n=    distin��es e manipula��es dos diferentes elementos que o comp�em; objetos, plantas ou animais e seus detalhes.       ="
							   + "\n=    Al�m disso, implica a habilidade para realizar conex�es e rela��es entre esses componentes, com o objetivo de        ="
							   + "\n=    melhorar a intera��o com o ambiente por meio das informa��es coletadas. Essa defini��o abrange tanto o contexto      ="
							   + "\n=    urbano, suburbano, como rural.                                                                                       ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Veterin�ria, Biologo, Meteorologista.                                                                    ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Astronomia, Agronomia, Seguran�a florestal, Ci�ncia da Computa��o.                                           ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
			}
			else {
				System.out.println("\n===================================================");
				System.out.println("=    A sua principal intelig�ncia � a Corporal:    ="
							   + "\n===================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia corporal compreende a capacidade que o ser humano tem em controlar e equilibrar seus movimentos       ="
							   + "\n=    corporais, utilizando seu corpo como um meio para se expressar. A pessoa que possui o dom�nio da intelig�ncia        ="
							   + "\n=    corporal-cinest�sica possui completo controle e precis�o sobre o seu corpo, podendo ter movimentos bem               ="
							   + "\n=    flex�veis e coordenados.                                                                                             ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Dan�arino, Ator, Atleta, Artistas pl�sticos.                                                             ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Dan�a, Artes c�nicas, Esportismo, Artes.                                                                     ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
				}	
			}
		else if(xvezesinter==xvezescorp && xvezesinter>xvezesmat && xvezesinter>xvezesnatu) {
			System.out.println("Voce se simpatiza com as pessoas facilmente ?");
			desempate = leia.nextInt();
			if(desempate==1){
				System.out.println("\n==============================================================");
				System.out.println("=    A sua principal intelig�ncia � a L�gico Interpessoal:    ="
							   + "\n==============================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia interpessoal � a habilidade de se relacionar com as outras pessoas. Quando uma pessoa tem             ="
							   + "\n=    intelig�ncia interpessoal, ela � capaz de entender melhor os outros e suas emo��es, bem como necessidades,           ="
							   + "\n=    inten��es e motiva��es. tanto, � emp�tica, simp�tica, amig�vel, mais extrovertida e comunicativa, al�m de            ="
							   + "\n=    carism�tica e com um humor para cima.                                                                                ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Professor, Psic�logo, M�dico, Gerente e Gestor, Vendedor, Advogado e Pol�tico.                           ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Pedagogia, Psicologia, Medicina, administra��o, Gest�o Comercial, Direito, Rela��es p�blicas.                ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
			}
			else {
				System.out.println("\n===================================================");
				System.out.println("=    A sua principal intelig�ncia � a Corporal:    ="
							   + "\n===================================================="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    A intelig�ncia corporal compreende a capacidade que o ser humano tem em controlar e equilibrar seus movimentos       ="
							   + "\n=    corporais, utilizando seu corpo como um meio para se expressar. A pessoa que possui o dom�nio da intelig�ncia        ="
							   + "\n=    corporal-cinest�sica possui completo controle e precis�o sobre o seu corpo, podendo ter movimentos bem               ="
							   + "\n=    flex�veis e coordenados.                                                                                             ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Profiss�es: Dan�arino, Ator, Atleta, Artistas pl�sticos.                                                             ="
							   + "\n=                                                                                                                         ="
							   + "\n==========================================================================================================================="
							   + "\n=                                                                                                                         ="
							   + "\n=    Cursos: Dan�a, Artes c�nicas, Esportismo, Artes.                                                                     ="
							   + "\n=                                                                                                                         ="
							   + "\n===========================================================================================================================");
				}	
			}
		
		leia.close();
	
	}

	public int getDesempate() {
		return desempate;
	}

	public void setDesempate(int desempate) {
		this.desempate = desempate;
	}

	public int getXvezesmat() {
		return xvezesmat;
	}

	public void setXvezesmat(int xvezesmat) {
		this.xvezesmat = xvezesmat;
	}

	public int getRespostamat() {
		return respostamat;
	}

	public void setRespostamat(int respostamat) {
		this.respostamat = respostamat;
	}

	public int getNenhumamat() {
		return nenhumamat;
	}

	public void setNenhumamat(int nenhumamat) {
		this.nenhumamat = nenhumamat;
	}

	public int getXvezesnatu() {
		return xvezesnatu;
	}

	public void setXvezesnatu(int xvezesnatu) {
		this.xvezesnatu = xvezesnatu;
	}

	public int getRespostanatu() {
		return respostanatu;
	}

	public void setRespostanatu(int respostanatu) {
		this.respostanatu = respostanatu;
	}

	public int getNenhumanatu() {
		return nenhumanatu;
	}

	public void setNenhumanatu(int nenhumanatu) {
		this.nenhumanatu = nenhumanatu;
	}

	public int getXvezesinter() {
		return xvezesinter;
	}

	public void setXvezesinter(int xvezesinter) {
		this.xvezesinter = xvezesinter;
	}

	public int getRespostainter() {
		return respostainter;
	}

	public void setRespostainter(int respostainter) {
		this.respostainter = respostainter;
	}

	public int getNenhumainter() {
		return nenhumainter;
	}

	public void setNenhumainter(int nenhumainter) {
		this.nenhumainter = nenhumainter;
	}

	public int getXvezescorp() {
		return xvezescorp;
	}

	public void setXvezescorp(int xvezescorp) {
		this.xvezescorp = xvezescorp;
	}

	public int getRespostacorp() {
		return respostacorp;
	}

	public void setRespostacorp(int respostacorp) {
		this.respostacorp = respostacorp;
	}

	public int getNenhumacorp() {
		return nenhumacorp;
	}

	public void setNenhumacorp(int nenhumacorp) {
		this.nenhumacorp = nenhumacorp;
	}
	
	
}
	


