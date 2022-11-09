package com.appreservas.appreservas.public_.reserva.generated;

import com.appreservas.appreservas.public_.reserva.Reserva;
import com.appreservas.appreservas.public_.reserva.ReservaEntityStoreSerializerImpl;
import com.appreservas.appreservas.public_.reserva.ReservaManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfComparable;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfInt;
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

import java.math.BigDecimal;
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
 * ReservaManager}.
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
public final class GeneratedReservaCacheHolder implements EntityStoreHolder<Reserva> {
    
    private final EntityStore<Reserva> entityStore;
    private final OfInt fieldReservaidCache;
    private final OfInt fieldSessaoidCache;
    private final OfInt fieldClienteidCache;
    private final OfComparable<BigDecimal> fieldCustoCache;
    
    public GeneratedReservaCacheHolder(
            EntityStore<Reserva> entityStore,
            OfInt fieldReservaidCache,
            OfInt fieldSessaoidCache,
            OfInt fieldClienteidCache,
            OfComparable<BigDecimal> fieldCustoCache) {
        
        this.entityStore         = requireNonNull(entityStore);
        this.fieldReservaidCache = requireNonNull(fieldReservaidCache);
        this.fieldSessaoidCache  = requireNonNull(fieldSessaoidCache);
        this.fieldClienteidCache = requireNonNull(fieldClienteidCache);
        this.fieldCustoCache     = requireNonNull(fieldCustoCache);
    }
    
    @Override
    public EntityStore<Reserva> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Reserva> columnId) {
        if (columnId instanceof Reserva.Identifier) {
            final Reserva.Identifier _id = (Reserva.Identifier) columnId;
            switch (_id) {
                case RESERVAID : return (CACHE) fieldReservaidCache;
                case SESSAOID  : return (CACHE) fieldSessaoidCache;
                case CLIENTEID : return (CACHE) fieldClienteidCache;
                case CUSTO     : return (CACHE) fieldCustoCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "reservaid" : return (CACHE) fieldReservaidCache;
                case "sessaoid"  : return (CACHE) fieldSessaoidCache;
                case "clienteid" : return (CACHE) fieldClienteidCache;
                case "custo"     : return (CACHE) fieldCustoCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Reserva> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedReservaCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            ReservaEntityStoreSerializerImpl::new,
            TableIdentifier.of("appreservas", "public", "reserva")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Reserva> recycleAndPersist(PersistOperation<Reserva> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Reserva> recycleAndRemove(RemoveOperation<Reserva> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Reserva> recycleAndUpdate(UpdateOperation<Reserva> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Reserva> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Reserva>, FieldCache<?>>>of(
            Tuples.of(Reserva.RESERVAID,fieldReservaidCache),
            Tuples.of(Reserva.SESSAOID, fieldSessaoidCache),
            Tuples.of(Reserva.CLIENTEID,fieldClienteidCache),
            Tuples.of(Reserva.CUSTO,    fieldCustoCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Reserva>> columnIdentifiers = Stream.<HasIdentifier<Reserva>>of(
            Reserva.RESERVAID,
            Reserva.SESSAOID,
            Reserva.CLIENTEID,
            Reserva.CUSTO
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
    
    public static CompletableFuture<GeneratedReservaCacheHolder> reload(CompletableFuture<EntityStore<Reserva>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfInt> fieldReservaidCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Reserva.RESERVAID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfInt> fieldSessaoidCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Reserva.SESSAOID, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldClienteidCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Reserva.CLIENTEID, 0);
        
        final CompletableFuture<FieldCache.OfComparable<BigDecimal>> fieldCustoCacheFuture =
            DataStoreHolderUtil.buildComparableCache(entityStoreFuture, executor, Reserva.CUSTO, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedReservaCacheHolder(
                    entityStore,
                    fieldReservaidCacheFuture.get(),
                    fieldSessaoidCacheFuture.get(),
                    fieldClienteidCacheFuture.get(),
                    fieldCustoCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldReservaidCache.close();
        fieldSessaoidCache.close();
        fieldClienteidCache.close();
        fieldCustoCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                Reserva.Identifier.RESERVAID,
                Reserva.Identifier.SESSAOID,
                Reserva.Identifier.CLIENTEID,
                Reserva.Identifier.CUSTO
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}