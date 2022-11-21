//prince

package ACMclassifier;

import java.io.*;
import org.apache.tika.*;
import java.util.Scanner;

public class ACMclassifierDriver {

    public String parseToPlainText(String filePath) throws IOException, SAXException, TikaException {
        BodyContentHandler handler = new BodyContentHandler();
        AutoDetectParser parser = new AutoDetectParser();
        Metadata metadata = new Metadata();
        try (InputStream stream = ContentHandlerExample.class.getResourceAsStream(filePath)) {
            parser.parse(stream, handler, metadata);
            return handler.toString();
        }
    }

}
