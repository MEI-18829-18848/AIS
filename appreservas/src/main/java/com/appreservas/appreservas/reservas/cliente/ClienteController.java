package com.appreservas.appreservas.reservas.cliente;

import com.appreservas.appreservas.reservas.cliente.generated.GeneratedClienteController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * REST controller logic
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
@RestController
@RequestMapping("/cliente")
public class ClienteController extends GeneratedClienteController {
    @GetMapping
    public String Get(){
        return "hello";
    }
}