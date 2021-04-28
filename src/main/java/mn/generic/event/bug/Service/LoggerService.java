package mn.generic.event.bug.Service;

import javax.inject.Singleton;

@Singleton
public class LoggerService {

  public void logInfo(String data) {
    System.out.println(data);
  }

}
