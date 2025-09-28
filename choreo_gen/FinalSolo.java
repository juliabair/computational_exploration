public class FinalSolo extends Solo {

  BodyPart bodyPart;

  public FinalSolo() {
    bodyPart = new BodyPart();
  }

  static int quadrants() {
    int low = 1;
    int high = 4;
    int quad = low + (int) (Math.random() * ((high - low) + 1));
    return quad;
  }

  static int speed() {
    int low = 1;
    int high = 4;
    int speed = low + (int) (Math.random() * ((high - low) + 1));
    return speed;
  }

  static boolean focus() {
    boolean focus_out = true;
    int low = 1;
    int high = 2;
    int num = low + (int) (Math.random() * ((high - low) + 1));

    if (num == 1) {
      focus_out = true;
    }
    if (num == 2) {
      focus_out = false;
    }

    return focus_out;
  }

  static boolean hands() {
    boolean hands_on_self = true; // or on floor/toward audience, etc.
    int low = 1;
    int high = 2;
    int num = low + (int) (Math.random() * ((high - low) + 1));

    if (num == 1) {
      hands_on_self = true;
    }
    if (num == 2) {
      hands_on_self = false;
    }

    return hands_on_self;
  }

  public String generate() {
    String response = "";

    response += "Quadrants: " + quadrants() + " & " + quadrants() + "\n";
    response += "Focus Out Toward Audience, etc: " + focus() + "\n";
    response += "Hands on self: " + hands() + "\n";

    response +=
        "Body Parts Together 1: "
            + bodyPart.get()
            + " "
            + bodyPart.get()
            + " | Speed: "
            + speed()
            + "/4"
            + "\n";
    response +=
        "Body Parts Together 2: "
            + bodyPart.get()
            + " "
            + bodyPart.get()
            + " | Speed: "
            + speed()
            + "/4"
            + "\n";

    return response;
  }

  public static void main(String[] args) {
    FinalSolo finalSolo = new FinalSolo();
    System.out.println(finalSolo.generate());
  }
}
