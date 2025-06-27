public class Generator {
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

  // System.out.println(Arrays.toString(body_parts));

  static int quadrants() {
    int low = 1;
    int high = 4;
    int quad = low + (int) (Math.random() * ((high - low) + 1));
    return quad;
  }

  // fluidity method
  static int fluidity_level() {
    int low = 0;
    int high = 5;
    int fluid = low + (int) (Math.random() * ((high - low) + 1));

    return fluid;
  }

  // body_part method
  static int body_part() {
    int low = 0;
    int high = 16;
    int place_in_bp_array = low + (int) (Math.random() * ((high - low) + 1));

    // return System.out.println(body_parts[place_in_bp_array]);

    // for(int i = 0; i <= body_parts.length; i++){
    //     if(i == place_in_bp_array){
    //         System.out.println(i);
    //         //return(System.out.println(body_parts[i]));
    //     }
    // }

    return place_in_bp_array;
  }

  public static void main(String[] args) {
    System.out.println("Quadrant: " + quadrants());
    System.out.println("Fluidity Level: " + fluidity_level());

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
