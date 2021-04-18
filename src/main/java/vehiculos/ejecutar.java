package vehiculos;

public class ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pais p = new Pais("Colombia");
		Pais p2 = new Pais("Cojjg");
		Fabricante f = new Fabricante("Renault", p);
		Fabricante f2 = new Fabricante("dfh",p);
		Fabricante f5 = new Fabricante("dfh",p);
		Fabricante f1 = new Fabricante("dfh",p);
		
		System.out.println(Fabricante.getFabricantes().size());
		System.out.println(p.uso);
	}

}
