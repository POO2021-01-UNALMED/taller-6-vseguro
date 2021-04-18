package vehiculos;

import java.util.ArrayList;

public class Pais {
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private String nombre;
	private Fabricante fabricante;
	public static int uso;
	
	public Pais(String nombre) {
		this.nombre=nombre;
		paises.add(this);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static ArrayList<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(ArrayList<Pais> paises) {
		Pais.paises = paises;
	}
   

    public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public int paisMasVendedor() {
		for(int i=0; i< Fabricante.getFabricantes().size()-1; i++) {
			for(int j=1; i< Fabricante.getFabricantes().size(); j++) {
			if (Fabricante.getFabricantes().get(i).getPais().equals(Fabricante.getFabricantes().get(i).getPais())){
				Fabricante.getFabricantes().get(i).getPais().uso++;
			
			//return Fabricante.getFabricantes().get(i).getPais().uso;
			
		}
		return Fabricante.getFabricantes().get(i).getPais().uso;
		
	}
	}
	}
}
