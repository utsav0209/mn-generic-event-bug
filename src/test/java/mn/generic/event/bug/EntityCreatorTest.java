package mn.generic.event.bug;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import javax.inject.Inject;
import mn.generic.event.bug.Service.LoggerService;
import org.junit.jupiter.api.Test;

@MicronautTest
class EntityCreatorTest {

  @Inject
  EntityCreator entityCreator;

  LoggerService loggerService;

  @MockBean(LoggerService.class)
  public LoggerService mockLoggerService() {
    LoggerService loggerService =  mock(LoggerService.class);
    doNothing().when(loggerService).logInfo(anyString());
    this.loggerService = loggerService;
    return loggerService;
  }

  @Test
  void test_event_calls() {
    entityCreator.createUser();
    verify(loggerService, times(1)).logInfo("User Event");
    // NOTE: This event should not have been called but it gets invoked
    verify(loggerService, times(0)).logInfo("Book Event");
  }

}
