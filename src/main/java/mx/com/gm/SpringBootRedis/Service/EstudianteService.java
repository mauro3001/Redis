package mx.com.gm.SpringBootRedis.Service;

import mx.com.gm.SpringBootRedis.Domain.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class EstudianteService {
    /*
    **la llave para identificar que tipo de objetos vamos a leer
    */

    public static final String KEY = "Estudiante";
    @Autowired
    private RedisTemplate redisTemplate;

    public Estudiante save(Estudiante estudiante){
        redisTemplate.opsForHash().put(KEY,estudiante.getCodigo(),estudiante);
        return estudiante;
    }

    public List<Estudiante> findAll(){
        return redisTemplate.opsForHash().values(KEY);
    }

}
