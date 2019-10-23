package lesson04_oct18;

public class StringsAreTheSame {

  /**
   * you have to implement your ONW implementation
   * to compare strings
   *
   * you are allowed to use only:
   * - String.length
   * - String.charAt
   * - any operations with primitives
   *
   * @return
   */

  public boolean check(String one, String two) {

    if(one == null  || two == null){
      return false;
    }
    //throw new IllegalArgumentException("must be implemented to pass the tests");




    boolean check = false;
    int j = 0;

    for (int i = 0; i < one.length(); i++) {
      if (one.charAt(i) == two.charAt(i)) {
        j++;
      }
    }
    if (j == one.length() && j ==two.length()) check = true;
    return check;
  }

}
