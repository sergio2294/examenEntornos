/**
Se desea crear una aplicacion para manejar la informacion de un estudiante
Un estudiante tiene: Un codigo, Un nombre, Un sexo, dos Asisgnaturas Asignadas
(cada una de ellas con codigo y dos notas parciales)
Se debe permitir Calcular la nota definitiva de cada asignatura 
si se hace atravez de un primedio calcular la nota promedio del 
semestre es decir la nota que surge al promediar la nota definitiva 
de la asignatura 1  y la asignatura 2
**/

package examenEntornos;


public class Estudiante {
	String codigo;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public Estudiante(String codigo, String nombre, String sexo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	String nombre;
	String sexo;
}
 