import java.util.Comparator;

public class ComparadorCifNombre implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		PrestamoCliente p1 = (PrestamoCliente) o1;
		PrestamoCliente p2 = (PrestamoCliente) o2;

		int resp1 = p1.getSolicitante().getCif().compareTo(p2.getSolicitante().getCif());

		int resp2 = p1.getSolicitante().getNombre().compareTo(p2.getSolicitante().getNombre());

		if (resp1 != 0) {
			return resp1;
		} else if (resp2 != 0) {

			return resp2;
		} else {

			return 0;
		}

	}

}
