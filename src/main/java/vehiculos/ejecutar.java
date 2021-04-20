package vehiculos;

public class ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pais p = new Pais("Colombia");
		Pais p2 = new Pais("Cojjg");
		Fabricante f = new Fabricante("Renault", p);
		Fabricante f2 = new Fabricante("dfh",p);
		Fabricante f5 = new Fabricante("5",p);
		Fabricante f1 = new Fabricante("dfh",p);
		
		//System.out.println(Pais.paisMasVendedor());
		//System.out.println(p.uso);
		Vehiculo v1= new Vehiculo("AAA",4,78,"eh",23764,23,"gfhg",f5);
		Vehiculo v2= new Vehiculo("AAA",4,78,"eh",23764,23,"gfhg",f2);
		Vehiculo v3= new Vehiculo("AAA",4,78,"eh",23764,23,"gfhg",f5);
		Vehiculo v4= new Vehiculo("AAA",4,78,"eh",23764,23,"gfhg",f2);
		Vehiculo v5= new Vehiculo("AAA",4,78,"eh",23764,23,"gfhg",f5);
		
		Fabricante f7 = Fabricante.fabricaMayorVentas();
		System.out.println(f7.getNombre());*/
		Pais p1 = new Pais("Ecuador");
		Pais p2 = new Pais("USA");
		Pais p3 = new Pais("Canada");
		
		Fabricante f1 = new Fabricante("Renault", p1);
		Fabricante f2 = new Fabricante("Chevrolet", p1);
		Fabricante f3 = new Fabricante("Tesla", p2);
		Fabricante f4 = new Fabricante("Volvo", p3);
		
		new Camion("SS", "Camion premium", 1000, 100, f1, 3);
		new Camion("AA", "Camion", 1000, 100, f1, 3);
		new Automovil("NN", "Mac 100", 820, 20, f1, 4);
		new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		new Automovil("NN", "Mac 100", 820, 20, f2, 4);
		new Camioneta("CC", 5, "Ford", 500, 150, f2, true);
		
		new Camion("SS", "Camion premium", 1000, 100, f3, 3);
		new Camion("AA", "Camion", 1000, 100, f3, 3);
		new Automovil("NN", "Mac 100", 820, 20, f3, 4);
		
		new Camioneta("CC", 5, "Ford", 500, 150, f4, true);
		new Automovil("NN", "Mac 100", 820, 20, f4, 4);
		
		System.out.println(Fabricante.fabricaMayorVentas().getNombre());
		System.out.println(Pais.paisMasVendedor().getNombre());
	}
}
