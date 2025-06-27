import java.util.*;

public class GeneratorAll {
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

  // Method: to decide order of models?
  static ArrayList<String> model_standing_order() {
    ArrayList<String> order = new ArrayList<String>();

    order.add("1");
    order.add("2");
    order.add("3");
    order.add("4");

    Collections.shuffle(order);

    return order;
  }

  // Method: body part & if statements for certain body parts selected
  // Method: body parts
  static int body_part() {
    int low = 0;
    int high = 16;
    int place_in_bp_array = low + (int) (Math.random() * ((high - low) + 1));
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

    return place_in_bp_array;
  }

  static boolean boolean_output_for_bp() {
    boolean bool = true; // or on floor/toward audience, etc.
    int low = 1;
    int high = 2;
    int num = low + (int) (Math.random() * ((high - low) + 1));

    if (num == 1) {
      bool = true;
    }
    if (num == 2) {
      bool = false;
    }
    return bool;
  }

  static int direction() {
    int low = 1;
    int high = 8;
    int dir = low + (int) (Math.random() * ((high - low) + 1));

    /*
     * 1 = forward
     * 2 = R
     * 3 = back
     * 4 = L
     * 5 = R Front Corner
     * 6 = L Front Corner
     * 7 = R Back Corner
     * 8 = L Back Corner
     */

    return dir;
  }

  static int head_direction() {
    int low = 1;
    int high = 9;
    int dir = low + (int) (Math.random() * ((high - low) + 1));

    /*
     * 1 = forward
     * 2 = R
     * 3 = L
     * 4 = Up
     * 5 = Down
     * 6 = Bottom R Corner
     * 7 = Bottom L Corner
     * 8 = Top R Corner
     * 9 = Top L Corner
     */

    return dir;
  }

  // OVERALL STRUCTURE & IDEA
  // How many poses over whole score to generate: 6/dancer
  // How many body parts per pose: 3
  // Body facing which direction per pose: 8 directions (square & corners)
  // Head direction per pose: 9 directions possible front, then square and corners
  // If arm selected, bent? (boolean):
  // If leg selected, bent? (boolean):
  // If hip selected, popped? (boolean):
  // If hand selected, on hip? (boolean):
  // If head selected, tilted? (boolean):
  // If foot selected, beveled? (boolean):
  //
  // Models will not notice when the phone rings, and I am confused as to why only I can hear it

  // Method: Main
  // put body part array here(?)
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

    System.out.println("Model Standing Order: " + model_standing_order());

    System.out.println("Facing Direction: ");
    System.out.println(
        "/*\n"
            + "         * 1 = forward\n"
            + "         * 2 = R\n"
            + "         * 3 = back\n"
            + "         * 4 = L\n"
            + "         * 5 = R Front Corner\n"
            + "         * 6 = L Front Corner\n"
            + "         * 7 = R Back Corner\n"
            + "         * 8 = L Back Corner\n"
            + "         */");

    System.out.println("Head Directions: ");
    System.out.println(
        "/*\n"
            + "         * 1 = forward\n"
            + "         * 2 = R\n"
            + "         * 3 = L\n"
            + "         * 4 = Up\n"
            + "         * 5 = Down\n"
            + "         * 6 = Bottom R Corner\n"
            + "         * 7 = Bottom L Corner\n"
            + "         * 8 = Top R Corner\n"
            + "         * 9 = Top L Corner\n"
            + "         */");

    System.out.println("\nPose:");
    System.out.println(
        "Body Parts: "
            + body_parts[body_part()]
            + " "
            + body_parts[body_part()]
            + " "
            + body_parts[body_part()]);
    System.out.println(
        "Modifier 1: arm, leg, bent? OR Hip popped? OR hand on hip? OR head tilted? OR foot"
            + " beveled? "
            + boolean_output_for_bp());
    System.out.println(
        "Modifier 2: arm, leg, bent? OR Hip popped? OR hand on hip? OR head tilted? OR foot"
            + " beveled? "
            + boolean_output_for_bp());
    System.out.println("Facing: " + direction());
    System.out.println("Head Direction: " + head_direction());
  }
}
