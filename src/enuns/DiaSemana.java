package enuns;

public enum DiaSemana {

    DOMIN(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

    private int i;
    DiaSemana(int i) {
        this.i = i;
    }

    public int getI(){
        return this.i;
    }
}
