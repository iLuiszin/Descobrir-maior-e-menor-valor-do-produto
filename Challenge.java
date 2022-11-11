import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Challenge {
    public static List<Integer> retornaMenorEMaiorValorDeVendas(List<List<Integer>> tickets) {

        List<Integer> listaResultado = new ArrayList<Integer>(Arrays.asList(0, 0));
        List<List<Integer>> listaMaior = tickets;
        List<Integer> listaMenor = new ArrayList<Integer>();
        int maiorValor = 0;
        int menorValor = 0;
        int ValorDoElementoAtual = 0;

        for (int x = 0; x < listaMaior.size(); x++) {
            listaMenor = listaMaior.get(x);

            if (!listaMenor.isEmpty()) {
                for (int y = 0; y < listaMenor.size(); y++) {
                    ValorDoElementoAtual = listaMenor.get(y).intValue();

                    if (ValorDoElementoAtual != 0 && !(ValorDoElementoAtual < 20) && !(ValorDoElementoAtual > 500)) {
                        if (y == 0 && x == 0 && ValorDoElementoAtual != 0) {
                            menorValor = ValorDoElementoAtual;
                        }

                        if (maiorValor < ValorDoElementoAtual) {
                            maiorValor = ValorDoElementoAtual;
                            listaResultado.set(1, maiorValor);
                        }
                        //menorValor deve ser != 0
                        if (menorValor >= ValorDoElementoAtual)
                            menorValor = ValorDoElementoAtual;
                        listaResultado.set(0, menorValor);
                    }
                }
            }
        }
        return listaResultado;
    }
}
