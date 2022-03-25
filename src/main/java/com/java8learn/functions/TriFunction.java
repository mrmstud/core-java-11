package com.java8learn.functions;

/**
 * Takes 3 arguments and return 1 obj
 *
 * @param <T>
 * @param <U>
 * @param <V>
 * @param <R>
 */
@FunctionalInterface
public interface TriFunction<T,U, V, R> {
	R apply(T t, U u, V v);
}
