package pacote;
import java.util.ArrayList;
import java.util.List;
public class Lutador //Essa classe define o jogador e seu rival
{
    public int vida = 100;
    public String nome, info;
    public List<String> golpes = new ArrayList<String>();
    public boolean vivo;
    public int codigo;
    
    public Lutador(int codigo) 
    {
        switch(codigo)
        {
            case 1:
                this.nome = "Mutante Esmagador";
                this.info = "O Mutante era um gavião de caça treinado por especialistas.\nAté que um dia foi sequestrado por químicos e geneticistas loucos e teve os genes modificados até se tornar o mutante perigoso de hoje, participando de ringues e (quase) sempre vencendo.";
                this.golpes.add("Arranhar com as garras");
                this.golpes.add("Espancar com os braços-asas");
                this.golpes.add("Bicar o adversário");
                break;
            case 2:
                this.nome = "Destrói Muros";
                this.info = "O Destrói Muros foi encontrado aos 2 anos numa floresta por um clã de lutadores e passou a ser treinado pelos mesmos até os 30 anos, quando se tornou um dos mais fortes lutadores do mundo.";
                this.golpes.add("Derrubar o adversário");
                this.golpes.add("Chutar");
                this.golpes.add("Espancar");
                break;
            case 3:
                this.nome = "Pinguim Negociador";
                this.info = "Após treinar por anos, o Pinguim Negociador abriu um portal para o multiverso, lutando contra adversários de vários universos diferentes, adquirindo poderes sobre-humanos.";
                this.golpes.add("Bicar o adversário");
                this.golpes.add("Lançar uma bola de energia");
                this.golpes.add("Controlar a mente");
                break;
        }
    }

    public void setVida(int vida)
    {
        this.vida = vida;
    }

    public int getVida() 
    {
        return this.vida;
    }

    public void Golpear(int golpe, Lutador rival)//Caso um lutador golpeie outro
    {
        switch(golpe)
        {
            case 1:
                rival.setVida(rival.getVida() - 20); //O rival receberá 20 de dano
                break;
            case 2:
                rival.setVida(rival.getVida() - 25);//| ||||| 30 || ||||
                break;
            case 3:
                rival.setVida(rival.getVida() - 30);
                break;
            default:
                rival.setVida(rival.getVida()); //O rival vai continuar inteiro, pois o golpe foi inválido
        }
    }
}
