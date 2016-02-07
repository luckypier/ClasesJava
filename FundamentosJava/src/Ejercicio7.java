import java.util.Scanner;


public class Ejercicio7 {

	public static void main(String[] args) {
		
		byte edadCliente = 80;
		
		float precioPantalon = 120.5f;
		
		byte porcentajeDescuento = 0;
		
		if(edadCliente<18){
			porcentajeDescuento = 15;
		}else if(edadCliente>60){
			porcentajeDescuento = 30;
		}else{
			System.out.println("No aplica descuento");
		}
		
		float precioFinal = precioPantalon - precioPantalon * porcentajeDescuento / 100; 
		
		System.out.println("El precio final del pantalon es :"+precioFinal);
		
		
	}

}
