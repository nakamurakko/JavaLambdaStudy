/**
 * 結果を返さないオペレーション。
 *
 * @param <T>
 */
@FunctionalInterface
public interface Procedure<T> {
    void execute(T value);
}
