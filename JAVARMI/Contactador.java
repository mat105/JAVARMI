import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Contactador {
	private String apikey = "d34e7ff512cceea4291f3629809e9b52";
	
	public Contactador(){
	}

	
	public Clima parseXML(String xmlstring){
		Clima clim = null;
		
		try {
			DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			InputSource is = new InputSource();
			
			is.setCharacterStream(new StringReader(xmlstring));
			
			Document doc = db.parse(is);
			
			Element fore = (Element)doc.getElementsByTagName("forecast").item(0);
			
			NodeList timelis = fore.getElementsByTagName("temperature");
			Element elem = (Element)timelis.item(0);
			String temp = elem.getAttribute("value");
			
			timelis = fore.getElementsByTagName("symbol");
			Element elem1 = (Element)timelis.item(0);
			String temp1 = elem1.getAttribute("name");
			
			clim = new Clima( Float.parseFloat(temp) , temp1);
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return clim;
	}
	
	
	public Clima getClimaCacheado(Ciudad ciu){
		if( ciu != null ){ // Cached
			Clima cli = ciu.cacheado();
			if( cli != null ){
				return cli;
			}
		}
		return null;
	}
	
	public Clima getClima(int id){
		Ciudad ciu = Ciudad.buscar(id);
		Clima clim = getClimaCacheado(ciu);
		
		if(clim != null){
			return clim;
		}
		else
		{
			String surl = "http://api.openweathermap.org/data/2.5/forecast/city?mode=xml&id=" + Integer.toString(id) + "&appid=" + apikey;
			try {
				URL where = new URL(surl);
				HttpURLConnection conector = (HttpURLConnection) where.openConnection();
				
				conector.setRequestMethod("GET");
				
				BufferedReader in = new BufferedReader( new InputStreamReader(conector.getInputStream()) );
				
				String resp;
				String xml_resp = "";
				
				while( (resp = in.readLine()) != null ){
					xml_resp += resp;
				}
				
				in.close();
				
				//System.out.println(xml_resp);
				clim = parseXML(xml_resp);
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e){
				e.printStackTrace();
			}
		
			if(ciu!= null){
				ciu.cachear(clim);
			}
			
		}
		
		return clim;
	}
	

}
