package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import vendedoras.VendedorasPremiadas;

public class TestsVendedoras {

	@Test
	public void pruebaCaso01() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/01_UnaGanadoraEnUnaComparación.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/01_UNaGanadoraEnUnaComparación.out");
		VendedorasPremiadas vendedoras = new VendedorasPremiadas(entrada, salida);
		vendedoras.resolver();
	}

	@Test
	public void pruebaCaso02() throws FileNotFoundException, IOException {
		File entrada = new File(
				"../../Preparación de Prueba/Lote de Prueba/Entrada/02_UnaGanadoraEnMásDeUnaComparación.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/02_UnaGanadoraEnMásDeUnaComparación.out");
		VendedorasPremiadas vendedoras = new VendedorasPremiadas(entrada, salida);
		vendedoras.resolver();
	}

	@Test
	public void pruebaCaso03() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/03_EmpatanAlgunas.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/03_EmpatanAlgunas.out");
		VendedorasPremiadas vendedoras = new VendedorasPremiadas(entrada, salida);
		vendedoras.resolver();
	}

	@Test
	public void pruebaCaso04() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/04_EmpatanTodas.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/04_EmpatanTodas.out");
		VendedorasPremiadas vendedoras = new VendedorasPremiadas(entrada, salida);
		vendedoras.resolver();
	}

	@Test
	public void pruebaCaso05() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/05_NoHayGanadoras.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/05_NoHayGanadoras.out");
		VendedorasPremiadas vendedoras = new VendedorasPremiadas(entrada, salida);
		vendedoras.resolver();
	}

	@Test
	public void pruebaCaso06() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/06_ÚnicaVendedoraGana.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/06_ÚnicaVendedoraGana.out");
		VendedorasPremiadas vendedoras = new VendedorasPremiadas(entrada, salida);
		vendedoras.resolver();
	}

	@Test
	public void pruebaCaso07() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/07_ÚnicaVendedoraNoHaceNVentas.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/07_ÚnicaVendedoraNoHaceNVentas.out");
		VendedorasPremiadas vendedoras = new VendedorasPremiadas(entrada, salida);
		vendedoras.resolver();
	}

	@Test
	public void pruebaCaso08() throws FileNotFoundException, IOException {
		File entrada = new File(
				"../../Preparación de Prueba/Lote de Prueba/Entrada/08_1000VentasConsecutivasConsideradasDeArranque.in");
		File salida = new File(
				"../../Ejecución de Prueba/Salida Producida/08_1000VentasConsecutivasConsideradasDeArranque.out");
		VendedorasPremiadas vendedoras = new VendedorasPremiadas(entrada, salida);
		vendedoras.resolver();
	}

	@Test
	public void pruebaCaso09() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/09_Hasta1000VentasConsecutivas.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/09_Hasta1000VentasConsecutivas.out");
		VendedorasPremiadas vendedoras = new VendedorasPremiadas(entrada, salida);
		vendedoras.resolver();
	}

	@Test
	public void pruebaCaso10() throws FileNotFoundException, IOException {
		File entrada = new File("../../Preparación de Prueba/Lote de Prueba/Entrada/10_MáximaCantidadDeVendedoras.in");
		File salida = new File("../../Ejecución de Prueba/Salida Producida/10_MáximaCantidadDeVendedoras.out");
		VendedorasPremiadas vendedoras = new VendedorasPremiadas(entrada, salida);
		vendedoras.resolver();
	}

}
