package TextEditor.Document;

import TextEditor.Flyweight.FontProperties.Color;
import TextEditor.Flyweight.FontProperties.Font;
import TextEditor.Flyweight.FontProperties.Size;
import TextEditor.Flyweight.FlyweightFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Document implements Serializable
{
    private List<TextCharacter> m_Characters = new ArrayList<>();
    private FlyweightFactory m_Factory = new FlyweightFactory();

    public void addCharacter(char character, Font font, Color color, Size size)
    {
        TextCharacter textCharacter = new TextCharacter(character, font, color, size, m_Factory);
        m_Characters.add(textCharacter);
    }

    public void display()
    {
        for (TextCharacter character : m_Characters)
        {
            character.display();
        }
    }
}
