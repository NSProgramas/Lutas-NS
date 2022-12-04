package pacote;
import java.util.Random;
import java.util.Scanner;
public class Luta 
{
    public static void Lutar() throws Exception //Finalmente, a luta!
    {
        Global.MostraLinha("HORA DA LUTA!");
        System.out.println("Escolha:\n[1]Mutante Esmagador\n[2]Destrói Muros\n[3]Pinguim Negociador");
        System.out.print("Insira sua escolha aqui:");
        Scanner in = new Scanner(System.in);
        int escolha = 0;
        Random ale = new Random(3);
        Lutador lutador, rival;
        try 
        {
            escolha = Integer.parseInt(in.nextLine());
            if (escolha > 3 || escolha < 1)
            {
                escolha = 1 + ale.nextInt(3);
                lutador = new Lutador(escolha);
                System.err.println("Insira um número válido! Como você não escolheu, o programa escolheu o " + lutador.nome);
            } else 
            {
                lutador = new Lutador(escolha);
            }
        } catch (Exception e) 
        {
            lutador = new Lutador(1 + ale.nextInt(3));
            System.err.println("Insira um número válido! Como você não escolheu, o programa escolheu o " + lutador.nome);
        }
        rival = new Lutador(1 + ale.nextInt(3));
        Global.MostraLinha("Lutadores: " + lutador.nome + " e " + rival.nome);
        while (lutador.getVida() > 0 && rival.getVida() > 0)
        {
            rival.Golpear(1 + ale.nextInt(3), lutador);
            System.out.println("Você perdeu " + (100 - lutador.getVida()) + " e ficou com " + lutador.getVida());
            Global.MostraLinha("SUA VEZ!");
            System.out.println("Escolha:\n[1]" + lutador.golpes.get(0) + "\n[2]" + lutador.golpes.get(1) + "\n[3]"+lutador.golpes.get(2));
            System.out.print("Insira sua escolha aqui: ");
            int golpe = Integer.parseInt(in.nextLine());
            lutador.Golpear(golpe, rival);
            System.out.println("O " + rival.nome + " perdeu " + (100 - rival.getVida()) + " de vida e agora possui " + rival.getVida());
            if (lutador.getVida() <= 0 && rival.getVida() <= 0)
            {
                Global.MostraLinha("EMPATE!");
                Global.empates++;
                break;
            } else if (lutador.getVida() == 0 && rival.getVida() > 0)
            {
                Global.MostraLinha("VOCÊ PERDEU!");
                Global.derrotas++;
                break;
            } else if (rival.getVida() == 0 && lutador.getVida() > 0)
            {
                Global.MostraLinha("VOCÊ VENCEU!");
                Global.vitorias++;
                break;
            }
        }
        
    }

    public static void Info() //Informações sobre um lutador aleatório
    {
        Random ale = new Random();
        Lutador self = new Lutador(1 + ale.nextInt(3));
        Global.MostraLinha(self.nome);
        System.out.println(self.info);
    }

    public static void Sobre() //Informações sobre o próprio aplicativo
    {
        Global.MostraLinha("INFORMAÇÕES SOBRE O JOGO");
        System.out.println("Ano de criação: 2022\nDesenvolvedor: Nicolas Souto\nSistema operacional: " + System.getProperty("os.name")); 
    }
}
