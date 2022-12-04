package pacote;
//Os imports
import java.util.Scanner;

public class Global //Essa classe contém as variáveis e funções globais
{
    //Variáveis/atriutos
    public static int vitorias=0, derrotas=0, empates=0;

    //Métodos/funções
    public static void MostraLinha(String msg) //Essa função exibe um texto enfeitado, como em títulos.
    {
        System.out.println("=".repeat(20));
        System.out.println(msg);
        System.out.println("=".repeat(20));
    }

    public static void Menu() throws Exception //Essa função exibe o menu 
    {
            Scanner in = new Scanner(System.in);
            MostraLinha("LUTAS NS");
            System.out.println("Escolha:\n[1]Lutar\n[2]Informações sobre um lutador aleatório\n[3]Sobre o aplicativo\n[4]Sair");
            System.out.println("Insira sua escolha aqui: ");
            int escolha = 0;
            try {
                escolha = Integer.parseInt(in.nextLine());
                if (escolha < 1 && escolha > 4) { //Caso o usuário insira um número inválido
                    System.err.println("Insira um número válido!");
                    Menu();
                }
            } catch (Exception e) { //Caso o usuário não insira número nenhum
                System.err.println("Insira um número válido!");
                Menu();
            } finally {
                switch (escolha) 
                {
                    case 1:
                        Luta.Lutar();
                        break;
                    case 2:
                        Luta.Info();
                        break;
                    case 3:
                        Luta.Sobre();
                        break;
                    case 4:
                        System.exit(0);
                }
            }
        }
    }
