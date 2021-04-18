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
		/*for(int i=0; i< fabricantes.size(); i++) {
			
				if (fabricantes.get(i).pais.equals(pa)){
					pa.uso++;
				}
			}*/
	
		}
	
	public int uso() {
		for(int i=0; i< fabricantes.size(); i++) {
			{
				if (fabricantes.get(i).pais.equals(pais)){
					fabricantes.get(i).pais.uso++;
				}
			}
		}
		return pais.uso;
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

	public String fabricaMayorVentas() {
		
	}
}
