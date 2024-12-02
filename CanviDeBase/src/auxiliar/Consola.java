package auxiliar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
	/**
	 * llig una enter de de teclat. el procés de lectura es repeteix mentre el valor no siga un enter
	 * @return el número llegit
	 * @throws IOException
	 */
	public static int lligEnter()throws IOException{
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		boolean incorrecte = true;
		do {
			try {
				int valor = Integer.parseInt(lector.readLine());
				return valor;
			} catch (NumberFormatException ex) {
			}
			
		} while (incorrecte);
		return -1;
	}
	/**
	 * llig una cadena de text de teclat.
	 * @return la cadena llegida
	 * @throws IOException
	 */
	
	
	public static String lligText() throws IOException{
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		return lector.readLine();
	}
}
