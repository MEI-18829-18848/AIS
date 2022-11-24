package com.appreservas.appreservas.reservas.lugar.generated;

import static com.speedment.runtime.core.util.ResultSetUtil.getInt;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.appreservas.appreservas.reservas.lugar.Lugar;
import com.appreservas.appreservas.reservas.lugar.LugarImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

/**
 * The generated Sql Adapter for a {@link
 * com.appreservas.appreservas.reservas.lugar.Lugar} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedLugarSqlAdapter implements SqlAdapter<Lugar> {
    
    private final TableIdentifier<Lugar> tableIdentifier;
    
    protected GeneratedLugarSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("appreservas", "reservas", "lugar");
    }
    
    protected Lugar apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setLugarid(    getInt(resultSet, 1 + offset))
            .setSalaid(     getInt(resultSet, 2 + offset))
            .setNome(       resultSet.getString(3 + offset))
            .setQuantidade( getInt(resultSet, 4 + offset))
            .setValor(      resultSet.getBigDecimal(5 + offset))
            ;
    }
    
    protected LugarImpl createEntity() {
        return new LugarImpl();
    }
    
    @Override
    public TableIdentifier<Lugar> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Lugar> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Lugar> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}