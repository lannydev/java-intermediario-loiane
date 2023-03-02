package enuns;

public class DiaSemanaTeste2 {
    public static void main(String[] args) {

        imprimeConstantes();

        System.out.println("");

        imprimeDiaSemana(DiaSemana.SEGUNDA);

    }

    private static void imprimeConstantes(){
        DiaSemana domingo = DiaSemana.DOMIN;
        DiaSemana segundaFeira = DiaSemana.SEGUNDA;
        DiaSemana tercaFeira = DiaSemana.TERCA;
        DiaSemana quartaaFeira = DiaSemana.QUARTA;
        DiaSemana quintaFeira = DiaSemana.QUINTA;
        DiaSemana sextaFeira = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;

        System.out.println(domingo);
        System.out.println(segundaFeira);
        System.out.println(tercaFeira);
        System.out.println(quartaaFeira);
        System.out.println(quintaFeira);
        System.out.println(sextaFeira);
        System.out.println(sabado);
    }

    private static void imprimeDiaSemana(DiaSemana dia){
        switch (dia){
            case DOMIN:
                System.out.println("Domingo");
                break;
            case SEGUNDA:
                System.out.println("Segunda Feira");
                break;
            case TERCA:
                System.out.println("Terça Feira");
                break;
            case QUARTA:
                System.out.println("Quarta Feira");
                break;
            case QUINTA:
                System.out.println("Quinta Feira");
                break;
            case SEXTA:
                System.out.println("Sexta Feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
        }
    }
}
