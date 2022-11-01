package mx.com.gm.SpringBootRedis.Service;

import mx.com.gm.SpringBootRedis.Dao.EstudianteDao;
import mx.com.gm.SpringBootRedis.Domain.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.UUID;

@Service
public class EstudianteServiceImpl {
    /*
    **la llave para identificar que tipo de objetos vamos a leer

    private static final String KEY = "Estudiante";

    private RedisTemplate<String, Estudiante> redisTemplate;

    public EstudianteServiceImpl(RedisTemplate<String, Estudiante> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
    private HashOperations hashOperations;

    @Autowired
    private EstudianteDao estudianteDao;

    /*
     **seteamos el objeto de hash operation
     */
    /*
    @PostConstruct
    private void init(){
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public Map<String, Estudiante> listarEstudiantes() {
        return hashOperations.entries(KEY);
    }

    @Override
    public Estudiante guardar(Estudiante estudiante) {
        hashOperations.put(KEY, UUID.randomUUID().toString(), estudiante);
        return estudiante;
    }*/
}
