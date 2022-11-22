package ACMclassifier;
//package org.ea;

import org.apache.tika.Tika;
import org.apache.tika.extractor.EmbeddedDocumentExtractor;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BasicContentHandlerFactory;
import org.xml.sax.ContentHandler;

import java.io.*;

public class DocumentReader{
	
    public static String docParser(String filePath) {
        try {
            BasicContentHandlerFactory basicHandlerFactory = new BasicContentHandlerFactory(
                    BasicContentHandlerFactory.HANDLER_TYPE.XML, -1
            );
            AutoDetectParser parser = new AutoDetectParser();
            ContentHandler handler = basicHandlerFactory.getNewContentHandler();
            Metadata metadata = new Metadata();

            Tika tika = new Tika();
            ParseContext context = new ParseContext();
            context.set(
                EmbeddedDocumentExtractor.class,
                new FileEmbeddedDocumentExtractor(tika.getDetector())
            );
            context.set(Parser.class, parser);

            File docFile = new File(filePath);
            InputStream stream = new FileInputStream(docFile);
            parser.parse(stream, handler, metadata, context);

            return handler.toString();
        } catch (Exception e) {
            e.printStackTrace();
      }// end parseDoc
        return null;

    }
    
}// end class
