package site.jarret;

import site.jarret.starter.MiniApplication;

/**
 * @author Jarret
 * @since 2019/06/20 15:52
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello Word!");
        MiniApplication.run(Application.class,args);
    }
}
