package com.company.public_.appreservas.public_.sessao.generated;

import com.company.public_.appreservas.public_.evento.Evento;
import com.company.public_.appreservas.public_.sala.Sala;
import com.company.public_.appreservas.public_.sessao.Sessao;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.company.public_.appreservas.public_.sessao.Sessao}-interface representing
 * entities of the {@code sessao}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSessao {
    
    /**
     * This Field corresponds to the {@link Sessao} field that can be obtained
     * using the {@link Sessao#getSessaoid()} method.
     */
    IntField<Sessao, Integer> SESSAOID = IntField.create(
        Identifier.SESSAOID,
        Sessao::getSessaoid,
        Sessao::setSessaoid,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Sessao} field that can be obtained
     * using the {@link Sessao#getEventoid()} method.
     */
    IntForeignKeyField<Sessao, Integer, Evento> EVENTOID = IntForeignKeyField.create(
        Identifier.EVENTOID,
        Sessao::getEventoid,
        Sessao::setEventoid,
        Evento.EVENTOID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Sessao} field that can be obtained
     * using the {@link Sessao#getSalaid()} method.
     */
    IntForeignKeyField<Sessao, Integer, Sala> SALAID = IntForeignKeyField.create(
        Identifier.SALAID,
        Sessao::getSalaid,
        Sessao::setSalaid,
        Sala.SALAID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Sessao} field that can be obtained
     * using the {@link Sessao#getDuracao()} method.
     */
    ComparableField<Sessao, Integer, Integer> DURACAO = ComparableField.create(
        Identifier.DURACAO,
        o -> OptionalUtil.unwrap(o.getDuracao()),
        Sessao::setDuracao,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Sessao} field that can be obtained
     * using the {@link Sessao#getData()} method.
     */
    ComparableField<Sessao, Timestamp, Timestamp> DATA = ComparableField.create(
        Identifier.DATA,
        o -> OptionalUtil.unwrap(o.getData()),
        Sessao::setData,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the sessaoid of this Sessao. The sessaoid field corresponds to
     * the database column appReservas.public.sessao.sessaoid.
     * 
     * @return the sessaoid of this Sessao
     */
    int getSessaoid();
    
    /**
     * Returns the eventoid of this Sessao. The eventoid field corresponds to
     * the database column appReservas.public.sessao.eventoid.
     * 
     * @return the eventoid of this Sessao
     */
    int getEventoid();
    
    /**
     * Returns the salaid of this Sessao. The salaid field corresponds to the
     * database column appReservas.public.sessao.salaid.
     * 
     * @return the salaid of this Sessao
     */
    int getSalaid();
    
    /**
     * Returns the duracao of this Sessao. The duracao field corresponds to the
     * database column appReservas.public.sessao.duracao.
     * 
     * @return the duracao of this Sessao
     */
    OptionalInt getDuracao();
    
    /**
     * Returns the data of this Sessao. The data field corresponds to the
     * database column appReservas.public.sessao.data.
     * 
     * @return the data of this Sessao
     */
    Optional<Timestamp> getData();
    
    /**
     * Sets the sessaoid of this Sessao. The sessaoid field corresponds to the
     * database column appReservas.public.sessao.sessaoid.
     * 
     * @param sessaoid to set of this Sessao
     * @return         this Sessao instance
     */
    Sessao setSessaoid(int sessaoid);
    
    /**
     * Sets the eventoid of this Sessao. The eventoid field corresponds to the
     * database column appReservas.public.sessao.eventoid.
     * 
     * @param eventoid to set of this Sessao
     * @return         this Sessao instance
     */
    Sessao setEventoid(int eventoid);
    
    /**
     * Sets the salaid of this Sessao. The salaid field corresponds to the
     * database column appReservas.public.sessao.salaid.
     * 
     * @param salaid to set of this Sessao
     * @return       this Sessao instance
     */
    Sessao setSalaid(int salaid);
    
    /**
     * Sets the duracao of this Sessao. The duracao field corresponds to the
     * database column appReservas.public.sessao.duracao.
     * 
     * @param duracao to set of this Sessao
     * @return        this Sessao instance
     */
    Sessao setDuracao(Integer duracao);
    
    /**
     * Sets the data of this Sessao. The data field corresponds to the database
     * column appReservas.public.sessao.data.
     * 
     * @param data to set of this Sessao
     * @return     this Sessao instance
     */
    Sessao setData(Timestamp data);
    
    /**
     * Queries the specified manager for the referenced Evento. If no such
     * Evento exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Evento findEventoid(Manager<Evento> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Sala. If no such Sala
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Sala findSalaid(Manager<Sala> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Sessao> {
        
        SESSAOID ("sessaoid"),
        EVENTOID ("eventoid"),
        SALAID   ("salaid"),
        DURACAO  ("duracao"),
        DATA     ("data");
        
        private final String columnId;
        private final TableIdentifier<Sessao> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "appReservas";
        }
        
        @Override
        public String getSchemaId() {
            return "public";
        }
        
        @Override
        public String getTableId() {
            return "sessao";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Sessao> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}