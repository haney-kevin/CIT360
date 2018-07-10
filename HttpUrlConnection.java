import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class HttpUrlConnection {
	
public static void main (String[] args) {
		
// This is the url that the program will connect to.
String output = getUrlContents("http://khaneyprojects.com");
		
//This will allow it to print the html file for the url. This is the real output.
System.out.println(output);
		
}
	
private static String getUrlContents(String theUrl) {
		
// This is the try or catch statement to catch an exceptions being thrown. 
StringBuilder content = new StringBuilder();

try {
			
//URL object.
URL url = new URL(theUrl);
			
//URLConnection object
URLConnection urlConnection = url.openConnection();
			
try ( //BufferedReader object.
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
String line;
                        
// Read from the urlconnection through bufferedreader.
while((line = bufferedReader.readLine()) != null) {                 
StringBuilder append = content.append(line).append("\n");
                            
}
}
}
		
catch(IOException e)
		
{
}
		
return content.toString();
}
}