package se.splicer;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile
{
    public static void main(String[] args)
    {
        String filePath = ("C://temp//csv.txt");
        File file = new File("C://temp//csv.txt");
 
        //System.out.println( readLineByLineJava8( filePath));
        usingBufferedReader(file);
    }
    
    public static void usingBufferedReader(File file) {
    	System.out.println("Ange ID.");
    	Scanner sc = new Scanner(System.in);
    	String target = sc.nextLine();
    	BufferedReader reader = null;
    	try 
    	{
    	    reader = new BufferedReader(new FileReader(file));
    	    String line;
    	    int count = 0;
    	    
    	    ArrayList<Contact> contactList = new ArrayList<Contact>();
    	    
    	    	    
    	    while ((line = reader.readLine()) != null)
    	    {
    	    	
    	    	//foreach row in file create new contact
    	    	String[] contactProperties = line.split(";",12);
    	    	Contact con  = new  Contact(contactProperties[0], contactProperties[1],contactProperties[2],contactProperties[3],contactProperties[4],contactProperties[5], contactProperties[6], contactProperties[7], contactProperties[8], contactProperties[9],contactProperties[10],contactProperties[11]);
    	    	
    	    	//add it to list
    	    	contactList.add(con);
    	    	    	        
    	    
    	    }
    	    System.out.println("Filen inläst:" + contactList.size() + " element i listan");
    	    
    	    Contact result = null;
    	    
    	    for(Contact contactItem: contactList)
    	    {
    	    	
    	    	String matcher = contactItem.getId();
    	    	if (target.contentEquals(matcher))
    	    	{
    	    		result = contactItem;
    	    		break;
    	    	}

    	    }
    	    
    	    if(result != null)
    	    {
    	    	System.out.println("ID hittades.");
	    		System.out.println("Följande referenser är de som matchar det ID du har angett; \r\n");
	    		System.out.println("ID: " + result.getId() + " / Telefonnumer: " + result.getTelno() + " / Mobil: " + result.getMobil() + " / Namn: " + result.getFNamn() + " " + result.getENamn() + " / Prefix: " + result.getPrefix() + " / Rum: " + result.getRum() + " / Titel: " + result.getTitel() + " / UserID: " + result.getUserid() + " / Orginisation: " + result.getOrginisation() + " / Staioneringsort: " + result.getStationeringsort() + " / E-Mail: " + result.getEmail());

    	    }
    	    else 
    	    {
	    		System.out.println("ID hittades inte.");

	    	}
    	    
    		}
    	    catch (IOException e)
    	    {
    	    	e.printStackTrace();
    	    }
    	    finally
    	    {
    	    	try
    	    	{
    	    		reader.close();
    	    	}
    	    	catch (IOException e)
    	    	{
    	    		e.printStackTrace();
    	    	}
    	    }
    	}
    
    	private static String readLineByLineJava8(String filePath)
    	{
    		/*
		 	* StringBuilder contentBuilder = new StringBuilder();
		 	* 
		 	* 
		 	* try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
		 	* stream.forEach(s -> contentBuilder.append(s)); } catch (IOException e) {
		 	* e.printStackTrace(); } return contentBuilder.toString() ;
		 	*/
    		return  null ;
    	}
}