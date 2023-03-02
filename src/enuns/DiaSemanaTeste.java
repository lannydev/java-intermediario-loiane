package enuns;

public class DiaSemanaTeste {
    public static void main(String[] args) {

        imprimeConstantes();

        System.out.println("");

        imprimeDiaSemana(1);

    }

    private static void imprimeConstantes(){
        int domingo = DiaSemanaConstante.DOMINGO;
        int segundaFeira = DiaSemanaConstante.SEGUNDA_FEIRA;
        int tercaFeira = DiaSemanaConstante.TERCA_FEIRA;
        int quartaaFeira = DiaSemanaConstante.QUARTA_FEIRA;
        int quintaFeira = DiaSemanaConstante.QUINTA_FEIRA;
        int sextaFeira = DiaSemanaConstante.SEXTA_FEIRA;
        int sabado = DiaSemanaConstante.SABADO;

        System.out.println(domingo);
        System.out.println(segundaFeira);
        System.out.println(tercaFeira);
        System.out.println(quartaaFeira);
        System.out.println(quintaFeira);
        System.out.println(sextaFeira);
        System.out.println(sabado);
    }

    private static void imprimeDiaSemana(int dia){
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda Feira");
                break;
            case 3:
                System.out.println("Terça Feira");
                break;
            case 4:
                System.out.println("Quarta Feira");
                break;
            case 5:
                System.out.println("Quinta Feira");
                break;
            case 6:
                System.out.println("Sexta Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
    }
}
