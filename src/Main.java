
public class Main {

	public static void main(String[] args) {

		Fecha f = new Fecha(20, 04);
		Fecha f2 = new Fecha(10, 02);
		Fecha f3 = new Fecha(01, 01);
		Fecha f4 = new Fecha(05, 01);
		Persona p = new Persona("1000", "pepe");
		Persona p2 = new Persona("20", "juanito");
		ComparadorFecha c = new ComparadorFecha();
		ComparadorCifNombre c2 = new ComparadorCifNombre();
		SolicitudPrestamo sol = new SolicitudPrestamo(20,f3 );
		SolicitudPrestamo sol2 = new SolicitudPrestamo(10,f );

		Lista l = new Lista();
		// l.addOrdenadamente(f4, c);
		l.addOrdenadamente(f2, c);
		Lista l2 = new Lista();
		// l2.addOrdenadamente(f3, c);
		l2.addOrdenadamente(f, c);

		// System.out.println(l);
		
		Banco b = new Banco("BBVA");
		

		PrestamoCliente pc = new PrestamoCliente(p, 1200, l, 200, f3);
		PrestamoCliente pc2 = new PrestamoCliente(p2, 1000, l2, 300, f);
		//System.out.println(pc);
		b.add(sol,pc);
		b.add(sol2, pc2);
		System.out.println(b);


		
		//pc.solicitantes();

		PrestamoCooperativa pco = new PrestamoCooperativa("eroski", c2);
		pco.añadir(pc);
		pco.añadir(pc2);

		//System.out.println(pco);
		
		//pco.solicitantes();

		/*try {
			pco.pago();
		} catch (PrestamoFinalizado e) {

			e.printStackTrace();

		}*/

	}

}
