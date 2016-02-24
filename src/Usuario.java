import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Usuario {
	private Empresa empresa;
	private Double sueldoActual;
	private Categoria categoria;
	private int aniosExp;
	private Set<Empresa> listaHistorialDeEmpresasEnDondeTrabaje=new HashSet<Empresa>();
	
	public Usuario(Empresa unaEmpresa,Double sueldoActual,int aniosExp,Categoria categoria){
		this.empresa=unaEmpresa;
		this.sueldoActual=sueldoActual;
		this.setAniosExp(aniosExp);
		this.categoria=categoria;
		this.cargarHistorilDeEmpresasEnLasQueTrabaje(unaEmpresa);
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
	

	public int getAniosExp() {
		return aniosExp;
	}

	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}
	
	//Flecha que apunta a la interface Categoria
	public Double sueldo(Empresa empresa,Usuario usuario){
		
		return categoria.sueldoPromedio(empresa, usuario);
	}
	
	
	
	
	
	//***************************************************************************
	//en el caso de que el usuario quiera escuchar una oferta de otra empresa para ver si le es comveniente cambiar de empresa
	public Double sueldoEsperado(Empresa laOtraEmpresa){
		return this.categoria.sueldoPromedio(laOtraEmpresa, this);
	}
	//*********************************************************************************
	
	
	
	
	
	
	public void escucharOferta(Double sueldoOfrecido,Empresa laOtraEmpresa){
		if(sueldoOfrecido>=this.sueldoEsperado(laOtraEmpresa)){
			this.cambiarTrabajo(sueldoOfrecido,laOtraEmpresa);
			cargarHistorilDeEmpresasEnLasQueTrabaje(laOtraEmpresa);
		}
	}
	public void cambiarTrabajo(Double nuevoSueldo,Empresa nuevaEmpresa){
		this.setEmpresa(nuevaEmpresa);
		this.setSueldoActual(nuevoSueldo);
		cargarHistorilDeEmpresasEnLasQueTrabaje(nuevaEmpresa);
	}
	//cargar las empresas en donde trabaje en una coleccion set
	public void cargarHistorilDeEmpresasEnLasQueTrabaje(Empresa empresa){
		listaHistorialDeEmpresasEnDondeTrabaje.add(empresa);
	}
	
	//mostrar la lista del historil de empresas en las trabaje
	public void mostrarHistorialDeEmpresasEnLasQueTrabaje(){
		for(Empresa emp : listaHistorialDeEmpresasEnDondeTrabaje){
			System.out.println("Empresa : "+emp.getNombre());
		}
	}
	
}
