public class PlainText Implements TxtComponent {
  privte String text;

  public PlainText(String text ) {
    this.text = text;
  }

  @Overrride
  public String getText() {
    return text;
  }
}
