package candoit.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import ar.edu.unlam.tallerweb1.SpringTest;
import candoit.modelo.Alumno;
import candoit.repositorios.RepositorioAlumno;
import candoit.servicios.ServicioAlumno;
import candoit.servicios.ServicioAlumnoImpl;

public class AlumnosServicioTest extends SpringTest{
	
	private static final Alumno NUEVO = new Alumno ("Agustin", "Romero", 41716163);
	private RepositorioAlumno repositorioAlumno = mock(RepositorioAlumno.class);
	private ServicioAlumno servicioAlumno = new ServicioAlumnoImpl(repositorioAlumno);
	
	@Test
	public void queExistaUnAlumno() throws Exception {
		givenExisteUnAlumno(NUEVO);
		String nombreAlumno = whenBuscoElAlumnoYExisteLoMuestro(NUEVO);
		assertEquals("Agustin", nombreAlumno); 
	}
	
	private void givenExisteUnAlumno(Alumno nuevo) {
		when(repositorioAlumno.buscar(nuevo.getDni())).thenReturn(nuevo);
	}

	private String whenBuscoElAlumnoYExisteLoMuestro(Alumno nuevo) throws Exception {
		return servicioAlumno.buscarYListar(nuevo);
	}

	

}
