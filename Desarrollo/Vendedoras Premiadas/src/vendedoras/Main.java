package vendedoras;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		/*
		generoEntradaCaso08();
		generoEntradaCaso09();
		generoEntradaCaso10();
		*/
		
		try {
			File entrada = new File("entrada.in");
			File salida = new File("salida.out");

			VendedorasPremiadas v = new VendedorasPremiadas(entrada, salida);
			v.resolver();
		} catch (FileNotFoundException e) {
			System.out.println("Error al leer el archivo de entrada entrada.in");
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Error al crear el archivo de salida salida.out");
			e1.printStackTrace();
		}
	}

	public static void generoEntradaCaso08() {
		try {
			FileWriter file = new FileWriter("../../Preparación de Prueba/Lote de Prueba/Entrada/08_1000VentasConsecutivasConsideradasDeArranque.in");
			BufferedWriter buffer = new BufferedWriter(file);
			buffer.write(String.valueOf(2));
			buffer.newLine();
			for (int i = 0; i < 2; i++) {
				buffer.write(String.valueOf(1000));
				buffer.newLine();
				for (int j = 0; j < 1000; j++) {
					buffer.write(String.valueOf(10));
					buffer.newLine();
				}
			}
			buffer.write(String.valueOf(1000));
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void generoEntradaCaso09() {
		try {
			FileWriter file = new FileWriter("../../Preparación de Prueba/Lote de Prueba/Entrada/09_Hasta1000VentasConsecutivas.in");
			BufferedWriter buffer = new BufferedWriter(file);
			buffer.write(String.valueOf(2));
			buffer.newLine();
			for (int i = 0; i < 2; i++) {
				buffer.write(String.valueOf(1000));
				buffer.newLine();
				for (int j = 0; j < 1000; j++) {
					buffer.write(String.valueOf(10));
					buffer.newLine();
				}
			}
			buffer.write(String.valueOf(1));
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void generoEntradaCaso10() {
		try {
			FileWriter file = new FileWriter("../../Preparación de Prueba/Lote de Prueba/Entrada/10_MáximaCantidadDeVendedoras.in");
			BufferedWriter buffer = new BufferedWriter(file);
			buffer.write(String.valueOf(100));
			buffer.newLine();
			for (int i = 0; i < 100; i++) {
				buffer.write(String.valueOf(2));
				buffer.newLine();
				for (int j = 0; j < 2; j++) {
					buffer.write(String.valueOf(10));
					buffer.newLine();
				}
			}
			buffer.write(String.valueOf(1));
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
