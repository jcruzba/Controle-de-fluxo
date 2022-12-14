/**
 * Classe de exemplo para o exercicio da aula de
 * controle de fluxo.
 * Criar um simples projeto usando if e switch. Com if exiba o nome do mês do ano de acordo
 * com seu numero. Evite o efeito "flecha". Usando swtich onde o dia da semana escolhido exibi o numero correspondente, se não, dia inválido. 
 * Outros exercicios usando swicht onde 1,2 e 3 exibi "certo, exibi "errado", 5 exibi "talvez"e 5 "valor indefinido".
 * Por ultimo use switch usando String, swtich que verifique se o mês é julho,
 * dezembro ou janeiro, para assim exibir o texto "férias".
 */

public class Main {
    public static void main(String[] args) {

        ifsemFlecha();
        switchSemana();
        switchNumero();
        switchFerias();
    }


    private static void ifsemFlecha() {


        int mes = 10;
        {
            if (mes == 1) {
                System.out.println("Janeiro ");
            } else if (mes == 2) {
                System.out.println("Fevereiro ");
            } else if (mes == 3) {
                System.out.println("Março ");
            } else if (mes == 4) {
                System.out.println("Abril ");
            } else if (mes == 5) {
                System.out.println("Maio ");
            } else if (mes == 6) {
                System.out.println("Junho ");
            } else if (mes == 7) {
                System.out.println("Julho ");
            } else if (mes == 8) {
                System.out.println("Agosto ");
            } else if (mes == 9) {
                System.out.println("Setembro ");
            } else if (mes == 10) {
                System.out.println("Outubro ");
            } else if (mes == 11) {
                System.out.println("Novembro ");
            } else if (mes == 12) {
                System.out.println("Dezembro ");
            } else System.out.println("Mês indefinido");
        }
    }

    private static void switchSemana() {
        String dia = "Terça";
        switch (dia) {

            case "Segunda":

                System.out.println("1");

                break;

            case "Terça":

                System.out.println("2");

                break;

            case "Quarta":

                System.out.println("3");

                break;

            case "Quinta":

                System.out.println("4");

                break;

            case "Sextao":

                System.out.println("5");

                break;

            case "Sábado":

                System.out.println("6");

                break;

            case "Domingo":

                System.out.println("7");

                break;

            default:
                System.out.println("Dia inválido");
                break;


        }


    }

    private static void switchNumero() {
        int numero = 5;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo ");
                break;

            case 4:
                System.out.println("Errado ");
                break;

            case 5:
                System.out.println("Talvez ");
                break;

            case 6:
                System.out.println("Valor indefinido ");
                break;
        }

    }

    private static void switchFerias(){

        String mes = "Dezembro";

        switch (mes) {
            case "Dezembro":
            case "Julho":
            case "Janeiro":
                System.out.println("Férias ");
                break;
            default:
                System.out.println("Mês de trabalho");
                break;


        }
    }
}











