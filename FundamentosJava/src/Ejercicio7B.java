import java.util.Scanner;

public class Ejercicio7B {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su edad: ");
		byte edadCliente = Byte.valueOf(scanner.nextLine());

		System.out.println("Ingrese el precio: ");
		float precioPantalon = Float.valueOf(scanner.nextLine());

		byte porcentajeDescuento = 0;

		if (edadCliente < 18) {
			porcentajeDescuento = 15;
		} else if (edadCliente > 60) {
			porcentajeDescuento = 30;
		} else {
			System.out.println("No aplica descuento");
		}

		float precioFinal = precioPantalon - precioPantalon
				* porcentajeDescuento / 100;

		System.out.println("El precio final del pantalon es :" + precioFinal);

	}

}
