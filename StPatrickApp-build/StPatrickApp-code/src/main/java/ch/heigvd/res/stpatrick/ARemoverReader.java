package ch.heigvd.res.stpatrick;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by ALi on 20.03.2017.
 */
public class ARemoverReader extends Reader {

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        for (int i = off ; i<off+len; i++){
            if(cbuf[i]=='a'||cbuf[i]=='A'){
                i++;
            }
        }
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}
