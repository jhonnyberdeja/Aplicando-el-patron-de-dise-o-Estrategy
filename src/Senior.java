
public class Senior implements Categoria{
	private String nombre;
	
	public Senior(String nombre){
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
		// TODO Auto-generated method stub
		return unUsuario.getSueldoActual()*2;
	}

	
	
}
