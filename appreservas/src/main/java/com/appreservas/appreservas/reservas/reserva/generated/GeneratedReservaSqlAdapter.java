package com.appreservas.appreservas.reservas.reserva.generated;

import com.appreservas.appreservas.reservas.reserva.Reserva;
import com.appreservas.appreservas.reservas.reserva.ReservaImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.util.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.appreservas.appreservas.reservas.reserva.Reserva} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedReservaSqlAdapter implements SqlAdapter<Reserva> {
    
    private final TableIdentifier<Reserva> tableIdentifier;
    
    protected GeneratedReservaSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("appreservas", "reservas", "reserva");
    }
    
    protected Reserva apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setReservaid( getInt(resultSet, 1 + offset))
            .setSessaoid(  getInt(resultSet, 2 + offset))
            .setClienteid( getInt(resultSet, 3 + offset))
            .setCusto(     resultSet.getBigDecimal(4 + offset))
            ;
    }
    
    protected ReservaImpl createEntity() {
        return new ReservaImpl();
    }
    
    @Override
    public TableIdentifier<Reserva> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Reserva> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Reserva> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}