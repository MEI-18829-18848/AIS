package com.appreservas.appreservas.reservas.utilizador.generated;

import com.appreservas.appreservas.reservas.utilizador.Utilizador;
import com.appreservas.appreservas.reservas.utilizador.UtilizadorImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.function.BiLongToIntFunction;
import com.speedment.common.function.LongToBooleanFunction;
import com.speedment.common.function.LongToByteFunction;
import com.speedment.common.function.LongToCharFunction;
import com.speedment.common.function.LongToFloatFunction;
import com.speedment.common.function.LongToShortFunction;
import com.speedment.enterprise.common.bytebuffercommon.ByteBufferUtil;
import com.speedment.enterprise.datastore.runtime.DataStoreHolder;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStoreComparator;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStoreCompareTo;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStorePredicate;
import com.speedment.enterprise.datastore.runtime.throwable.DeserializationException;
import com.speedment.enterprise.datastore.runtime.throwable.Utf8Exception;
import com.speedment.enterprise.datastore.runtime.util.SerializerUtil;
import com.speedment.enterprise.datastore.runtime.util.Utf8Util;
import com.speedment.runtime.config.identifier.ColumnIdentifier;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

import static java.util.Collections.singletonList;
import static java.util.Objects.requireNonNull;

/**
 * Serializes and deserializes instances of Utilizador.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedUtilizadorEntityStoreSerializerImpl implements EntityStoreSerializer<Utilizador> {
    
    private final LongFunction<ByteBuffer> bufferFinder;
    private final LongToIntFunction offsetFinder;
    private static final int FIELD_UTILIZADORID = 0;
    private static final int ENDPOS_ROLE = 4;
    private static final int VARSIZE_BEGINS = 8;
    
    protected GeneratedUtilizadorEntityStoreSerializerImpl(final LongFunction<ByteBuffer> bufferFinder, final LongToIntFunction offsetFinder) {
        this.bufferFinder = requireNonNull(bufferFinder);
        this.offsetFinder = requireNonNull(offsetFinder);
    }
    
    @Override
    public BiConsumer<ByteBuffer, Utilizador> serializer() {
        return (buffer, entity) -> {
            int varSizePos = 0;
            buffer.putInt(FIELD_UTILIZADORID, entity.getUtilizadorid());
            varSizePos += ByteBufferUtil.putArrayAbsolute(buffer, VARSIZE_BEGINS + varSizePos, entity.getRole().getBytes());
            buffer.putInt(ENDPOS_ROLE, varSizePos);
            buffer.position(0);
            buffer.limit(VARSIZE_BEGINS + varSizePos);
        };
    }
    
    @Override
    public LongConsumer decorator(DataStoreHolder holder) {
        return DO_NOTHING;
    }
    
    @Override
    public LongFunction<Utilizador> deserializer() {
        return ref -> {
            final ByteBuffer buffer = bufferFinder.apply(ref);
            final int offset = offsetFinder.applyAsInt(ref);
            final Utilizador entity = new UtilizadorImpl();
            entity.setUtilizadorid(buffer.getInt(offset + FIELD_UTILIZADORID));
            try {
                entity.setRole(Utf8Util.deserialize(buffer,
                    offset + VARSIZE_BEGINS + 0,
                    offset + VARSIZE_BEGINS + buffer.getInt(offset + ENDPOS_ROLE)
                ));
            } catch (final Utf8Exception ex) {
                final LongToIntFunction sizeOf = sizeOf();
                throw new DeserializationException(buffer, offset, sizeOf.applyAsInt(ref), ex);
            }
            return entity;
        };
    }
    
    @Override
    public Class<?> deserializedType(final ColumnIdentifier<Utilizador> colId) {
        if (colId instanceof Utilizador.Identifier) {
            final Utilizador.Identifier _id = (Utilizador.Identifier) colId;
            switch (_id) {
                case UTILIZADORID : return int.class;
                case ROLE         : return String.class;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "utilizadorid" : return int.class;
                case "role"         : return String.class;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public <FK_ENTITY> LongUnaryOperator finder(final ColumnIdentifier<Utilizador> colId, final ColumnIdentifier<FK_ENTITY> fkColId) {
        return finder(singletonList(colId), singletonList(fkColId));
    }
    
    @Override
    public <FK_ENTITY> LongUnaryOperator finder(final List<ColumnIdentifier<Utilizador>> cols, final List<ColumnIdentifier<FK_ENTITY>> fkCols) {
        throw new UnsupportedOperationException("Utilizador has no foreign references.");
    }
    
    @Override
    public LongUnaryOperator finder(final String fkName) {
        throw new UnsupportedOperationException("Utilizador has no foreign references.");
    }
    
    @Override
    public LongPredicate isNull(final ColumnIdentifier<Utilizador> colId) {
        if (colId instanceof Utilizador.Identifier) {
            final Utilizador.Identifier _id = (Utilizador.Identifier) colId;
            switch (_id) {
                case UTILIZADORID : 
                case ROLE         : return ALWAYS_FALSE;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "utilizadorid" : 
                case "role"         : return ALWAYS_FALSE;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongPredicate isPresent(final ColumnIdentifier<Utilizador> colId) {
        if (colId instanceof Utilizador.Identifier) {
            final Utilizador.Identifier _id = (Utilizador.Identifier) colId;
            switch (_id) {
                case UTILIZADORID : 
                case ROLE         : return ALWAYS_TRUE;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "utilizadorid" : 
                case "role"         : return ALWAYS_TRUE;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongToByteFunction byteDeserializer(final ColumnIdentifier<Utilizador> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type byte.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToShortFunction shortDeserializer(final ColumnIdentifier<Utilizador> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type short.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction intDeserializer(final ColumnIdentifier<Utilizador> colId) {
        if ("utilizadorid".equals(colId.getColumnId())) {
            return ref -> bufferFinder.apply(ref).getInt(offsetFinder.applyAsInt(ref) + FIELD_UTILIZADORID);
        }
        
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type int.", colId.getColumnId())
        );
    }
    
    @Override
    public LongUnaryOperator longDeserializer(final ColumnIdentifier<Utilizador> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type long.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToFloatFunction floatDeserializer(final ColumnIdentifier<Utilizador> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type float.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToDoubleFunction doubleDeserializer(final ColumnIdentifier<Utilizador> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type double.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToCharFunction charDeserializer(final ColumnIdentifier<Utilizador> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type char.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToBooleanFunction booleanDeserializer(final ColumnIdentifier<Utilizador> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type boolean.", colId.getColumnId())
        );
    }
    
    @Override
    public LongFunction<?> objectDeserializer(final ColumnIdentifier<Utilizador> colId) {
        if ("role".equals(colId.getColumnId())) {
            return ref -> {
                final ByteBuffer buffer = bufferFinder.apply(ref);
                final int offset = offsetFinder.applyAsInt(ref);
                try {
                    return Utf8Util.deserialize(buffer,
                        offset + VARSIZE_BEGINS + 0,
                        offset + VARSIZE_BEGINS + buffer.getInt(offset + ENDPOS_ROLE)
                    );
                } catch (final Utf8Exception ex) {
                    final LongToIntFunction sizeOf = sizeOf();
                    throw new DeserializationException(buffer, offset, sizeOf.applyAsInt(ref), ex);
                }
            };
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public BiLongToIntFunction comparator(final ColumnIdentifier<Utilizador> colId) {
        if (colId instanceof Utilizador.Identifier) {
            final Utilizador.Identifier _id = (Utilizador.Identifier) colId;
            switch (_id) {
                case UTILIZADORID : return (aRef, bRef) -> Integer.compare(
                    bufferFinder.apply(aRef).getInt(offsetFinder.applyAsInt(aRef) + FIELD_UTILIZADORID),
                    bufferFinder.apply(bRef).getInt(offsetFinder.applyAsInt(bRef) + FIELD_UTILIZADORID)
                );
                case ROLE         : return (aRef, bRef) -> {
                    final ByteBuffer aBuf = bufferFinder.apply(aRef);
                    final ByteBuffer bBuf = bufferFinder.apply(bRef);
                    final int aOffset = offsetFinder.applyAsInt(aRef);
                    final int bOffset = offsetFinder.applyAsInt(bRef);
                    final int aStarts = aOffset + VARSIZE_BEGINS + 0;
                    final int bStarts = bOffset + VARSIZE_BEGINS + 0;
                    final int aEnds   = aOffset + VARSIZE_BEGINS + aBuf.getInt(aOffset + ENDPOS_ROLE);
                    final int bEnds   = bOffset + VARSIZE_BEGINS + bBuf.getInt(bOffset + ENDPOS_ROLE);
                    return ByteBufferUtil.compare(
                        aBuf, aStarts, aEnds,
                        bBuf, bStarts, bEnds
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "utilizadorid" : return (aRef, bRef) -> Integer.compare(
                    bufferFinder.apply(aRef).getInt(offsetFinder.applyAsInt(aRef) + FIELD_UTILIZADORID),
                    bufferFinder.apply(bRef).getInt(offsetFinder.applyAsInt(bRef) + FIELD_UTILIZADORID)
                );
                case "role"         : return (aRef, bRef) -> {
                    final ByteBuffer aBuf = bufferFinder.apply(aRef);
                    final ByteBuffer bBuf = bufferFinder.apply(bRef);
                    final int aOffset = offsetFinder.applyAsInt(aRef);
                    final int bOffset = offsetFinder.applyAsInt(bRef);
                    final int aStarts = aOffset + VARSIZE_BEGINS + 0;
                    final int bStarts = bOffset + VARSIZE_BEGINS + 0;
                    final int aEnds   = aOffset + VARSIZE_BEGINS + aBuf.getInt(aOffset + ENDPOS_ROLE);
                    final int bEnds   = bOffset + VARSIZE_BEGINS + bBuf.getInt(bOffset + ENDPOS_ROLE);
                    return ByteBufferUtil.compare(
                        aBuf, aStarts, aEnds,
                        bBuf, bStarts, bEnds
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public BiLongToIntFunction comparatorNullsLast(final ColumnIdentifier<Utilizador> colId) {
        if (colId instanceof Utilizador.Identifier) {
            final Utilizador.Identifier _id = (Utilizador.Identifier) colId;
            switch (_id) {
                case UTILIZADORID : return (aRef, bRef) -> Integer.compare(
                    bufferFinder.apply(aRef).getInt(offsetFinder.applyAsInt(aRef) + FIELD_UTILIZADORID),
                    bufferFinder.apply(bRef).getInt(offsetFinder.applyAsInt(bRef) + FIELD_UTILIZADORID)
                );
                case ROLE         : return (aRef, bRef) -> {
                    final ByteBuffer aBuf = bufferFinder.apply(aRef);
                    final ByteBuffer bBuf = bufferFinder.apply(bRef);
                    final int aOffset = offsetFinder.applyAsInt(aRef);
                    final int bOffset = offsetFinder.applyAsInt(bRef);
                    final int aStarts = aOffset + VARSIZE_BEGINS + 0;
                    final int bStarts = bOffset + VARSIZE_BEGINS + 0;
                    final int aEnds   = aOffset + VARSIZE_BEGINS + aBuf.getInt(aOffset + ENDPOS_ROLE);
                    final int bEnds   = bOffset + VARSIZE_BEGINS + bBuf.getInt(bOffset + ENDPOS_ROLE);
                    return ByteBufferUtil.compare(
                        aBuf, aStarts, aEnds,
                        bBuf, bStarts, bEnds
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "utilizadorid" : return (aRef, bRef) -> Integer.compare(
                    bufferFinder.apply(aRef).getInt(offsetFinder.applyAsInt(aRef) + FIELD_UTILIZADORID),
                    bufferFinder.apply(bRef).getInt(offsetFinder.applyAsInt(bRef) + FIELD_UTILIZADORID)
                );
                case "role"         : return (aRef, bRef) -> {
                    final ByteBuffer aBuf = bufferFinder.apply(aRef);
                    final ByteBuffer bBuf = bufferFinder.apply(bRef);
                    final int aOffset = offsetFinder.applyAsInt(aRef);
                    final int bOffset = offsetFinder.applyAsInt(bRef);
                    final int aStarts = aOffset + VARSIZE_BEGINS + 0;
                    final int bStarts = bOffset + VARSIZE_BEGINS + 0;
                    final int aEnds   = aOffset + VARSIZE_BEGINS + aBuf.getInt(aOffset + ENDPOS_ROLE);
                    final int bEnds   = bOffset + VARSIZE_BEGINS + bBuf.getInt(bOffset + ENDPOS_ROLE);
                    return ByteBufferUtil.compare(
                        aBuf, aStarts, aEnds,
                        bBuf, bStarts, bEnds
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongToIntFunction compareToByte(final ColumnIdentifier<Utilizador> colId, final byte value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type byte.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToShort(final ColumnIdentifier<Utilizador> colId, final short value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type short.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToInt(final ColumnIdentifier<Utilizador> colId, final int value) {
        if ("utilizadorid".equals(colId.getColumnId())) {
            {
                final int operand = value;
                return ref -> Integer.compare(
                    bufferFinder.apply(ref).getInt(offsetFinder.applyAsInt(ref) + FIELD_UTILIZADORID),
                    operand
                );
            }
        }
        
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type int.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToLong(final ColumnIdentifier<Utilizador> colId, final long value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type long.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToFloat(final ColumnIdentifier<Utilizador> colId, final float value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type float.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToDouble(final ColumnIdentifier<Utilizador> colId, final double value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type double.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToBoolean(final ColumnIdentifier<Utilizador> colId, final boolean value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type boolean.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToChar(final ColumnIdentifier<Utilizador> colId, final char value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type char.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToObject(final ColumnIdentifier<Utilizador> colId, final Object value) {
        if ("role".equals(colId.getColumnId())) {
            {
                final ByteBuffer tempBuffer = ByteBuffer.wrap(((String) value).getBytes());
                final int tempSize = tempBuffer.capacity();
                return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int offset = offsetFinder.applyAsInt(ref);
                    return ByteBufferUtil.compare(buffer,
                        offset + VARSIZE_BEGINS + 0,
                        offset + VARSIZE_BEGINS + buffer.getInt(offset + ENDPOS_ROLE),
                        tempBuffer, 0, tempSize
                    );
                };
            }
        }
        
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type object.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToNull(final ColumnIdentifier<Utilizador> colId) {
        if (colId instanceof Utilizador.Identifier) {
            final Utilizador.Identifier _id = (Utilizador.Identifier) colId;
            switch (_id) {
                case UTILIZADORID : return ALWAYS_LESS;
                case ROLE         : return ref -> bufferFinder.apply(ref).getInt(offsetFinder.applyAsInt(ref) + ENDPOS_ROLE) < 0 ? 0 : -1;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "utilizadorid" : return ALWAYS_LESS;
                case "role"         : return ref -> bufferFinder.apply(ref).getInt(offsetFinder.applyAsInt(ref) + ENDPOS_ROLE) < 0 ? 0 : -1;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongPredicate newPredicate(final ColumnIdentifier<Utilizador> colId, final EntityStorePredicate predicate) {
        if (colId instanceof Utilizador.Identifier) {
            final Utilizador.Identifier _id = (Utilizador.Identifier) colId;
            switch (_id) {
                case UTILIZADORID : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_UTILIZADORID;
                    return predicate.test(buffer, begins, begins + Integer.BYTES);
                };
                case ROLE         : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    return predicate.test(buffer,
                        rowOffset + VARSIZE_BEGINS,
                        rowOffset + VARSIZE_BEGINS + buffer.getInt(rowOffset + ENDPOS_ROLE)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "utilizadorid" : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_UTILIZADORID;
                    return predicate.test(buffer, begins, begins + Integer.BYTES);
                };
                case "role"         : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    return predicate.test(buffer,
                        rowOffset + VARSIZE_BEGINS,
                        rowOffset + VARSIZE_BEGINS + buffer.getInt(rowOffset + ENDPOS_ROLE)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongToIntFunction newCompareTo(final ColumnIdentifier<Utilizador> colId, final EntityStoreCompareTo compareTo) {
        if (colId instanceof Utilizador.Identifier) {
            final Utilizador.Identifier _id = (Utilizador.Identifier) colId;
            switch (_id) {
                case UTILIZADORID : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_UTILIZADORID;
                    return compareTo.compare(buffer, begins, begins + Integer.BYTES);
                };
                case ROLE         : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    return compareTo.compare(buffer,
                        rowOffset + VARSIZE_BEGINS,
                        rowOffset + VARSIZE_BEGINS + buffer.getInt(rowOffset + ENDPOS_ROLE)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "utilizadorid" : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_UTILIZADORID;
                    return compareTo.compare(buffer, begins, begins + Integer.BYTES);
                };
                case "role"         : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    return compareTo.compare(buffer,
                        rowOffset + VARSIZE_BEGINS,
                        rowOffset + VARSIZE_BEGINS + buffer.getInt(rowOffset + ENDPOS_ROLE)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public BiLongToIntFunction newComparator(final ColumnIdentifier<Utilizador> colId, final EntityStoreComparator comparator) {
        if (colId instanceof Utilizador.Identifier) {
            final Utilizador.Identifier _id = (Utilizador.Identifier) colId;
            switch (_id) {
                case UTILIZADORID : return (aRef, bRef) -> {
                    final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                    final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                    final int aRowOffset = offsetFinder.applyAsInt(aRef);
                    final int bRowOffset = offsetFinder.applyAsInt(bRef);
                    final int aBegins = aRowOffset + FIELD_UTILIZADORID;
                    final int bBegins = bRowOffset + FIELD_UTILIZADORID;
                    return comparator.compare(
                        aBuffer, aBegins, aBegins + Integer.BYTES,
                        bBuffer, bBegins, bBegins + Integer.BYTES
                    );
                };
                case ROLE         : return (aRef, bRef) -> {
                    final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                    final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                    final int aRowOffset = offsetFinder.applyAsInt(aRef);
                    final int bRowOffset = offsetFinder.applyAsInt(bRef);
                    return comparator.compare(
                        aBuffer, aRowOffset + VARSIZE_BEGINS, aRowOffset + VARSIZE_BEGINS + aBuffer.getInt(aRowOffset + ENDPOS_ROLE), 
                        bBuffer, bRowOffset + VARSIZE_BEGINS, bRowOffset + VARSIZE_BEGINS + bBuffer.getInt(bRowOffset + ENDPOS_ROLE)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "utilizadorid" : return (aRef, bRef) -> {
                    final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                    final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                    final int aRowOffset = offsetFinder.applyAsInt(aRef);
                    final int bRowOffset = offsetFinder.applyAsInt(bRef);
                    final int aBegins = aRowOffset + FIELD_UTILIZADORID;
                    final int bBegins = bRowOffset + FIELD_UTILIZADORID;
                    return comparator.compare(
                        aBuffer, aBegins, aBegins + Integer.BYTES,
                        bBuffer, bBegins, bBegins + Integer.BYTES
                    );
                };
                case "role"         : return (aRef, bRef) -> {
                    final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                    final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                    final int aRowOffset = offsetFinder.applyAsInt(aRef);
                    final int bRowOffset = offsetFinder.applyAsInt(bRef);
                    return comparator.compare(
                        aBuffer, aRowOffset + VARSIZE_BEGINS, aRowOffset + VARSIZE_BEGINS + aBuffer.getInt(aRowOffset + ENDPOS_ROLE), 
                        bBuffer, bRowOffset + VARSIZE_BEGINS, bRowOffset + VARSIZE_BEGINS + bBuffer.getInt(bRowOffset + ENDPOS_ROLE)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongToIntFunction sizeOf() {
        return ref -> VARSIZE_BEGINS + Math.abs(bufferFinder.apply(ref).getInt(offsetFinder.applyAsInt(ref) + ENDPOS_ROLE));
    }
}