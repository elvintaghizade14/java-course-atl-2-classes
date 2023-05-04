package az.atlacademy.module01.lesson13_p2;

import java.util.Objects;

public final class Result<T> {

    private T data;
    private String className;

    public Result() {
    }

    public Result(T data, String className) {
        this.data = data;
        this.className = className;
    }

    public T getData() {
        return data;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Result<?> result = (Result<?>) o;
        return Objects.equals(data, result.data) && Objects.equals(className, result.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, className);
    }

    @Override
    public String toString() {
        return String.format("Result{data=%s, className='%s'}", data, className);
    }

}
