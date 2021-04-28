package mn.generic.event.bug.events;

public class CustomEvent<T> {

  T data;

  public CustomEvent(T data) {
    this.data = data;
  }
}
