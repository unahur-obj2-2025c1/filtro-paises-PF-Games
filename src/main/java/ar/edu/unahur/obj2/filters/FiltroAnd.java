package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroAnd extends FiltroCompuesto {

	public FiltroAnd(List<IFiltro>filtros) {
		this.filtros = filtros;
	}
	
	
	
	public FiltroAnd(IFiltro filtro, IFiltro nuevo) {
		this.filtros.add(filtro);
		this.filtros.add(nuevo);
	}
	
	
	
	
	@Override
	public Boolean apply(Pais pais) {
		
		return null;
	}

}
