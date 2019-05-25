import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Banco {

	private String nombre;
	private Map prestamos;

	public Banco(String nombre) {

		this.nombre = nombre;
		this.prestamos = new HashMap();
	}

	public void add(SolicitudPrestamo p, Prestable pres) {

		this.prestamos.put(p, pres);

	}

	public int volumenPrestado() {

		int total = 0;

		SolicitudPrestamo sol;
		Prestable pres;
		Set s = this.prestamos.keySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {

			sol = (SolicitudPrestamo) it.next();
			pres = (Prestable) this.prestamos.get(sol);

			total = total + pres.volumenPrestado();
		}
		
		//System.out.println(total);

		return total;

	}

	public String toString() {
		return "Banco [nombre=" + nombre + ", prestamos=" + prestamos.toString() + "]";
	}

}
