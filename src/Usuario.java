
public class Usuario {
	private Empresa empresa;
	private Double sueldoActual;
	private Categoria categoria;
	private int aniosExp;
	
	public Usuario(Empresa unaEmpresa,Double sueldoActual,int aniosExp){
		empresa=unaEmpresa;
		this.sueldoActual=sueldoActual;
		this.setAniosExp(aniosExp);
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Double getSueldoActual() {
		return sueldoActual;
	}
	public void setSueldoActual(Double sueldoActual) {
		this.sueldoActual = sueldoActual;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	//Flecha que apunta a la interface Categoria
	public Double sueldo(Empresa empresa,Usuario usuario){
		
		return categoria.sueldoPromedio(empresa, usuario);
	}
	//en el caso de que el usuario quiera escuchar una oferta de otra empresa para ver si le es comveniente cambiar de empresa
	public double sueldoEsperado(Empresa laOtraEmpresa){
		return categoria.sueldoPromedio(laOtraEmpresa, this);
	}
	
	public void escucharOferta(Double sueldoOfrecido,Empresa laOtraEmpresa){
		if(sueldoOfrecido>=this.sueldoEsperado(laOtraEmpresa)){
			this.cambiarTrabajo(sueldoOfrecido,laOtraEmpresa);
		}
	}
	public void cambiarTrabajo(Double nuevoSueldo,Empresa nuevaEmpresa){
		this.setEmpresa(nuevaEmpresa);
		this.setSueldoActual(nuevoSueldo);
	}

	public int getAniosExp() {
		return aniosExp;
	}

	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}
	
	
}
