
public class Gerente implements Categoria{
	
	private String nombre;
	
	public Gerente(String nombre){
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public Double sueldoPromedio(Empresa unaEmpresa, Usuario unUsuario) {
		
		return unaEmpresa.getCantidadEmpleados()/10*unUsuario.getSueldoActual();
	}


	
	
	
}
