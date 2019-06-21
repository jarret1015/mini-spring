package site.jarret.starter;

import site.jarret.beans.BeanFactory;
import site.jarret.core.ClassScanner;
import site.jarret.web.handle.HandlerManager;
import site.jarret.web.server.TomcatServer;

import java.util.List;

/**
 * @author Jarret
 * @since 2019/06/20 16:49
 */
public class MiniApplication {
    public static void run(Class<?> cls,String[] args) {
        TomcatServer tomcatServer = new TomcatServer(args);
        try {
            tomcatServer.startServer();
            List<Class<?>> classList = ClassScanner.scanClasses(cls.getPackage().getName());
            BeanFactory.initBean(classList);
            HandlerManager.resolveMappingHandler(classList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
