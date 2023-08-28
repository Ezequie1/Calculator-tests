package Coursera.studingtests.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/Calculadora")
public class CalculadoraController {

    @Autowired
    public CalculadoraService service;

    @GetMapping("/Soma")
    public ResponseEntity<String> soma(@RequestParam int numeroUm, @RequestParam int numeroDois){

        String resultado = service.soma( numeroUm, numeroDois );

        return ResponseEntity.status(HttpStatus.OK).body( resultado );
    }

    @GetMapping("/Subtracao")
    public ResponseEntity<String> subtracao(@RequestParam int numeroUm, @RequestParam int numeroDois){

        String resultado = service.subtracao( numeroUm, numeroDois );

        return ResponseEntity.status(HttpStatus.OK).body( resultado );
    }

    @GetMapping("/Multiplicacao")
    public ResponseEntity<String> multiplicacao(@RequestParam int numeroUm, @RequestParam int numeroDois){

        String resultado = service.multiplicacao( numeroUm, numeroDois );

        return ResponseEntity.status(HttpStatus.OK).body( resultado );
    }

    @GetMapping("/Divisao")
    public ResponseEntity<String> divisao(@RequestParam int numeroUm, @RequestParam int numeroDois){

        String resultado = service.divisao( numeroUm, numeroDois);

        return ResponseEntity.status(HttpStatus.OK).body( resultado );
    }

}
