package candoit.servicios;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import candoit.modelo.Alumno;
import candoit.repositorios.RepositorioAlumno;

@Service("servicioAlumno")
@Transactional
public class ServicioAlumnoImpl implements ServicioAlumno {
	
	
	RepositorioAlumno repositorioAlumno;
	
	@Autowired
	public ServicioAlumnoImpl(RepositorioAlumno repositorioAlumno) {
		this.repositorioAlumno = repositorioAlumno;
	}

	@Override
	public String buscarYListar(Alumno alumno) throws Exception {
		Alumno buscado = repositorioAlumno.buscar(alumno.getDni());
		if(buscado != null) {
			String nombre = buscado.getNombre();
			String apellido = buscado.getApellido();
			return nombre + " " + apellido;
		}
		throw new Exception ("ALUMNO INEXISTENTE");
	}
	
	@Override
	public void guardar(Alumno nuevo) {
		Alumno newAlumno = new Alumno();
		newAlumno.setDni(nuevo.getDni());
		newAlumno.setNombre(nuevo.getNombre());
		newAlumno.setApellido(nuevo.getApellido());
		repositorioAlumno.guardar(newAlumno);
	}




}
