import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardGame {
    private static final String[] SUITS = {"♥","♠","♣","♦"};

    private static List<Card> buyDeck() {
       List<Card> deck = new ArrayList<>(52);
       for(int i = 0 ;i < 4;i++) {
           String suit = SUITS[i];
           for(int j = 1; j <= 13;j++) {
               int rank = j;
               Card card = new Card(rank,suit);
               deck.add(card);
           }
       }

        return deck;
    }

    private static void swap(List<Card> deck, int i, int j) {
      Card t = deck.get(i);
      deck.set(i,deck.get(j));
      deck.set(j,t);
    }

    private static void shuffle(List<Card> deck) {
      Random random = new Random(20190910);
      for(int i = deck.size()-1; i>0;i--) {
          int r = random.nextInt(i);
          swap(deck,i,r);
      }
    }

    private static void send(List<List<Card>> hands,List<Card> deck,int numPerson,int numCard) {
     for(int k = 0; k<numPerson;k++) {
         hands.add(new ArrayList<>());
     }
     for(int i = 0;i<numCard;i++) {
         for(int j = 0;j<numPerson;j++) {
             Card card = deck.remove(0);
             hands.get(j).add(card);
         }
     }
    }

    private static void play(List<List<Card>> hands) {
        Card card = new Card(1,"♠");
        for(int i =0;i<hands.size();i++) {
            if(hands.get(i).contains(card)) {
                System.out.println("输了");
                return;
            }
        }
    }

    public static void main(String[] args) {
        List<Card> deck = buyDeck();
        System.out.println("刚买的牌：");
        System.out.println(deck);
        shuffle(deck);
        System.out.println("洗过的牌");
        System.out.println(deck);
        System.out.println();

        List<List<Card>> hands = new ArrayList<>();
        send(hands,deck,4,13);
        System.out.println(hands.get(0));
        System.out.println(hands.get(1));
        System.out.println(hands.get(2));
        System.out.println(deck);

        play(hands);
    }

}
