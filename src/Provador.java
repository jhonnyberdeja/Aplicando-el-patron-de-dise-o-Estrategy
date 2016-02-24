
public class Provador {

	public static void main(String[] args) {
		
		
		Empresa empresaDespegar=new Empresa("Despegar.com",5000.0, 100);
		
		
		
		Gerente gerente=new Gerente("jhonny");
		//Junior junior=new Junior("milton");
		//Senior senior=new Senior("berdeja");
		
		
		Usuario usuarioGerente=new Usuario(empresaDespegar, 1000.0, 7,gerente);
		//Usuario usuarioJunior=new Usuario(empresaDespegar, 5000.0, 5,junior);
		//Usuario usuarioSenior=new Usuario(empresaDespegar, 8000.0, 3,senior);
		
		Double sueldoPromedioDelGerente=gerente.sueldoPromedio(empresaDespegar, usuarioGerente);
		//Double sueldoPromedioJunior=junior.sueldoPromedio(empresaDespegar, usuarioJunior);
		//Double sueldoPromedioSenior=senior.sueldoPromedio(empresaDespegar, usuarioSenior);
		
		System.out.println("Sueldo promedio del gerente "+gerente.getNombre()+"  : "+sueldoPromedioDelGerente);
		//System.out.println("Sueldo promedio del junior "+junior.getNombre()+"  : "+sueldoPromedioJunior);
		//System.out.println("Sueldo promedio del senior "+senior.getNombre()+"  : "+sueldoPromedioSenior);
		
		//probar lo de cambiar de empresa y mostrar lo del historiAl
		
		//vamos a verificar si al  empleado  SENIOR de DESPEGAR le comvine cambiar de empresa a JHONNYSA
		Empresa empresaJhonny=new Empresa("JhonnySA",4000.0,45);
		
		String empresaAntigua=usuarioGerente.getEmpresa().getNombre();
		
		usuarioGerente.escucharOferta(20000.0, empresaJhonny);
		
		String empresaActual=usuarioGerente.getEmpresa().getNombre();
		
		if(empresaAntigua.equals(empresaActual)){
			System.out.println("Este gerente sigue siendo empleado de despegar");
		}else{
			System.out.println("Este gerente es ahora empleado de JhonnySA");
		}
		
		usuarioGerente.mostrarHistorialDeEmpresasEnLasQueTrabaje();
		
		
		
		
		
	}

}
