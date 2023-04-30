package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceitaFederalTest {

    @Test
    void deveContarClientesAtivosNotaFiscal() {
        NotaFiscal notaFiscal = new NotaFiscal(
                new Cliente("Marco", true),
                new Cliente("Antonio", true),
                new Cliente("Jose", false),
                new Cliente("Maria", true)
        );
        assertEquals(3, ReceitaFederal.contarClientesAtivosNotaFsical(notaFiscal));
    }

    @Test
    void deveContarTotalClientesNotaFiscal() {
        NotaFiscal notaFiscal = new NotaFiscal(
                new Cliente("Marco", true),
                new Cliente("Antonio", true),
                new Cliente("Jose", false),
                new Cliente("Maria", true)
        );
        assertEquals(4, ReceitaFederal.contarTotalClientesNotaFiscal(notaFiscal));
    }

}