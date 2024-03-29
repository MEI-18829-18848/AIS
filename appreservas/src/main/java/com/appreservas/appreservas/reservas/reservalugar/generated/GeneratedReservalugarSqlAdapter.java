package com.appreservas.appreservas.reservas.reservalugar.generated;

import com.appreservas.appreservas.reservas.reservalugar.Reservalugar;
import com.appreservas.appreservas.reservas.reservalugar.ReservalugarImpl;
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
 * com.appreservas.appreservas.reservas.reservalugar.Reservalugar} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedReservalugarSqlAdapter implements SqlAdapter<Reservalugar> {
    
    private final TableIdentifier<Reservalugar> tableIdentifier;
    
    protected GeneratedReservalugarSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("appreservas", "reservas", "reservalugar");
    }
    
    protected Reservalugar apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setReservaid( getInt(resultSet, 1 + offset))
            .setLugarid(   getInt(resultSet, 2 + offset))
            ;
    }
    
    protected ReservalugarImpl createEntity() {
        return new ReservalugarImpl();
    }
    
    @Override
    public TableIdentifier<Reservalugar> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Reservalugar> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Reservalugar> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}