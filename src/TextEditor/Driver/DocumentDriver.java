import Assignment6.FontProperties.Color;
import Assignment6.FontProperties.Font;
import Assignment6.FontProperties.Size;

import java.io.*;

// DocumentDriver.java
public class DocumentDriver {
    public static void main(String[] args)
    {
        Document document = new Document();

        document.addCharacter('H', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter('e', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter('l', Font.CALIBRI, Color.BLUE, Size.FOURTEEN);
        document.addCharacter('l', Font.CALIBRI, Color.BLUE, Size.FOURTEEN);
        document.addCharacter('o', Font.VERDANA, Color.BLACK, Size.SIXTEEN);
        document.addCharacter('W', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter('o', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter('r', Font.VERDANA, Color.BLACK, Size.SIXTEEN);
        document.addCharacter('l', Font.VERDANA, Color.BLACK, Size.SIXTEEN);
        document.addCharacter('d', Font.ARIAL, Color.RED, Size.TWELVE);
        document.addCharacter('C', Font.CALIBRI, Color.BLUE, Size.FOURTEEN);
        document.addCharacter('S', Font.CALIBRI, Color.BLUE, Size.FOURTEEN);
        document.addCharacter('5', Font.VERDANA, Color.BLACK, Size.SIXTEEN);
        document.addCharacter('8', Font.VERDANA, Color.BLACK, Size.SIXTEEN);
        document.addCharacter('0', Font.VERDANA, Color.BLACK, Size.SIXTEEN);

        document.display();

        saveDocument(document);

        document = loadDocument();
        document.display();
    }

    // Save the document to a file
    public static void saveDocument(Document document)
    {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("document.txt")))
        {
            out.writeObject(document);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    // Load the document from a file
    public static Document loadDocument()
    {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("document.txt")))
        {
            return (Document) in.readObject();
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
            return new Document();
        }
    }
}
