
public class Empresa {
	private String nombre;
	private Double sueldoBase;
	private int cantidadEmpleados;
	
	public Empresa(String nombre,Double sueldoBase,int cantidadDeEmpleados){
		this.sueldoBase=sueldoBase;
		this.cantidadEmpleados=cantidadDeEmpleados;
		this.nombre=nombre;
		
	}
	
	
	public Double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}
	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
