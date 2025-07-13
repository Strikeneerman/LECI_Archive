import static java.lang.System.*;
import java.lang.Math;

public class GuessGame {

  private int secretNumber, min, max,n, attempts; // to hold the secret
  //...

  public GuessGame(int min1, int max1) {
	  assert(min1!=max1);
	  assert (min1<max1);
	  this.min=min1;
	  this.max=max1;
	  this.attempts=0;
	  this.secretNumber= (int)(Math.random()*max1)-min1+1;
    //...
  }

  public int min() {
	  return min;
    //...
  }

  public int max() {
	  return max;
    //...
  }

  public boolean validAttempt(int n) {
	  boolean expressao = n>=min;
	  expressao=expressao && n<=max;    //está feito em várias linhas para mostrar melhor o que é
	  return expressao;
    //...
  }

  public boolean finished() {
	  return n==secretNumber;
    //...
  }

  public boolean attemptIsHigher() {
	  return n>secretNumber;
    //...
  }

  public boolean attemptIsLower() {
	  return n<secretNumber;
    //...
  }

  public void play(int n2) {
	  n=n2;
	  assert validAttempt(n);
	  if (attemptIsLower())
	  {
		System.out.print("O numero secreto e maior");
	  }
	  else if (attemptIsHigher())
	  {
		System.out.println("O numero secreto e menor");
	  }
	  attempts++;
    //...
  }

  public int numAttempts() {
	  return attempts;
    //...
  }

  /**
   * Simple tests of the GuessGame class.
   * This method tests the functionality of the GuessGame class.
   * It should be used by the programmer to test and debug the class.
   * It is not meant to be called in client programs.
   *
   * To run from the command line, use:
   *   java -ea GuessGame
   */
  public static void main(String[] args) {
    requireEA();
    out.println("Starting tests.");
    GuessGame game = new GuessGame(1, 10);
    // initial tests:
    assert !game.finished() : "game should not be finished yet";
    assert game.min() == 1;
    assert game.max() == 10;
    assert game.numAttempts() == 0 : "there should be no attempts yet";
    for(int i = -10; i <= 20; i++) {
      assert game.validAttempt(i) == (i >= 1 && i <= 10);
    }
    // trying all wrong answers:
    int nplay = 0; // how may times play was called
    for(int n = 1; n <= 10; n++) {
      if (n != game.secretNumber) {
        game.play(n); // make a wrong guess
        nplay++;
        assert game.numAttempts() == nplay;
        assert !game.finished() : "game should not be finished yet";
        assert (n < game.secretNumber) == game.attemptIsLower();
        assert (n > game.secretNumber) == game.attemptIsHigher();
      }
    }
    // make the right guess:
    game.play(game.secretNumber);
    nplay++;
    assert game.finished() : "game should be finished now";
    assert game.numAttempts() == nplay;
    out.println("No error detected!");
  }

  /** Check if program is being run with -ea, exit if not. */
  static void requireEA() {
    boolean ea = false;
    assert ea = true; // assert with a side-effect, on purpose!
    if (!ea) {
      err.println("This program must be run with -ea!");
      exit(1);
    }
  }

}

