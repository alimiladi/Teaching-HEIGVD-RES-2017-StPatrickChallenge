package ch.heigvd.res.stpatrick;

import java.io.Reader;
import java.io.Writer;

/**
 * A class that implements this interface has the responsibility to "decorate" a
 * reader and a writer (to add some sort of functionality to them).
 *
 * @author Olivier Liechti
 */
public interface IStreamDecoratorController {

  /**
   * The client calls this method to ask the class to decorate an existing
   * reader. In other words, the client tells "I have this reader, please add
   * some functionality to it".
   *
   * @param inputReader the existing reader
   * @return the decorated reader
   */
  Reader decorateReader(Reader inputReader);

  /**
   * The client calls this method to ask the class to decorate an existing
   * writer. In other words, the client tells "I have this writer, please add
   * some functionality to it".
   *
   * @param outputWriter the existing writer
   * @return the decorated writer
   */
  Writer decorateWriter(Writer outputWriter);
}
