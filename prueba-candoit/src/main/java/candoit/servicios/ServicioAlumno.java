package candoit.servicios;

import candoit.modelo.Alumno;

public interface ServicioAlumno {
	void guardar(Alumno nuevo);

	String buscarYListar(Alumno alumno) throws Exception;
}
