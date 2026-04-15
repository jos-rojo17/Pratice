package Holamundo.demo.controller;

import Holamundo.demo.modelo.SaludoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")//estandarizamos la ruta de conexión
public class holaMundoController {
    //saludo 1 simple
    @GetMapping("/hola")
    public String hola() {
        return "Hola Mundo de Jose";
    }
    //saludo 2 con parametros
    @GetMapping("/saludo2")
    public String saludo2(@RequestParam(defaultValue = "Jose") String nombre) {
        return "Hola " + nombre;
    }
    //saludo 3 Pedro Ruta y Metodo
    @GetMapping("/pedro")
    public String saludoPedro() {
        return "Hola a todos, mi nombre es Pedro";
    }
    //saludo 4 tipo Json
    @GetMapping("/saludojson") public SaludoResponse saludoJson(@RequestParam(defaultValue = "Erwin") String nombre) {
        String mensaje = "Hola " + nombre + ", ¡bienvenido a la API!";
        return new SaludoResponse(nombre, mensaje);
    }

    //Ruta para la suma
    @GetMapping("/suma")
    public String suma(@RequestParam int a, @RequestParam int b){
        double resultado = a + b;
        return "El resultado de la suma es: " + resultado;
    }
    //El link debería ser: http://localhost:8080/api/suma?a=2&b=2

    @GetMapping("/multiplicacion")
    public String multiplicacion(@RequestParam double a, @RequestParam double b){

        double resultado = a * b;
        System.out.println("EL RESULTADO ES: ");

        return "El resultado es: " + resultado;
    }

}
