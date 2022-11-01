package mx.com.gm.SpringBootRedis.Dao;

import mx.com.gm.SpringBootRedis.Domain.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteDao extends CrudRepository<Estudiante, Long> {
}
