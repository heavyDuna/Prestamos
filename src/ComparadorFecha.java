import java.util.Comparator;

public class ComparadorFecha implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Fecha f1 = (Fecha) o1;
		Fecha f2 = (Fecha) o2;

		return f1.compareTo(f2);
	}

}
