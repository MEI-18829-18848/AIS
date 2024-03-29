package com.appreservas.appreservas.reservas.organizador.generated;

import com.appreservas.appreservas.reservas.organizador.Organizador;
import com.appreservas.appreservas.reservas.utilizador.Utilizador;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;

/**
 * The generated base for the {@link
 * com.appreservas.appreservas.reservas.organizador.Organizador}-interface
 * representing entities of the {@code organizador}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedOrganizador {
    
    /**
     * This Field corresponds to the {@link Organizador} field that can be
     * obtained using the {@link Organizador#getOrganizadorid()} method.
     */
    IntField<Organizador, Integer> ORGANIZADORID = DatastoreFields.createIntField(
        Identifier.ORGANIZADORID,
        Organizador::getOrganizadorid,
        Organizador::setOrganizadorid,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Organizador} field that can be
     * obtained using the {@link Organizador#getNome()} method.
     */
    StringField<Organizador, String> NOME = DatastoreFields.createStringField(
        Identifier.NOME,
        Organizador::getNome,
        Organizador::setNome,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Organizador} field that can be
     * obtained using the {@link Organizador#getContacto()} method.
     */
    StringField<Organizador, String> CONTACTO = DatastoreFields.createStringField(
        Identifier.CONTACTO,
        o -> OptionalUtil.unwrap(o.getContacto()),
        Organizador::setContacto,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Organizador} field that can be
     * obtained using the {@link Organizador#getUserid()} method.
     */
    IntForeignKeyField<Organizador, Integer, Utilizador> USERID = DatastoreFields.createIntForeignKeyField(
        Identifier.USERID,
        Organizador::getUserid,
        Organizador::setUserid,
        Utilizador.UTILIZADORID,
        TypeMapper.primitive(),
        false
    );
    
    /**
     * Returns the organizadorid of this Organizador. The organizadorid field
     * corresponds to the database column
     * appreservas.reservas.organizador.organizadorid.
     * 
     * @return the organizadorid of this Organizador
     */
    int getOrganizadorid();
    
    /**
     * Returns the nome of this Organizador. The nome field corresponds to the
     * database column appreservas.reservas.organizador.nome.
     * 
     * @return the nome of this Organizador
     */
    String getNome();
    
    /**
     * Returns the contacto of this Organizador. The contacto field corresponds
     * to the database column appreservas.reservas.organizador.contacto.
     * 
     * @return the contacto of this Organizador
     */
    Optional<String> getContacto();
    
    /**
     * Returns the userid of this Organizador. The userid field corresponds to
     * the database column appreservas.reservas.organizador.userid.
     * 
     * @return the userid of this Organizador
     */
    int getUserid();
    
    /**
     * Sets the organizadorid of this Organizador. The organizadorid field
     * corresponds to the database column
     * appreservas.reservas.organizador.organizadorid.
     * 
     * @param organizadorid to set of this Organizador
     * @return              this Organizador instance
     */
    Organizador setOrganizadorid(int organizadorid);
    
    /**
     * Sets the nome of this Organizador. The nome field corresponds to the
     * database column appreservas.reservas.organizador.nome.
     * 
     * @param nome to set of this Organizador
     * @return     this Organizador instance
     */
    Organizador setNome(String nome);
    
    /**
     * Sets the contacto of this Organizador. The contacto field corresponds to
     * the database column appreservas.reservas.organizador.contacto.
     * 
     * @param contacto to set of this Organizador
     * @return         this Organizador instance
     */
    Organizador setContacto(String contacto);
    
    /**
     * Sets the userid of this Organizador. The userid field corresponds to the
     * database column appreservas.reservas.organizador.userid.
     * 
     * @param userid to set of this Organizador
     * @return       this Organizador instance
     */
    Organizador setUserid(int userid);
    
    /**
     * Queries the specified manager for the referenced Utilizador. If no such
     * Utilizador exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Utilizador findUserid(Manager<Utilizador> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Organizador> {
        
        ORGANIZADORID ("organizadorid"),
        NOME          ("nome"),
        CONTACTO      ("contacto"),
        USERID        ("userid");
        
        private final String columnId;
        private final TableIdentifier<Organizador> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "appreservas";
        }
        
        @Override
        public String getSchemaId() {
            return "reservas";
        }
        
        @Override
        public String getTableId() {
            return "organizador";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Organizador> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}