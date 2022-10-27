

/**
 * Classe de exemplo para o exercicio da aula de
 * controle de fluxo.
 * Criar um simples projeto usando if e switch. Com if exiba o nome do mês do ano de acordo
 * com seu numero. Evite o efeito "flecha". Faça também  outro if  que verifique se o mês é julho,
 * dezembro ou janeiro, para assim exibir o texto "férias".
 */

public class Main {
    public static void main(String[] args) {


        String mes = "janeiro";
            switch (mes) {
                case "dezembro":
                case "julho":
                case "agosto":
                    System.out.println("férias");
                    break;
                default:
                    System.out.println("mês indefinido");
                    break;
            }
        }
    }



























/** private static void switchSemana() {
 String dia = "Terça";
 switch (dia){

 case "segunda";

 System.out.println("1");

 break;

 case "terça";

 System.out.println("2");

 break;

 case "quarta";

 System.out.println("3");

 break;

 case "quintao";

 System.out.println("4");

 break;

 case "sextao";

 System.out.println("5");

 break;

 case "sábado";

 System.out.println("6");

 break;

 case "domingo";

 System.out.println("7");

 break;

 default;


 System.out.println("7");
 System.out.println("Dia inválido");
 break;


 }


 }
 }

 */

