package enuns;

public enum DiaSemana {

    DOMIN(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

    private int i;
    private DiaSemana(int i) {
        this.i = i;
    }

    private int getI(){
        return i;
    }
}
