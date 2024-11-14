import Assignment6.FontProperties.Color;
import Assignment6.FontProperties.Font;
import Assignment6.FontProperties.Size;

public class CharacterProperties
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
