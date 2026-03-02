import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Centralized Pattern Storage
        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));

        String word = "OOPS";

        // Display Banner
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPatternMap cp = patternMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}