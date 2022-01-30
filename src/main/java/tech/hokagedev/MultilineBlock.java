
package tech.hokagedev;

/**
 * @author sareaboudousamadou.
 */
public class MultilineBlock {
    public static final String TEXT_MULTILINE_BLOCK = """
    Content of the first line 1
                 Content of the second line 2
        Content of the third line 3
""";

    public static final String TEXTE = """
         
                  {
                          "name": "John Doe",
                          "age": 45,
                          "address": "Doe Street, 23, Java Town"
                        }
            """;

    public static void main(String[] args) {
        System.out.println(TEXT_MULTILINE_BLOCK);
        System.out.println(TEXTE);
    }
}
