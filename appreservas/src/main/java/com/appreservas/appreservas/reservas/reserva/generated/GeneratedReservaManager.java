package com.appreservas.appreservas.reservas.reserva.generated;

import com.appreservas.appreservas.reservas.reserva.Reserva;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.appreservas.appreservas.reservas.reserva.Reserva} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedReservaManager extends Manager<Reserva> {
    
    TableIdentifier<Reserva> IDENTIFIER = TableIdentifier.of("appreservas", "reservas", "reserva");
    List<Field<Reserva>> FIELDS = unmodifiableList(asList(
        Reserva.RESERVAID,
        Reserva.SESSAOID,
        Reserva.CLIENTEID,
        Reserva.CUSTO
    ));
    
    @Override
    default Class<Reserva> getEntityClass() {
        return Reserva.class;
    }
}