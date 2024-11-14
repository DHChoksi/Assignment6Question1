import Assignment6.FontProperties.Color;
import Assignment6.FontProperties.Font;
import Assignment6.FontProperties.Size;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory
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
