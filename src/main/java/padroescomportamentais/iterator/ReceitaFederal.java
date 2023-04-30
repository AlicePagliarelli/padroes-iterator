package padroescomportamentais.iterator;

import java.util.Iterator;

public class ReceitaFederal {

    public static Integer contarClientesAtivosNotaFsical (NotaFiscal notaFiscal) {
        int quantidade = 0;
        for (Cliente cliente : notaFiscal) {
            if (cliente.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalClientesNotaFiscal (NotaFiscal notaFiscal) {
        int quantidade = 0;
        for (Iterator a = notaFiscal.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
