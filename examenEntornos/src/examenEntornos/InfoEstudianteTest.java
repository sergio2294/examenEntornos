package examenEntornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InfoEstudianteTest {

	@Test

	public void promediarEs(){
		System.out.println("Promedio...");
		Asignatura espa�ol = new Asignatura(2.5, 3.5);
		double promedioEs = (espa�ol.nota1+espa�ol.nota1)/2;
	}

}
