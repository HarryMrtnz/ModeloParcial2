import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Conductor c1 = new Conductor("123", "Celestino", "Perez");
		
	Pasajero p1 = new Pasajero ("1", "Norma", "Gimenez", 35, 20.0);
	Pasajero p2 = new Pasajero ("2", "Pedro", "Perez", 35, 20.0);
	Pasajero p3 = new Pasajero ("3", "Lorenzo", "Martinez", 35, 20.0);
	Pasajero p4 = new Pasajero ("4", "Miguel", "Acosta", 35, 20.0);
	Pasajero p5 = new Pasajero ("5", "Marley", "Dorado", 35, 20.0);
	Pasajero p6 = new Pasajero ("6", "Susana", "Cano", 35, 20.0);
	Pasajero p7 = new Pasajero ("7", "Liliana", "Lopez", 35, 20.0);
	Pasajero p8 = new Pasajero ("8", "Roberto", "Garcia", 35, 20.0);
	Pasajero p9 = new Pasajero ("9", "Darel", "Cuevas", 35, 20.0);
	Pasajero p10 = new Pasajero ("10", "Cristian", "Gimenez", 35, 20.0);
	Pasajero p11 = new Pasajero ("11", "Angeles", "Ponce", 35, 20.0);
	Pasajero p12 = new Pasajero ("12", "Juan", "Lallana", 35, 20.0);
	Pasajero p13 = new Pasajero ("13", "Norberto", "Gonzales", 35, 20.0);
	Pasajero p14 = new Pasajero ("14", "Camilo", "Echeverri", 35, 20.0);
	Pasajero p15 = new Pasajero ("15", "Cinthia", "Dante", 35, 20.0);
	Pasajero p16 = new Pasajero ("16", "Lucia", "Garrido", 35, 20.0);
	Pasajero p17 = new Pasajero ("17", "Marcelo", "Gutierrez", 35, 20.0);
	Pasajero p18 = new Pasajero ("18", "Guillermo", "Ruiz", 35, 20.0);
	Pasajero p19 = new Pasajero ("19", "Gabriel", "Reyes", 35, 20.0);
	Pasajero p20 = new Pasajero ("20", "Gamaliel", "Quiroz", 35, 20.0);
	Pasajero p21 = new Pasajero ("21", "Maria", "Esquivel", 35, 20.0);
	Pasajero p22 = new Pasajero ("22", "Fernanda", "Quito", 35, 20.0);
	Pasajero p23 = new Pasajero ("23", "Daniela", "Del Toro", 35, 20.0);
	Pasajero p24 = new Pasajero ("24", "Matias", "Gomez", 35, 20.0);
	Pasajero p25 = new Pasajero ("25", "Martin", "Robles", 35, 20.0);
	Pasajero p26 = new Pasajero ("26", "Lautaro", "Oliva", 35, 20.0);
	Pasajero p27 = new Pasajero ("27", "Lucas", "Naranjo", 35, 20.0);
	Pasajero p28 = new Pasajero ("28", "Valentino", "Casas", 35, 20.0);
	Pasajero p29 = new Pasajero ("29", "Gimena", "Tinelli", 35, 20.0);
	Pasajero p30 = new Pasajero ("30", "Anabella", "Vera", 35, 20.0);
	Pasajero p31 = new Pasajero ("31", "Marlene", "Duran", 35, 20.0);
	Pasajero p32 = new Pasajero ("32", "Ana", "Galeano", 35, 20.0);
	Pasajero p33 = new Pasajero ("33", "Luciana", "Espinola", 35, 20.0);
	Pasajero p34 = new Pasajero ("34", "Santiago", "Cardozo", 35, 20.0);
	Pasajero p35 = new Pasajero ("35", "Yanina", "Torres", 35, 20.0);
	Pasajero p36 = new Pasajero ("36", "Osbaldo", "Rojas", 35, 20.0);
	Pasajero p37 = new Pasajero ("37", "Walter", "Ortiz", 35, 20.0);
	Pasajero p38 = new Pasajero ("38", "Rodrigo", "Caceres", 35, 20.0);
	Pasajero p39 = new Pasajero ("39", "Luciano", "Ayala", 35, 20.0);
	Pasajero p40 = new Pasajero ("40", "Mauricio", "Baez", 35, 20.0);
	Pasajero p41 = new Pasajero ("41", "Fernando", "Ferreira", 35, 20.0);
	Pasajero p42 = new Pasajero ("42", "Damian", "Duarte", 35, 20.0);
	Pasajero p43 = new Pasajero ("43", "Heber", "Cabreira", 35, 20.0);
	Pasajero p44 = new Pasajero ("44", "Nicolas", "Guzman", 35, 20.0);
	Pasajero p45 = new Pasajero ("45", "Sebastian", "Messi", 35, 20.0);
	Pasajero p46 = new Pasajero ("46", "Orlando", "Mercado", 35, 20.0);
	Pasajero p47 = new Pasajero ("47", "Vicente", "Aguilar", 35, 20.0);
	Pasajero p48 = new Pasajero ("48", "Mariano", "Salvador", 35, 20.0);
	Pasajero p49 = new Pasajero ("49", "David", "Tevez", 35, 20.0);
	Pasajero p50 = new Pasajero ("50", "Patricia", "Armani", 35, 20.0);
	Pasajero p51 = new Pasajero ("51", "Guido", "Sanchez", 35, 20.0);
	Pasajero p52 = new Pasajero ("52", "Hernan", "Montes", 35, 20.0);
	Pasajero p53 = new Pasajero ("53", "Julian", "Riquelme", 35, 20.0);
	Pasajero p54 = new Pasajero ("54", "Magali", "Bachor", 35, 20.0);
	Pasajero p55 = new Pasajero ("55", "Diego", "Maravi", 35, 20.0);
	
//	LinkedList<Pasajero> pasajeros= new LinkedList();
//	
//	pasajeros.add(p1);		pasajeros.add(p2);		pasajeros.add(p3);		pasajeros.add(p4);		pasajeros.add(p5);
//	pasajeros.add(p6);		pasajeros.add(p7);		pasajeros.add(p8);		pasajeros.add(p9);		pasajeros.add(p10);
//	pasajeros.add(p11);		pasajeros.add(p12);		pasajeros.add(p13);		pasajeros.add(p14);		pasajeros.add(p15);
//	pasajeros.add(p16);		pasajeros.add(p17);		pasajeros.add(p18);		pasajeros.add(p19);		pasajeros.add(p20);
//	pasajeros.add(p21);		pasajeros.add(p22);		pasajeros.add(p23);		pasajeros.add(p24);		pasajeros.add(p25);
//	pasajeros.add(p26);		pasajeros.add(p27);		pasajeros.add(p28);		pasajeros.add(p29);		pasajeros.add(p30);
//	pasajeros.add(p31);		pasajeros.add(p32);		pasajeros.add(p33);		pasajeros.add(p34);		pasajeros.add(p35);
//	pasajeros.add(p36);		pasajeros.add(p37);		pasajeros.add(p38);		pasajeros.add(p39);		pasajeros.add(p40);
//	pasajeros.add(p41);		pasajeros.add(p42);		pasajeros.add(p43);		pasajeros.add(p44);		pasajeros.add(p45);
//	pasajeros.add(p46);		pasajeros.add(p47);		pasajeros.add(p48);		pasajeros.add(p49);		pasajeros.add(p50);
//	pasajeros.add(p51);		pasajeros.add(p52);		pasajeros.add(p53);		pasajeros.add(p54);		pasajeros.add(p55);

	
	
	}

}
