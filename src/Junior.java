
public class Junior implements Categoria{
	private String nombre;
	
	public Junior(String nombre){
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
		return unaEmpresa.getSueldoBase();
	}
	
}
