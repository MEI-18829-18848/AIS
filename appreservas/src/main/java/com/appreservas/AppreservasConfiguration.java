package com.appreservas;

import com.appreservas.generated.GeneratedAppreservasConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * The spring configuration file
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
@Configuration
public class AppreservasConfiguration extends GeneratedAppreservasConfiguration {
    @Autowired
    public Environment env;

    @Value("server.port")
    public String Port;
}