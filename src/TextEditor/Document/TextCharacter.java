import Assignment6.FontProperties.Color;
import Assignment6.FontProperties.Font;
import Assignment6.FontProperties.Size;

public class TextCharacter
{
    private final char m_Character;
    private final CharacterProperties m_CharacterProperties;

    public TextCharacter(char character, Font font, Color color, Size size, FlyweightFactory factory)
    {
        this.m_Character = character;
        this.m_CharacterProperties = factory.getCharacterProperties(font, color, size);
    }

    public void display()
    {
        System.out.println("Character: " + m_Character + ", Font: " + m_CharacterProperties.getFont() + ", Color: " + m_CharacterProperties.getColor() + ", Size: " + m_CharacterProperties.getSize());
    }
}
