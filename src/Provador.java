
public class Provador {

	public static void main(String[] args) {
		
		
		Empresa empresaDespegar=new Empresa(5000.0, 100);
		
		Usuario usuarioDeDespegar=new Usuario(empresaDespegar, 1000.0, 4);
		
		Gerente gerente=new Gerente("jhonny");
		Junior junior=new Junior("milton");
		Senior senior=new Senior("berdeja");
		
		
		Double sueldoPromedioDelGerente=gerente.sueldoPromedio(empresaDespegar, usuarioDeDespegar);
		Double sueldoPromedioJunior=junior.sueldoPromedio(empresaDespegar, usuarioDeDespegar);
		Double sueldoPromedioSenior=senior.sueldoPromedio(empresaDespegar, usuarioDeDespegar);
		
		System.out.println("Sueldo promedio del gerente "+gerente.getNombre()+"  : "+sueldoPromedioDelGerente);
		System.out.println("Sueldo promedio del junior "+junior.getNombre()+"  : "+sueldoPromedioJunior);
		System.out.println("Sueldo promedio del senior "+senior.getNombre()+"  : "+sueldoPromedioSenior);
		
		
	}

}
