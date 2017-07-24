package companies;

import java.util.*;
/**
 * http://cf.geekdo-images.com/images/pic1975683_md.jpg
 *
 * You are a merchant trying to build a jewel empire! Starting with nothing but the pack on your back, you aspire to have a business that spans continents!
 *
 * Splendor is a game with 2 kinds of resources:
 * - Tokens, which come in 5 colors
 * - Cards
 *
 * There is no way to exchange between Token colors. i.e. There is no conversion ratio between Black and Blue Tokens.
 *
 * Card each have some associated fields, the first of which we care about is a cost.
 * A Card can cost a certain number of each Token color: e.g. 2 Blue + 1 White.
 */

public class Square {
  private static enum Color {
    BLACK,
    BLUE,
    GREEN,
    RED,
    WHITE
  }

  private static class Card {
    Map<Color, Integer> cost;

    private Card(Map<Color, Integer> cost) {
      this.cost = cost;
    }
  }

  // Given a Card and some representation of how many tokens we have, can we purchase it?
  private static boolean canPurchase(Card card, Map<Color, Integer> tokens) {
    for(Map.Entry<Color, Integer> pair : card.cost.entrySet()) {
      if(tokens.containsKey(pair.getKey())) {
        if(pair.getValue() > tokens.get(pair.getKey())){
          return false;
        }
      }
    }
    
    return true;
  }
  
  private static boolean canPur(Card card, Map<Color, Integer> tokens) {
	  Iterator<Color> it =  card.cost.keySet().iterator();
	  
	  while(it.hasNext()) {
		  Color key = it.next();
		  if(card.cost.get(key) > tokens.get(key)) {
			  return false;
		  }
	  }
	  return true;
  }

  public static void main(String[] args) {
     Card card = new Card(make(0, 0, 0, 0, 3));
     Map<Color, Integer> tokens = make(0, 3, 0, 0, 1);
//    Card card = new Card(new HashMap<>());
//    Map<Color, Integer> tokens = new HashMap<>();
//    
    // Free Card, No Money (zeros)
    // Card costs one, No money
    // cost(1,1,1,1,1) - tokens(2,2,0,2,2) - false
    // cost(1,1,1,1,1) - tokens(2,2,2,2,2) - true
    // adding new color change the make
    // cost(....) - tokens(nothing) - false
    // cost(1,1,1,1,1) - tokens(ac,c,0,2,2) - false
    System.out.println(canPurchase(card, tokens));
    System.out.println(canPur(card, tokens));
  }

  private static Map<Color, Integer> make(int black, int blue, int green, int red, int white) {
    Map<Color, Integer> map = new HashMap<>();
    map.put(Color.BLACK, black);
    map.put(Color.BLUE, blue);
    map.put(Color.GREEN, green);
    map.put(Color.RED, red);
    map.put(Color.WHITE, white);

    return map;
  }
}
