package com.appreservas.appreservas.reservas.sessao.generated;

import com.appreservas.appreservas.reservas.sessao.Sessao;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.appreservas.appreservas.reservas.sessao.Sessao} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSessaoManager extends Manager<Sessao> {
    
    TableIdentifier<Sessao> IDENTIFIER = TableIdentifier.of("appreservas", "reservas", "sessao");
    List<Field<Sessao>> FIELDS = unmodifiableList(asList(
        Sessao.SESSAOID,
        Sessao.EVENTOID,
        Sessao.SALAID,
        Sessao.DURACAO,
        Sessao.DATA
    ));
    
    @Override
    default Class<Sessao> getEntityClass() {
        return Sessao.class;
    }
}