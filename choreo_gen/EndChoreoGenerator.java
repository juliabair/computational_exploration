public class EndChoreoGenerator {
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

  // body_part method
  static int body_part() {
    int low = 0;
    int high = 16;
    int place_in_bp_array = low + (int) (Math.random() * ((high - low) + 1));

    return place_in_bp_array;
  }

  public static void main(String[] args) {
    System.out.println("Quadrants: " + quadrants() + " & " + quadrants());
    System.out.println("Focus Out Toward Audience, etc: " + focus());
    System.out.println("Hands on self: " + hands());

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
    System.out.println(
        "Body Parts Together 1: "
            + body_parts[body_part()]
            + " "
            + body_parts[body_part()]
            + " | Speed: "
            + speed()
            + "/4");
    System.out.println(
        "Body Parts Together 2: "
            + body_parts[body_part()]
            + " "
            + body_parts[body_part()]
            + " | Speed: "
            + speed()
            + "/4");
  }
}
