package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private static ArrayList<Fabricante> fabricantes=new ArrayList<Fabricante>();
	private String nombre;
	private Pais pais;
	
	
	public Fabricante(String nombre, Pais pa) {
		this.nombre=nombre;
		this.pais=pa;
		fabricantes.add(this);
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	public static ArrayList<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public static void setFabricantes(ArrayList<Fabricante> fabricantes) {
		Fabricante.fabricantes = fabricantes;
	}

	public static Fabricante fabricaMayorVentas() {
		int[] contadores = new int[fabricantes.size()];
		for (int i = 0;i< Vehiculo.getVehiculos().size();i++){
		for (int j = 0;j< Fabricante.getFabricantes().size();j++) {
			if (Vehiculo.getVehiculos().get(i).getFabricante().equals(Fabricante.getFabricantes().get(j))) {
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
		return Fabricante.getFabricantes().get(indice);
	}
}
