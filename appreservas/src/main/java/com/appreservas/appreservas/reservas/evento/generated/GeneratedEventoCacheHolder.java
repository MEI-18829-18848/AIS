package com.appreservas.appreservas.reservas.evento.generated;

import com.appreservas.appreservas.reservas.evento.Evento;
import com.appreservas.appreservas.reservas.evento.EventoEntityStoreSerializerImpl;
import com.appreservas.appreservas.reservas.evento.EventoManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfInt;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfString;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache;
import com.speedment.enterprise.datastore.runtime.fieldcache.MultiFieldCache;
import com.speedment.enterprise.datastore.runtime.statistic.Statistics;
import com.speedment.enterprise.datastore.runtime.util.DataStoreHolderUtil;
import com.speedment.enterprise.datastore.runtime.util.StatisticsUtil;
import com.speedment.runtime.bulk.PersistOperation;
import com.speedment.runtime.bulk.RemoveOperation;
import com.speedment.runtime.bulk.UpdateOperation;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.ColumnLabel;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.StreamSupplierComponent;
import com.speedment.runtime.field.Field;
import com.speedment.runtime.field.trait.HasIdentifier;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

/**
 * A holder class for the various caches that are used to speed up the {@link
 * EventoManager}.
 * 
 * Generated by
 * com.speedment.enterprise.datastore.generator.internal.code.GeneratedEntityCacheHolderTranslator
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public final class GeneratedEventoCacheHolder implements EntityStoreHolder<Evento> {
    
    private final EntityStore<Evento> entityStore;
    private final OfInt fieldEventoidCache;
    private final OfInt fieldSalaidCache;
    private final OfInt fieldOrganizadoridCache;
    private final OfString fieldNomeCache;
    private final OfString fieldDescricaoCache;
    private final OfString fieldCategoriaCache;
    private final OfString fieldImdbidCache;
    
    public GeneratedEventoCacheHolder(
            EntityStore<Evento> entityStore,
            OfInt fieldEventoidCache,
            OfInt fieldSalaidCache,
            OfInt fieldOrganizadoridCache,
            OfString fieldNomeCache,
            OfString fieldDescricaoCache,
            OfString fieldCategoriaCache,
            OfString fieldImdbidCache) {
        
        this.entityStore             = requireNonNull(entityStore);
        this.fieldEventoidCache      = requireNonNull(fieldEventoidCache);
        this.fieldSalaidCache        = requireNonNull(fieldSalaidCache);
        this.fieldOrganizadoridCache = requireNonNull(fieldOrganizadoridCache);
        this.fieldNomeCache          = requireNonNull(fieldNomeCache);
        this.fieldDescricaoCache     = requireNonNull(fieldDescricaoCache);
        this.fieldCategoriaCache     = requireNonNull(fieldCategoriaCache);
        this.fieldImdbidCache        = requireNonNull(fieldImdbidCache);
    }
    
    @Override
    public EntityStore<Evento> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Evento> columnId) {
        if (columnId instanceof Evento.Identifier) {
            final Evento.Identifier _id = (Evento.Identifier) columnId;
            switch (_id) {
                case EVENTOID      : return (CACHE) fieldEventoidCache;
                case SALAID        : return (CACHE) fieldSalaidCache;
                case ORGANIZADORID : return (CACHE) fieldOrganizadoridCache;
                case NOME          : return (CACHE) fieldNomeCache;
                case DESCRICAO     : return (CACHE) fieldDescricaoCache;
                case CATEGORIA     : return (CACHE) fieldCategoriaCache;
                case IMDBID        : return (CACHE) fieldImdbidCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "eventoid"      : return (CACHE) fieldEventoidCache;
                case "salaid"        : return (CACHE) fieldSalaidCache;
                case "organizadorid" : return (CACHE) fieldOrganizadoridCache;
                case "nome"          : return (CACHE) fieldNomeCache;
                case "descricao"     : return (CACHE) fieldDescricaoCache;
                case "categoria"     : return (CACHE) fieldCategoriaCache;
                case "imdbid"        : return (CACHE) fieldImdbidCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Evento> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedEventoCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            EventoEntityStoreSerializerImpl::new,
            TableIdentifier.of("appreservas", "reservas", "evento")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Evento> recycleAndPersist(PersistOperation<Evento> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Evento> recycleAndRemove(RemoveOperation<Evento> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Evento> recycleAndUpdate(UpdateOperation<Evento> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Evento> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Evento>, FieldCache<?>>>of(
            Tuples.of(Evento.EVENTOID,     fieldEventoidCache),
            Tuples.of(Evento.SALAID,       fieldSalaidCache),
            Tuples.of(Evento.ORGANIZADORID,fieldOrganizadoridCache),
            Tuples.of(Evento.NOME,         fieldNomeCache),
            Tuples.of(Evento.DESCRICAO,    fieldDescricaoCache),
            Tuples.of(Evento.CATEGORIA,    fieldCategoriaCache),
            Tuples.of(Evento.IMDBID,       fieldImdbidCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Evento>> columnIdentifiers = Stream.<HasIdentifier<Evento>>of(
            Evento.EVENTOID,
            Evento.SALAID,
            Evento.ORGANIZADORID,
            Evento.NOME,
            Evento.DESCRICAO,
            Evento.CATEGORIA,
            Evento.IMDBID
        )
            .map(HasIdentifier::identifier)
            .collect(toSet());
        return EntityStoreHolder.of(
            entityStore,
            fieldCaches,
            multiFieldCaches,
            columnIdentifiers
        );
    }
    
    public static CompletableFuture<GeneratedEventoCacheHolder> reload(CompletableFuture<EntityStore<Evento>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfInt> fieldEventoidCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Evento.EVENTOID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfInt> fieldSalaidCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Evento.SALAID, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldOrganizadoridCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Evento.ORGANIZADORID, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldNomeCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Evento.NOME, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldDescricaoCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Evento.DESCRICAO, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldCategoriaCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Evento.CATEGORIA, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldImdbidCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Evento.IMDBID, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedEventoCacheHolder(
                    entityStore,
                    fieldEventoidCacheFuture.get(),
                    fieldSalaidCacheFuture.get(),
                    fieldOrganizadoridCacheFuture.get(),
                    fieldNomeCacheFuture.get(),
                    fieldDescricaoCacheFuture.get(),
                    fieldCategoriaCacheFuture.get(),
                    fieldImdbidCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldEventoidCache.close();
        fieldSalaidCache.close();
        fieldOrganizadoridCache.close();
        fieldNomeCache.close();
        fieldDescricaoCache.close();
        fieldCategoriaCache.close();
        fieldImdbidCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                Evento.Identifier.EVENTOID,
                Evento.Identifier.SALAID,
                Evento.Identifier.ORGANIZADORID,
                Evento.Identifier.NOME,
                Evento.Identifier.DESCRICAO,
                Evento.Identifier.CATEGORIA,
                Evento.Identifier.IMDBID
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}