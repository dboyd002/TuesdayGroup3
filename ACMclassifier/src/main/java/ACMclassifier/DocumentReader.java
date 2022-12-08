package ACMclassifier;
//package org.ea;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.apache.tika.extractor.EmbeddedDocumentExtractor;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BasicContentHandlerFactory;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

import java.io.*;

import java.util.HashMap;
import java.util.Map;

//public class DocumentReader{
//	
//    public static String docParser(String filePath) {
//        try {
//            BasicContentHandlerFactory basicHandlerFactory = new BasicContentHandlerFactory(
//                    BasicContentHandlerFactory.HANDLER_TYPE.XML, -1
//            );
//            AutoDetectParser parser = new AutoDetectParser();
//            ContentHandler handler = basicHandlerFactory.getNewContentHandler();
//            Metadata metadata = new Metadata();
//
//            Tika tika = new Tika();
//            ParseContext context = new ParseContext();
//            context.set(
//                EmbeddedDocumentExtractor.class,
//                new FileEmbeddedDocumentExtractor(tika.getDetector())
//            );
//            context.set(Parser.class, parser);
//
//            File docFile = new File(filePath);
//            InputStream stream = new FileInputStream(docFile);
//            parser.parse(stream, handler, metadata, context);
//
//            return handler.toString();
//        } catch (Exception e) {
//            e.printStackTrace();
//      }// end parseDoc
//        return null;
//
//    }
//    
//}// end class

public class DocumentReader {
	
	//Initialize handler, contexts, and parser
	static BodyContentHandler handler = new BodyContentHandler(-1); //Parameter '-1' allows for unlimited file size
	static Metadata metadata = new Metadata();
	ParseContext parseContext = new ParseContext();
	static FileInputStream inputStream;
	static AutoDetectParser autoDetectParser = new AutoDetectParser();
	
	//Constructor
	public DocumentReader() {
	
		
	}
	
	public static String importFile(String filePath) throws FileNotFoundException {
		
		inputStream = new FileInputStream(new File(filePath));
		
		try {
			
			autoDetectParser.parse(inputStream, handler, metadata);
			return handler.toString();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (TikaException e) {
			e.printStackTrace();
		}
		
		return "The file could not be read";
		
	}
	
}
