package act_1;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Taller {
	
	private HashMap<String, Coche> cochesTaller = new HashMap<>();
	
	
	
	public boolean anadeElemento(String matricula, String color, String marca) {
		boolean anadido = false;
		
		String regex = "^[0-9]{4}[A-Z]{3}$";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(matricula);
		
		if(matcher.matches()) {
			
				if(cochesTaller.containsKey(matricula)) {
					
				
				}
				else {
					cochesTaller.put(matricula, new Coche(color, marca));
					anadido = true;
					
				}
			}	
		return anadido;
	}
	
	public boolean eliminarElemento(String matricula) {
		boolean eliminado = false;
		
		if(cochesTaller.containsKey(matricula)) {
			cochesTaller.remove(matricula);
			eliminado = true;
			
		}
		
		
		return eliminado;
	}
	
	public String visualizaMatriculas() {
		return  "Las matriculas son" + cochesTaller.keySet();
		
		
	}
	
	public String visualizaCoches() {
		return "Los coches son" + cochesTaller.values();
		
	}
	
	public String visualizaTaller() {
		return "El taller tiene" + cochesTaller.entrySet().toString();
		
	}
	
	
}
	
	
	

