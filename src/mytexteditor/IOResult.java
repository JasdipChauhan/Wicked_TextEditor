package mytexteditor;



/**
 * Created by JasdipC on 2016-06-26.
 */
public class IOResult<T> {

    private T data;
    private boolean ok;


    public IOResult(T data, boolean ok) {
        this.data = data;
        this.ok = ok;
    }

    public boolean isOk() {
        return ok;
    }

    public boolean hasData() {
        return data != null;
    }

    public T getData() {
        return data;
    }
}
