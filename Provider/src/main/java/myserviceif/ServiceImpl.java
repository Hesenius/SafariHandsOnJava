package myserviceif;

import interesting.MyServiceInterface;

public class ServiceImpl implements MyServiceInterface {
  @Override
  public String getAMessage() {
    return "This is a message from a service";
  }
}
