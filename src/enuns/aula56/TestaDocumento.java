package enuns.aula56;

import java.sql.SQLOutput;

public class TestaDocumento {
    public static void main(String[] args) {

        for (TipoDocumento doc: TipoDocumento.values()){
            System.out.println(doc + ": " + doc.geraNumeroTeste());
        }
    }
}
