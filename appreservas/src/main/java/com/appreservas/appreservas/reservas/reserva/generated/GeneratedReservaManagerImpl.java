package com.appreservas.appreservas.reservas.reserva.generated;

import com.appreservas.appreservas.reservas.reserva.Reserva;
import com.appreservas.appreservas.reservas.reserva.ReservaImpl;
import com.appreservas.appreservas.reservas.reserva.ReservaManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.appreservas.appreservas.reservas.reserva.Reserva} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedReservaManagerImpl 
extends AbstractManager<Reserva> 
implements GeneratedReservaManager {
    
    private final TableIdentifier<Reserva> tableIdentifier;
    
    protected GeneratedReservaManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("appreservas", "reservas", "reserva");
    }
    
    @Override
    public Reserva create() {
        return new ReservaImpl();
    }
    
    @Override
    public TableIdentifier<Reserva> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Reserva>> fields() {
        return ReservaManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Reserva>> primaryKeyFields() {
        return Stream.of(
            Reserva.RESERVAID
        );
    }
}