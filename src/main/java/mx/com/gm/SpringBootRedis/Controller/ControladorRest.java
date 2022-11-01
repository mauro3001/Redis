package mx.com.gm.SpringBootRedis.Controller;

import mx.com.gm.SpringBootRedis.Domain.Estudiante;
import mx.com.gm.SpringBootRedis.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/estudiantes")
public class ControladorRest {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping(value = "/lista")
    public List<Estudiante> listarEstudiantes(){
        return estudianteService.findAll();
    }

    @PostMapping(value = "/guardar")
    public void guardar(@RequestBody Estudiante estudiante){
        estudianteService.save(estudiante);
    }
}
