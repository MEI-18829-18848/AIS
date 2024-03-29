package com.appreservas.appreservas.reservas.utilizador.generated;

import com.appreservas.appreservas.reservas.utilizador.Utilizador;
import com.appreservas.appreservas.reservas.utilizador.UtilizadorImpl;
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
 * com.appreservas.appreservas.reservas.utilizador.Utilizador} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedUtilizadorSqlAdapter implements SqlAdapter<Utilizador> {
    
    private final TableIdentifier<Utilizador> tableIdentifier;
    
    protected GeneratedUtilizadorSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("appreservas", "reservas", "utilizador");
    }
    
    protected Utilizador apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setUtilizadorid( getInt(resultSet, 1 + offset))
            .setRole(         resultSet.getString(2 + offset))
            ;
    }
    
    protected UtilizadorImpl createEntity() {
        return new UtilizadorImpl();
    }
    
    @Override
    public TableIdentifier<Utilizador> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Utilizador> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Utilizador> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}