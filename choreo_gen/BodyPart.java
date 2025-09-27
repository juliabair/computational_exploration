abstract class BodyPart {
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


  // body_part method
  static int body_part() {
    int low = 0;
    int high = 16;
    int place_in_bp_array = low + (int) (Math.random() * ((high - low) + 1));

    return place_in_bp_array;
  }

  public static void main(String[] args) {

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
    System.out.println("Body Part 1: " + body_parts[body_part()]);
    System.out.println("Body Part 2: " + body_parts[body_part()]);
    System.out.println("Body Part 3: " + body_parts[body_part()]);
  }
}
