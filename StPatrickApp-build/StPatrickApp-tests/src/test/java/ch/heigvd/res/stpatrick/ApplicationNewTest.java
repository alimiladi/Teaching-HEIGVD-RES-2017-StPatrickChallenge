package ch.heigvd.res.stpatrick;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Olivier Liechti
 */
public class ApplicationNewTest {

  String input = "We are going to have an unbelievable, perhaps record-setting turnout for the inauguration, and there will be plenty of movie and entertainment stars. All the dress shops are sold out in Washington. It’s hard to find a great dress for this inauguration.";

  @Test
  public void itShouldBePossibleToGetRemoveCharacterAFromAStream() throws IOException {
    Application application = new Application();
    IStreamProcessorsFactory factory = application.getStreamProcessorsFactory();
    IStreamProcessor processor = factory.getProcessor();
    StringReader inputReader = new StringReader(input);
    StringWriter outputWriter = new StringWriter();
    IStreamDecoratorController controller = application.getStreamDecoratorController();
    Reader decoratedReader = controller.decorateReader(inputReader);
    Writer decoratedWriter = controller.decorateWriter(outputWriter);
    try {
      processor.process(decoratedReader, decoratedWriter);
      String output = outputWriter.toString();
      assertEquals(-1, output.indexOf('a'));
      assertEquals(-1, output.indexOf('A'));
    } catch (IOException e) {
      throw e;
    }
  }

}
