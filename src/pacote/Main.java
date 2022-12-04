package pacote;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Global.MostraLinha("BEM VINDO(A)!");
        System.out.println("Queres começar a usar?\n[A]Sim\n[X]Não");
        System.out.print("Insira sua escolha aqui: ");
        Scanner in = new Scanner(System.in);
        String escolha = in.nextLine();
        while (!escolha.equals("X")) 
        {
            Global.Menu();
            System.out.println("Queres continuar?\n[A]Sim\n[X]Não");
            System.out.print("Insira sua escolha aqui: ");
            escolha = in.nextLine();
        }
        Global.MostraLinha("SUA PONTUAÇÃO");
        System.out.println("Vitórias: " + Global.vitorias + "\nDerrotas: " + Global.derrotas + "\nEmpates: " + Global.empates);
    }
}
