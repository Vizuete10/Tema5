package ejercicio01;

public class Hora {
	private int hora;
	private int minuto;

	/**
	 * Construye un objeto con los datos pasados como parámetros. comprobrueba que los valores de entrada son correctos.
	 * @param hora
	 * @param minuto
	 */
	public Hora(int hora, int minuto) {
		if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
			throw new IllegalArgumentException("Hora o minuto no válidos");
		}
		this.hora = hora;
		this.minuto = minuto;
	}

	/**
	 *  Incrementa la hora en un minuto.
	 */
	public void inc() {
		minuto++;
		if (minuto == 60) {
			minuto = 0;
			hora = (hora + 1) % 24;
		}
	}

	/**
	 * Asigna un valor, si es válido, a los minutos.
	 * @param valor
	 * @return Devuelve true o false según haya sido posible modificar los minutos o no.
	 */
	public boolean setMinutos(int valor) {
		if (valor < 0 || valor > 59)
			return false;
		minuto = valor;
		return true;
	}

	/**
	 * Asigna un valor, si está comprendido entre 0 y 23, a la hora. Devuelve true o false según haya sido posible cambiar la hora o no.
	 * @param valor 
	 * @return Devuelve true o false según haya sido posible cambiar la hora o no.
	 */
	public boolean setHora(int valor) {
		if (valor < 0 || valor > 23)
			return false;
		hora = valor;
		return true;
	}

	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minuto=" + minuto + "]";
	}

}
