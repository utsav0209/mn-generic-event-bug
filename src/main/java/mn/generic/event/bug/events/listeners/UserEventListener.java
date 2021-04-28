package mn.generic.event.bug.events.listeners;

import io.micronaut.runtime.event.annotation.EventListener;
import javax.inject.Singleton;
import mn.generic.event.bug.Pojos.User;
import mn.generic.event.bug.Service.LoggerService;
import mn.generic.event.bug.events.CustomEvent;

@Singleton
public class UserEventListener {

  private LoggerService loggerService;

  public UserEventListener(LoggerService loggerService) {
    this.loggerService = loggerService;
  }

  @EventListener
  public void onUserEvent(CustomEvent<User> event) {
    this.loggerService.logInfo("User Event");
  }

}
