/*[#2] Obter e atribuir um valor randômico a uma variável inteira...utiliza-se a função randômica da 
ferramenta de pseudocódigo (u.sorteia(valor_inicial, valor_final) no Studio). */
import java.util.Random;

public class exe2_INPR {
    public static void main (String [] args){
        Random ran = new Random();

        double n = Math.random() * 100; /*ran.nextInt(21);*/
        float m = ran.nextFloat () * 100;

        System.out.println("Seu número aleatório foi: " + n);
    }
}
