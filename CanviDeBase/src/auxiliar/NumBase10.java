package auxiliar;

public class NumBase10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int num = 10;

	/**
	 * constructor de NumB10. número en base 10
	 * @param num valor del número en base 10
	 * @return
	 */

	public NumBase10(int num) {
		this.num = num;
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
		return String.valueOf(num);
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
		String digits = "00010405484884484HJSJDJSIEMD";
				String cad = "";
		while (num>0) {
			cad = cad+digits.charAt(num%base);
			num = num/base;
		}
		return alReves(cad);
	}

	/**
	 * inverteix una cadena. inverteix l'ordre dels caràcters
	 * @param cad la cadena original
	 * @return la cadena invertida
	 */

	private String alReves(String cad) {
		String reves = "";
		int i = cad.length() -1;
		while (i>=0) {
			reves = reves +cad.charAt(i);
			i--;
		}
		return reves;
	}


/**
 * transforma el número a notació romana
 * 
 * @return la cadena en notació romana
 * @throws ArithmeticException si el número no esta entre el 1 i 9999
 */

	public String canviaARoma() throws ArithmeticException {
        if (num < 1 || num > 9999) {
            throw new ArithmeticException("Sólo para números entre 1 y 9999.");
        }

        String[][] caracters = {
            {"", "", "M", "MM", "MMM"},  // Miles
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},  // Centenas
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},  // Decenas
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}   // Unidades
        };

        String numR = "";
        int[] divisores = {1000, 100, 10, 1};  // Miles, centenas, decenas, unidades

        for (int i = 0; i < 4; i++) {
            int digito = num / divisores[i];
            numR += caracters[i][digito];  // Agrega la representación romana del dígito al resultado
            num %= divisores[i];  // Restamos el valor del dígito procesado
        }

        return numR;
    }
}

