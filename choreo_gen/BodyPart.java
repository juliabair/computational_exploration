class BodyPart {
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
  
  public String get() {
    int low = 0;
    int high = 16;
    int place_in_bp_array = low + (int) (Math.random() * ((high - low) + 1));

    return body_parts[place_in_bp_array];
  }

  public static void main(String[] args) {
    BodyPart bp = new BodyPart();
    
    System.out.println("Body Part 1: " + bp.get());
    System.out.println("Body Part 2: " + bp.get());
    System.out.println("Body Part 3: " + bp.get());
  }
}
