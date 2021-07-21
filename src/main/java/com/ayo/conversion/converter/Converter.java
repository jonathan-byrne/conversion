package com.ayo.conversion.converter;

/**
 * Main contract for converter classes.
 * When using a Converter you can be sure that it contains a convert method
 *
 * @param <T> Type of Item to be converted
 *
 * @Return a converted object without changing the input object to preserve object immutability
 */
public interface Converter<T> {
    public T convert(T item);
}
