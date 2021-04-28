package mn.generic.event.bug.events.listeners;

import io.micronaut.runtime.event.annotation.EventListener;
import javax.inject.Singleton;
import mn.generic.event.bug.Pojos.User;
import mn.generic.event.bug.Service.LoggerService;
import mn.generic.event.bug.events.CustomEvent;

@Singleton
public class BookEventListener {

  private LoggerService loggerService;

  public BookEventListener(LoggerService loggerService) {
    this.loggerService = loggerService;
  }

  @EventListener
  public void onExampleBookEvent(CustomEvent<User> event) {
    this.loggerService.logInfo("Book Event");
  }

}
