package Poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerGame {
    // 把四种花色放在 这个数组中准备好
    public static final String[] suits = {"♥","♦","♣","♠"};
    public static final String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    private static List<Card> buyPoker() {
        List<Card> poker = new ArrayList<>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                poker.add(new Card(suits[i],rank[j]));
            }
        }
        poker.add(new Card("","big Joker"));
        poker.add(new Card("","small Joker"));
        return poker;
    }

    private static void shuffle(List<Card> poker) {
        Random random = new Random();
        for (int i = poker.size() - 1; i > 0 ; i--) {
            int pos = random.nextInt(i);
            swap(poker,i,pos);
        }
    }

    // 可变对象，不用返回，可以修改到 List
    private static void swap(List<Card> poker, int i, int pos) {
        Card tmp = poker.get(i);
        poker.set(i,poker.get(pos));
        poker.set(pos,tmp);
    }


    public static void main(String[] args) {
        // 1.创建一副牌
        List<Card> poker = buyPoker();

        // 2.洗牌
        shuffle(poker);
//        System.out.println(poker);

        // 3.发牌
        // 三个玩家，每个人手中发五张牌
//        List<Card> player1 = new ArrayList<>();
//        List<Card> player2 = new ArrayList<>();
//        List<Card> player3 = new ArrayList<>();
        // 可以把上面三个人放到一个 List 中
        // plays 类型仍然是 List, 泛型参数是 List<Card>
        // 每个元素就是一个 List<Card>
        List<List<Card>> players = new ArrayList<>();
        // 每次 add 的元素都是一个 ArrayList<Card> 类型
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                // 获得要发的牌：
                // remove 移除第一张牌，就像发牌时从最上面开始发
                // 该方法会返回要移除的元素的值
                Card top = poker.remove(0);
                if (top.rank.equals("big Joker") || top.rank.equals("small Joker")) {
                    top = poker.remove(0);
                }
                // 找到人：
                // 发给第 j 个人
                List<Card> player = players.get(j);
                // 把牌给到人
                player.add(top);
            }
        }

        // 4. 展示手牌
        for (int i = 0; i < players.size(); i++) {
            List<Card> player = players.get(i);
            System.out.println("玩家" + i + "的手牌是：" + player);
        }
    }
}
