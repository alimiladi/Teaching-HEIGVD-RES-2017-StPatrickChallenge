package ch.heigvd.res.stpatrick;

/**
 * Classes that implement this interfaces are "factories" that produce
 * Stream Processors. When a client needs a Stream Processor, it does not
 * create the instance with the 'new' keyword. Instead, it asks the
 * factory to produce the instance.
 * 
 * @author Olivier Liechti (olivier.liechti@heig-vd.ch)
 */
public interface IStreamProcessorsFactory {

  /**
   * Get the default Stream Processor
   * @return a stream processor
   */
  IStreamProcessor getProcessor();

  /**
   * Get a specific Stream Processor based on its name. If the factory does
   * not know any processor called "name", then it throws an exception.
   * 
   * @param processorName
   * @return a stream processor instance
   */
  IStreamProcessor getProcessor(String processorName) throws UnknownNameException;
}
