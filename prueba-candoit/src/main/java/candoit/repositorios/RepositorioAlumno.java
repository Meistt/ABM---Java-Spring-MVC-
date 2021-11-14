package candoit.repositorios;

import candoit.modelo.Alumno;

public interface RepositorioAlumno {
	void guardar(Alumno nuevo);
	
	Alumno buscar(Integer dni);
}
