package co.functiona_interfaces;

/**
 * @author Mr.Yog
 * @param <T>
 * @param <U>
 * @param <R>
 */
@FunctionalInterface
public interface Bi_Function<T, U, R> {
    R apply(T t, U u);
}
