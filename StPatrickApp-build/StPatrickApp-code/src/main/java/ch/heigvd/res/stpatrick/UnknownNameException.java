package ch.heigvd.res.stpatrick;

/**
 * This exception is thrown by factories, if the specified name is invalid.
 * 
 * @author Olivier Liechti
 */
class UnknownNameException extends Exception {

    public UnknownNameException(String message) {
      super(message);
    }
}
