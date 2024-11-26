package TextEditor.Driver;

import TextEditor.Document.Document;
import TextEditor.Flyweight.FontProperties.Color;
import TextEditor.Flyweight.FontProperties.Font;
import TextEditor.Flyweight.FontProperties.Size;

import java.io.*;


public class DocumentDriver
{
    public static void saveDocument(Document document, String filename)
    {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            out.writeObject(document);
            System.out.println("Document saved successfully.");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static Document loadDocument(String filename)
    {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename)))
        {
            Document document = (Document) in.readObject();
            System.out.println("Document loaded successfully.");
            return document;
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args)
    {
        Document document = new Document();
        document.addCharacter('H', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter('e', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter('l', Font.CALIBRI, Color.BLUE, Size.FOURTEEN);
        document.addCharacter('l', Font.CALIBRI, Color.BLUE, Size.FOURTEEN);
        document.addCharacter('o', Font.VERDANA, Color.BLACK, Size.SIXTEEN);
        document.addCharacter(' ', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter('W', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter('o', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter('r', Font.VERDANA, Color.BLACK, Size.SIXTEEN);
        document.addCharacter('l', Font.VERDANA, Color.BLACK, Size.SIXTEEN);
        document.addCharacter('d', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter(' ', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter('C', Font.CALIBRI, Color.BLUE, Size.FOURTEEN);
        document.addCharacter('S', Font.CALIBRI, Color.BLUE, Size.FOURTEEN);
        document.addCharacter('5', Font.VERDANA, Color.BLACK, Size.SIXTEEN);
        document.addCharacter('8', Font.VERDANA, Color.BLACK, Size.SIXTEEN);
        document.addCharacter('0', Font.VERDANA, Color.BLACK, Size.SIXTEEN);

        saveDocument(document, "document.ser");

        Document loadedDocument = loadDocument("document.ser");

        if (loadedDocument != null)
        {
            loadedDocument.display();
        }
    }
}