public class EndChoreoGenerator extends BodyPart {
  // Variables
  String[] body_parts = {
    "r_leg",
    "l_leg",
    "r_arm",
    "l_arm",
    "head",
    "r_hand",
    "l_hand",
    "r_foot",
    "l_foot",
    "r_elbow",
    "l_elbow",
    "hips",
    "r_knee",
    "l_knee",
    "chest",
    "r_shoulder",
    "l_shoulder"
  };

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
            + body_parts[body_part()]
            + " "
            + body_parts[body_part()]
            + " | Speed: "
            + speed()
            + "/4"
            + "\n";
    response +=
        "Body Parts Together 2: "
            + body_parts[body_part()]
            + " "
            + body_parts[body_part()]
            + " | Speed: "
            + speed()
            + "/4"
            + "\n";

    return response;
  }

  public static void main(String[] args) {
    EndChoreoGenerator ecg1 = new EndChoreoGenerator();
    System.out.println(ecg1.generate());
  }
}
