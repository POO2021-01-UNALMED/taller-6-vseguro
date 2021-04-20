package vehiculos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Pais {
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private String nombre;
	private Fabricante fabricante;
	public  int uso;
	private static ArrayList usos = new ArrayList();
	
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

	public static Pais paisMasVendedor() {

		int[] contadores = new int[paises.size()];
		for (int i = 0;i< Vehiculo.getVehiculos().size();i++){
			for (int j = 0;j< Pais.getPaises().size();j++) {
				if (Vehiculo.getVehiculos().get(i).getFabricante().getPais().equals(Pais.getPaises().get(j))) {
					contadores[j]+=1;
					break;
				}
			}
		}
		int max = contadores[0]; 
		int indice = 0;
		for(int i=0; i<contadores.length;i++) {
			if (contadores[i]>max) {
				max= contadores[i];
				indice=i;
			}
		}
		return Pais.getPaises().get(indice);
	}
}

