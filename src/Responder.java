/**
 * Procedure<T> を呼び出すクラス。
 * 
 * @param <T>
 */
public class Responder<T> {
    private Procedure<T> procedure;

    public Responder(Procedure<T> procedure) {
        this.procedure = procedure;
    }

    public void execute(T value) {
        procedure.execute(value);
    }
}
