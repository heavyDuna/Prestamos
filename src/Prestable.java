import java.util.TreeSet;

public interface Prestable {

	public Fecha fechaCancelacion();

	public void pago() throws PrestamoFinalizado;

	public TreeSet solicitantes();

	public int volumenPrestado();

}
