package enuns;

public class Test {

    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class, "SEGUNDA"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMIN");
        System.out.println(dia);
    }
}
