package ch.heigvd.res.stpatrick;


import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

/**
 * 
 * @author Olivier Liechti
 */
public class Application {

  IStreamProcessorsFactory processorsFactory = new StreamProcessorsFactory();
  
  public IStreamProcessorsFactory getStreamProcessorsFactory() {
    return processorsFactory;
  }

  IStreamDecoratorController getStreamDecoratorController() {
    return new StreamDecoratorController();

  }
}
