package com.appreservas.appreservas.public_.lugar.generated;

import com.appreservas.appreservas.public_.lugar.Lugar;
import com.appreservas.appreservas.public_.lugar.LugarImpl;
import com.appreservas.appreservas.public_.lugar.LugarManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.appreservas.appreservas.public_.lugar.Lugar} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedLugarManagerImpl 
extends AbstractManager<Lugar> 
implements GeneratedLugarManager {
    
    private final TableIdentifier<Lugar> tableIdentifier;
    
    protected GeneratedLugarManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("appreservas", "public", "lugar");
    }
    
    @Override
    public Lugar create() {
        return new LugarImpl();
    }
    
    @Override
    public TableIdentifier<Lugar> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Lugar>> fields() {
        return LugarManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Lugar>> primaryKeyFields() {
        return Stream.of(
            Lugar.LUGARID
        );
    }
}