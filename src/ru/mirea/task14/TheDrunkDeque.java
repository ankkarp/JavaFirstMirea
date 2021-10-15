package ru.mirea.task14;

import java.util.*;

public class TheDrunkDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> player1 = new LinkedList<>();
        Deque<Integer> player2 = new LinkedList<>();
        int player1card, player2card;
        for (int i = 0; i < 5; i++){
            player1.push(sc.nextInt());
        }
        for (int i = 0; i < 5; i++){
            player2.push(sc.nextInt());
        }
        int k = 1;
        while (!player1.isEmpty() && !player2.isEmpty()){
            if (k == 106){
                System.out.println("botva");
                break;
            }
            player1card = player1.pop();
            player2card = player2.pop();
            if (player1card > player2card){
                player1.add(player1card);
                player1.add(player2card);
            }
            else {
                player2.add(player2card);
                player2.add(player1card);
            }
            k++;
        }
        if (player1.isEmpty()){
            System.out.println("Player 2 won!");
        }
        else{
            System.out.println("Player 1 won!");
        }
    }
}
