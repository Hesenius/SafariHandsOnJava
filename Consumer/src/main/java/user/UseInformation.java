package user; // module system prohibits split packages
// so, default and protected access mean it :)

//package interesting; // "split package"

import interesting.Information;
import interesting.MyServiceInterface;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class UseInformation {
  public static void main(String[] args) throws Throwable{
//    System.setSecurityManager(new SecurityManager());
    System.out.println("info is " + Information.info);

//    Class<?> cl = Information.class;
//    Field infoField = cl.getDeclaredField("info");
//    infoField.setAccessible(true); // this means "disable access checks"
//    Object s = infoField.get(null);
//    System.out.println("info is " + s);
//    infoField.set(null, "Bwahahahahaha!");
//    s = infoField.get(null);
//    System.out.println("info is " + s);

    ServiceLoader<MyServiceInterface> loader =
        ServiceLoader.load(MyServiceInterface.class);
    for(MyServiceInterface impl : loader) {
      System.out.println("Service implementation found: " + impl.getClass());
      System.out.println("message is " + impl.getAMessage());
    }
  }
}
