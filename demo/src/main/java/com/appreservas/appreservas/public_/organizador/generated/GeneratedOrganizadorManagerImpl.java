package com.appreservas.appreservas.public_.organizador.generated;

import com.appreservas.appreservas.public_.organizador.Organizador;
import com.appreservas.appreservas.public_.organizador.OrganizadorImpl;
import com.appreservas.appreservas.public_.organizador.OrganizadorManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.appreservas.appreservas.public_.organizador.Organizador} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedOrganizadorManagerImpl 
extends AbstractManager<Organizador> 
implements GeneratedOrganizadorManager {
    
    private final TableIdentifier<Organizador> tableIdentifier;
    
    protected GeneratedOrganizadorManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("appreservas", "public", "organizador");
    }
    
    @Override
    public Organizador create() {
        return new OrganizadorImpl();
    }
    
    @Override
    public TableIdentifier<Organizador> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Organizador>> fields() {
        return OrganizadorManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Organizador>> primaryKeyFields() {
        return Stream.of(
            Organizador.ORGANIZADORID
        );
    }
}