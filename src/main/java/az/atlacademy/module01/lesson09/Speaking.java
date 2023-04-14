package az.atlacademy.module01.lesson09;

@FunctionalInterface
public interface Speaking {

    void speak();

    default void speak2(){
        System.out.println("My default method");
    }

}
