package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroAnd extends FiltroCompuesto {

	public FiltroAnd(List<IFiltro>filtros) {
		this.filtros = filtros;
	}
	
	
	
	public FiltroAnd(IFiltro filtro, IFiltro filtro2) {
		this.filtros.add(filtro);
		this.filtros.add(filtro2);
	}
	
	public IFiltro or(IFiltro filtro) {
		return new FiltroOr(this, filtro);
	}
	
	
	@Override
	public Boolean apply(Pais pais) {
		return this.filtros.stream().allMatch(f -> f.apply(pais));
	}

}
