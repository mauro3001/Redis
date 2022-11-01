package mx.com.gm.SpringBootRedis.Domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Estudiante")
public class Estudiante implements Serializable {
    @Id
    private int codigo;
    private String nombre;
    private String email;
    private String carrera;
    private String nivel;

}
