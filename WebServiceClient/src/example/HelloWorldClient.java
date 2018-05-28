package example;

import com.webservice.HelloWorldServiceLocator;
import com.webservice.HelloWorld_PortType;



public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
          HelloWorld_PortType service = locator.getHelloWorld();
          System.out.println(service.sayHelloWorldFrom("hello zhaoxuyan"));
      } catch (javax.xml.rpc.ServiceException | java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }
  }
}
