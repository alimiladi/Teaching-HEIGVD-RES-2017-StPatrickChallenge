package ch.heigvd.res.stpatrick;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * This interface define the responsibility of reading characters from an input
 * reader, processing them, and writing them to an output writer.

* @author Olivier Liechti (olivier.liechti@heig-vd.ch)
 */
public interface IStreamProcessor {

  /**
   * The client calls this method to process all characters coming from 'in'.
   * 
   * @param in the reader where the characters are read from
   * @param out the writer where the (transformed) characters are written to
   * @throws IOException
   */
  public void process(Reader in, Writer out) throws IOException;
   
}
