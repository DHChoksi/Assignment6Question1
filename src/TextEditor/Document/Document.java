import Assignment6.FontProperties.Color;
import Assignment6.FontProperties.Font;
import Assignment6.FontProperties.Size;

import java.util.ArrayList;
import java.util.List;

public class Document
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
