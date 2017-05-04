import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendedorasPremiadas {
	
	static int cantidadVendedoras;
	static int ventasConsecutivas;
	
	static int ganadora;
	static int mayorImporte;
	static int cantidadComparaciones;
	
	static List<Vendedora> vendedoras;
	
	public enum resultado {
		GANADORA, EMPATE, NOGANADORA, ANALIZANDO
	}
	
		
	public static void procesarArchivo(String path) throws FileNotFoundException, IOException {
				
		FileReader file = new FileReader(path);
		Scanner scan = new Scanner(file);
		
		cantidadVendedoras = scan.nextInt();
		
		vendedoras = new ArrayList<Vendedora>();

		for (int numeroVendedora = 0; numeroVendedora < cantidadVendedoras; numeroVendedora++) {
			
			Vendedora vendedora = new Vendedora(scan.nextInt(), numeroVendedora);
						
			for (int venta=0; venta < vendedora.getVentas(); venta++) {
				
				vendedora.setImporteVenta(venta, scan.nextInt());
			}
			
			vendedoras.add(vendedora);
		}
		
		ventasConsecutivas = scan.nextInt();
		
		scan.close();
	}
	
	public static resultado buscarGanadora() {
		
		mayorImporte = 0;
		cantidadComparaciones = 1;
		
		resultado res = resultado.ANALIZANDO;
		
		while (res == resultado.ANALIZANDO) {
			
			for (Vendedora vendedora: vendedoras) {
				
				if (vendedora.compite(ventasConsecutivas)) {
					
					int importe = vendedora.mayorImporteVentasConsecutivas(ventasConsecutivas);
					
					if (importe > mayorImporte) {
						
						mayorImporte = importe;
						ganadora = vendedora.getNumero();
						res = resultado.GANADORA;
					}
					else if (importe == mayorImporte) {
						
						res = resultado.EMPATE;
					}
				}
			}
			
			cantidadComparaciones++;
			
			if (res == resultado.GANADORA) {
				
				return res;
			}
			else if (res == resultado.ANALIZANDO) {
				
				return resultado.NOGANADORA;
			}
			else {
				
				res = resultado.ANALIZANDO;
				ventasConsecutivas++;
				
				if (!ContinuaCompetencia()) {
					
					break;
				}
			}
		}
		
		return resultado.EMPATE;
	}
	
	public static boolean ContinuaCompetencia() {
		
		boolean competencia = false;
		
		for (Vendedora vendedora: vendedoras) {
			
			if (vendedora.compite(ventasConsecutivas)) {
				
				competencia = true;
			}
		}
		
		return competencia;
	}
	
	public static void producirResultado(resultado miResultado, String path) throws FileNotFoundException, IOException {
		
		FileWriter file = new FileWriter(path);
		BufferedWriter buffer = new BufferedWriter(file);
		
		if (miResultado == resultado.GANADORA) {
			
			buffer.write(Integer.toString(ganadora + 1));
			buffer.newLine();
			buffer.write(cantidadComparaciones + " " + mayorImporte);
			salidaGanadora();
		}
		else if (miResultado == resultado.EMPATE) {
			
			buffer.write("No se puede desempatar");
			salidaEmpate();
		}
		else {
			
			buffer.write("No hay ganadoras");
			salidaNoGanadora();
		}
		
		buffer.close();
	}
	
	public static void salidaGanadora() {
		
		System.out.println(ganadora + 1);
		System.out.println(cantidadComparaciones + " " + mayorImporte);
	}
	
	public static void salidaEmpate() {
		
		System.out.println("No se puede desempatar");
	}
	
	public static void salidaNoGanadora() {
		
		System.out.println("No hay ganadoras");
	}
	

	public static void main(String[] args) {
		
		System.out.println("VENDEDORAS PREMIADAS");
		
		System.out.println("Ingrese nombre del archivo (sin extensión):");
		
		Scanner scan = new Scanner(System.in);
		String archivo = scan.nextLine();
		scan.close();
		
		try {
			
			procesarArchivo("../Lote de Prueba/Entrada/" + archivo + ".in");
		}
		catch (IOException e) {

			System.out.println("Problema al abrir el archivo de entrada");
			System.exit(0);
		}
		
		resultado resultado = buscarGanadora();
				
		try {
			
			producirResultado(resultado, "../Lote de Prueba/Salida Producida/" + archivo + ".out");
		} 
		catch (IOException e) {

			System.out.println("Problema al abrir el archivo de texto");
			System.exit(0);
		}
	}
}
