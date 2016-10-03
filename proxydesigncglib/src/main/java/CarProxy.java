import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by George.Tantareanu on 10/3/2016.
 */

public class CarProxy implements MethodInterceptor {
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object rst=null;

        System.out.println("Inaintea apelarii " + method);
        rst = proxy.invokeSuper(obj, args);
        System.out.println("Dupa apelare "+method);

        return rst;
    }

    public static void main(String[] args){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Car.class);
        enhancer.setCallback(new CarProxy());
        Car car = (Car) enhancer.create();

        car.startCar();
    }
}
