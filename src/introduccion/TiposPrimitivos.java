//comentario
package introduccion;

public class TiposPrimitivos {

	public static void main(String... args) {

		int var3, var4, var5, var6 = 8;
		int var1 = 5;
		int var2 = 50;
		byte minumero = 55;
		System.out.println(minumero);

		short v2 = minumero;
		System.out.println(v2);
		int v3 = 77;

		// convierte entero a byte (se pierde información)
		minumero = (byte) v3;

		// caracteres
		char c11 = 82;
		char c12 = 'R';
		if (c11 == c12) {
			System.out.println("son caracteres iguales");
		} else {
			System.out.println("no son iguales");
		}
		System.out.println(c11);
		int entero1 = c11;
		System.out.println(entero1);

		boolean v1 = true;
		boolean v4 = false;
		
		//enteros largos
		long milong= 23423L;

	}
}
