package ar.edu.unahur.obj2;
import java.util.List;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.filters.FiltroIdioma;
import ar.edu.unahur.obj2.filters.IFiltro;
import ar.edu.unahur.obj2.model.Pais;
import ar.edu.unahur.obj2.service.IPaisService;
import ar.edu.unahur.obj2.service.PaisService;


public class FIltroTest {

    @Test
	void prueba() {
		IPaisService paisService = new PaisService();
        List<Pais> paises = paisService.getPaises();
        IFiltro filtro = new FiltroIdioma("Arabic");
        IFiltro filtro2 = new FiltroIdioma("Arabic")
        		.and (new FiltroIdioma("French"));
        
        List<Pais> paisesFiltrados = paises.stream()
        				.filter(p -> filtro2.apply(p))
        				.toList();
        System.out.println(paisesFiltrados);
    }
}