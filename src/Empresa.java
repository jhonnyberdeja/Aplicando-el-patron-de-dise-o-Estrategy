
public class Empresa {
	private Double sueldoBase;
	private int cantidadEmpleados;
	
	public Empresa(Double sueldoBase,int cantidadDeEmpleados){
		this.sueldoBase=sueldoBase;
		this.cantidadEmpleados=cantidadDeEmpleados;
		
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
	
	
	
}
