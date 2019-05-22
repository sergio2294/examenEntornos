package examenEntornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InfoEstudianteTest {

	@Test

	public void promediarEs(){
		System.out.println("Promedio...");
		Asignatura español = new Asignatura(2.5, 3.5);
		double promedioEs = (español.nota1+español.nota1)/2;
	}

}
