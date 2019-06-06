package com.myproject.app;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.myproject.app.Classes.Structure;


/**
 * Hello world!
 *
 */
public class App 
{
	static final Logger logger = Logger.getLogger(Structure.class);
	
    public static void main( String[] args )
    {
    	String jsonString = "{\"firstName\":\" Ilya \",\"lastName\":\" Livshits\",\"age\":25,\"address\":{\"streetAddress\":\" \",\"city\":\" tel aviv \",\"postalCode\":10021},\"phoneNumbers\":[{\"type\":\"mobile\",\"number\":\"+972- 52-8656913\"}]}";
        ObjectMapper mapper = new ObjectMapper();
        
        BasicConfigurator.configure();
        
        PropertyConfigurator.configure("src\\log4j.properties");

    	try {
			Structure mp = mapper.readValue(jsonString, Structure.class);
	        logger.info(mp.toString());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	
        
        
    	System.out.println( "Hello World!" );
    }
}
