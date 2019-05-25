
public class Persona implements Comparable {

	private String cif;
	private String nombre;

	public Persona(String cif, String nombre) {
		super();
		this.cif = cif;
		this.nombre = nombre;
	}

	public String getCif() {
		return cif;
	}

	public String getNombre() {
		return nombre;
	}

	public String toString() {
		return "Persona [cif=" + cif + ", nombre=" + nombre + "]";
	}

	public int compareTo(Object o1) {

		Persona p = (Persona) o1;

		return this.nombre.compareTo(p.nombre);
	}
}
