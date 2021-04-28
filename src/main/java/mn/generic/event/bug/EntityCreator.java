package mn.generic.event.bug;

import io.micronaut.context.event.ApplicationEventPublisher;
import javax.inject.Singleton;
import mn.generic.event.bug.Pojos.Book;
import mn.generic.event.bug.Pojos.User;
import mn.generic.event.bug.events.CustomEvent;

@Singleton
public class EntityCreator {

  private final ApplicationEventPublisher eventPublisher;

  public EntityCreator(ApplicationEventPublisher eventPublisher) {
    this.eventPublisher = eventPublisher;
  }

  private void publishEvent(User user) {
    this.eventPublisher.publishEvent(new CustomEvent<>(user));
  }

  private void publishEvent(Book book) {
    this.eventPublisher.publishEvent(new CustomEvent<>(book));
  }

  public void createUser() {
    User user = new User("User Name");
    publishEvent(user);
  }

  public void creteBook() {
    Book book = new Book("Book Name");
    publishEvent(book);
  }

}
