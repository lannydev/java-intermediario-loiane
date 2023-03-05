package enuns;

public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.QUARTA;

        System.out.println(dia.toString() + "-" + dia.getI());

        Data data = new Data(1, 3, 2023, DiaSemana.TERCA);

        System.out.println(data.getDia() + "/" + data.getMes() + "/" + data.getAno() + " - " + data.getDiaSemana()  );


    }
}
