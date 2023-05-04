package az.atlacademy.module01.lesson13_p2;

public class GenericMethodApp {

    public static void main(String[] args) {
        Result<Integer> result1 = validateAndGet(null);
        System.out.println(result1);

        Result<Float> floatResult = validateAndGet(34F);
        System.out.println(floatResult);

        Result<String> stringResult = validateAndGet("null");
        System.out.println(stringResult);

        Response<String, Integer> elvinResponse = get("Elvin", 24);
        System.out.println(elvinResponse);
    }

    public static <T> Result<T> validateAndGet(T t) {
        if (t == null) {
            return new Result<>();
        }
        return new Result<>(t, t.getClass().getName());
    }

    public static <T, U> Response<T, U> get(T t, U u) {
        return new Response<>(t, u);
    }



}
