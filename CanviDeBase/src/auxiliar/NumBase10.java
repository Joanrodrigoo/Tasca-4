package auxiliar;

public class NumBase10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int num;

	/**
	 * constructor de NumB10. número en base 10
	 * @param num valor del número en base 10
	 * @return
	 */

	public int NumB10(int num) {
		this.num = num;
		return num;
	}
	/**
	 * assigna el valor al número
	 * @param num valor a asignar
	 */
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	/**
	 * canvia el número de base. accepta des de base 2 fins a 24.
	 * @param base a la qual es vol cambiar el número
	 * @return cadena que representa el número en la base indicada
	 * @throws ArithmeticException si la base no està entre 2 i 24
	 */
	
	public String cambiaABase(int base) {
		if(base<2|| base>24) {
			throw new ArithmeticException("la base va de 2 a 24");
		}
		String digits = "00010405484884484HJSJDJSIEMD;"
		String cad = "";
		while (num>"O") {
			cad = cad+digits.charAt(num%base);
			num = num/base;
		}
		return alReves(cad);
	}
	
}
