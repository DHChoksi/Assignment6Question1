package TextEditor.Flyweight;

import TextEditor.Flyweight.FontProperties.Color;
import TextEditor.Flyweight.FontProperties.Font;
import TextEditor.Flyweight.FontProperties.Size;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory implements Serializable
{
    private Map<String, CharacterProperties> m_Flyweights = new HashMap<>();

    public CharacterProperties getCharacterProperties(Font font, Color color, Size size)
    {
        String key = font + "-" + color + "-" + size;
        if (!m_Flyweights.containsKey(key))
        {
            m_Flyweights.put(key, new CharacterProperties(font, color, size));
        }
        return m_Flyweights.get(key);
    }
}
