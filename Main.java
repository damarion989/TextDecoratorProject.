public class Main {
    public static void main(String[] args) {

        TextComponent plain = new PlainText("Hello World");
        System.out.println("Plain: " + plain.getText());

        TextComponent bold = new BoldDecorator(
                new PlainText("Hello World"));
        System.out.println("Bold: " + bold.getText());

        TextComponent boldItalic = new ItalicDecorator(
                new BoldDecorator(
                        new PlainText("Hello World")));
        System.out.println("Bold and Italic: " + boldItalic.getText());

        TextComponent allDecorators = new UpperCaseDecorator(
                new ItalicDecorator(
                        new BoldDecorator(
                                new PlainText("Hello World"))));
        System.out.println("All Decorators: " + allDecorators.getText());
    }
}
