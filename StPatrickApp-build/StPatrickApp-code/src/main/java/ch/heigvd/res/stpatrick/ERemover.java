package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Created by ALi on 20.03.2017.
 */
public class ERemover implements IStreamProcessor {
    @Override
    public void process(Reader in, Writer out) throws IOException {
        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);
        int c = br.read();
        while (c != -1) {
            if (c != 'e' && c != 'E') {
                bw.write(c);
                c = br.read();
            } else c = br.read();
        }
        bw.flush();
    }
}
