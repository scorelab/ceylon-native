import com.redhat.ceylon.compiler.java.runtime.Main;

public class Run {
    public static void main(String[] args){
        System.out.println("tesing");
        Main.runModule("hello", "1.0.0", "hello.run_");
    }
}
