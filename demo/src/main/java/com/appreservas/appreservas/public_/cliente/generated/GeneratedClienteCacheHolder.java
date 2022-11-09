package com.appreservas.appreservas.public_.cliente.generated;

import com.appreservas.appreservas.public_.cliente.Cliente;
import com.appreservas.appreservas.public_.cliente.ClienteEntityStoreSerializerImpl;
import com.appreservas.appreservas.public_.cliente.ClienteManager;
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
 * ClienteManager}.
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
public final class GeneratedClienteCacheHolder implements EntityStoreHolder<Cliente> {
    
    private final EntityStore<Cliente> entityStore;
    private final OfInt fieldClienteidCache;
    private final OfInt fieldUseridCache;
    private final OfString fieldNomeCache;
    private final OfInt fieldTelemovelCache;
    private final OfString fieldEmailCache;
    private final OfInt fieldNifCache;
    
    public GeneratedClienteCacheHolder(
            EntityStore<Cliente> entityStore,
            OfInt fieldClienteidCache,
            OfInt fieldUseridCache,
            OfString fieldNomeCache,
            OfInt fieldTelemovelCache,
            OfString fieldEmailCache,
            OfInt fieldNifCache) {
        
        this.entityStore         = requireNonNull(entityStore);
        this.fieldClienteidCache = requireNonNull(fieldClienteidCache);
        this.fieldUseridCache    = requireNonNull(fieldUseridCache);
        this.fieldNomeCache      = requireNonNull(fieldNomeCache);
        this.fieldTelemovelCache = requireNonNull(fieldTelemovelCache);
        this.fieldEmailCache     = requireNonNull(fieldEmailCache);
        this.fieldNifCache       = requireNonNull(fieldNifCache);
    }
    
    @Override
    public EntityStore<Cliente> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Cliente> columnId) {
        if (columnId instanceof Cliente.Identifier) {
            final Cliente.Identifier _id = (Cliente.Identifier) columnId;
            switch (_id) {
                case CLIENTEID : return (CACHE) fieldClienteidCache;
                case USERID    : return (CACHE) fieldUseridCache;
                case NOME      : return (CACHE) fieldNomeCache;
                case TELEMOVEL : return (CACHE) fieldTelemovelCache;
                case EMAIL     : return (CACHE) fieldEmailCache;
                case NIF       : return (CACHE) fieldNifCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "clienteid" : return (CACHE) fieldClienteidCache;
                case "userid"    : return (CACHE) fieldUseridCache;
                case "nome"      : return (CACHE) fieldNomeCache;
                case "telemovel" : return (CACHE) fieldTelemovelCache;
                case "email"     : return (CACHE) fieldEmailCache;
                case "nif"       : return (CACHE) fieldNifCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Cliente> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedClienteCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            ClienteEntityStoreSerializerImpl::new,
            TableIdentifier.of("appreservas", "public", "cliente")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Cliente> recycleAndPersist(PersistOperation<Cliente> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Cliente> recycleAndRemove(RemoveOperation<Cliente> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Cliente> recycleAndUpdate(UpdateOperation<Cliente> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Cliente> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Cliente>, FieldCache<?>>>of(
            Tuples.of(Cliente.CLIENTEID,fieldClienteidCache),
            Tuples.of(Cliente.USERID,   fieldUseridCache),
            Tuples.of(Cliente.NOME,     fieldNomeCache),
            Tuples.of(Cliente.TELEMOVEL,fieldTelemovelCache),
            Tuples.of(Cliente.EMAIL,    fieldEmailCache),
            Tuples.of(Cliente.NIF,      fieldNifCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Cliente>> columnIdentifiers = Stream.<HasIdentifier<Cliente>>of(
            Cliente.CLIENTEID,
            Cliente.USERID,
            Cliente.NOME,
            Cliente.TELEMOVEL,
            Cliente.EMAIL,
            Cliente.NIF
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
    
    public static CompletableFuture<GeneratedClienteCacheHolder> reload(CompletableFuture<EntityStore<Cliente>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfInt> fieldClienteidCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Cliente.CLIENTEID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfInt> fieldUseridCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Cliente.USERID, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldNomeCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Cliente.NOME, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldTelemovelCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Cliente.TELEMOVEL, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldEmailCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Cliente.EMAIL, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldNifCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Cliente.NIF, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedClienteCacheHolder(
                    entityStore,
                    fieldClienteidCacheFuture.get(),
                    fieldUseridCacheFuture.get(),
                    fieldNomeCacheFuture.get(),
                    fieldTelemovelCacheFuture.get(),
                    fieldEmailCacheFuture.get(),
                    fieldNifCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldClienteidCache.close();
        fieldUseridCache.close();
        fieldNomeCache.close();
        fieldTelemovelCache.close();
        fieldEmailCache.close();
        fieldNifCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                Cliente.Identifier.CLIENTEID,
                Cliente.Identifier.USERID,
                Cliente.Identifier.NOME,
                Cliente.Identifier.TELEMOVEL,
                Cliente.Identifier.EMAIL,
                Cliente.Identifier.NIF
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}