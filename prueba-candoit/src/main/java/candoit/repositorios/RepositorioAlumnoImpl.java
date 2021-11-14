package candoit.repositorios;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import candoit.modelo.Alumno;

@Repository("repositorioAlumno")
public class RepositorioAlumnoImpl implements RepositorioAlumno{

	private SessionFactory sessionFactory;
	
	@Autowired
    public RepositorioAlumnoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
	
	@Override
	public void guardar(Alumno nuevo) {
		sessionFactory.getCurrentSession().save(nuevo);
	}

	@Override
	public Alumno buscar(Integer dni) {
		
		return null;
	}



}
