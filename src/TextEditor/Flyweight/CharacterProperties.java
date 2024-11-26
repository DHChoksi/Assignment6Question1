package TextEditor.Flyweight;
import java.io.Serializable;
import TextEditor.Flyweight.FontProperties.Color;
import TextEditor.Flyweight.FontProperties.Font;
import TextEditor.Flyweight.FontProperties.Size;

public class CharacterProperties implements Serializable
{
    private final Font m_Font;
    private final Color m_Color;
    private final Size m_Size;

    public CharacterProperties(Font font, Color color, Size size)
    {
        this.m_Font = font;
        this.m_Color = color;
        this.m_Size = size;
    }

    // Getters
    public Font getFont()
    {
        return m_Font;
    }

    public Color getColor()
    {
        return m_Color;
    }

    public Size getSize()
    {
        return m_Size;
    }
}
