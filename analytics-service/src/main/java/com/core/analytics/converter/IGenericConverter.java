package com.core.analytics.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface IGenericConverter<D,E> {
    D toDto(E entity);

    E toEntity(D dto);

    default List<D> toDto(final Collection<E> entities) {
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
