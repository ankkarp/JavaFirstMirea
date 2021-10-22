package ru.mirea.task14;

import java.util.*;

public class GameStack {
    int card1, card2;

    public static void main(String[] args) {
        new GameStack();
    }

    public GameStack(){
        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        int index;
        for (int i = 0; i < 5; i++){
            index = (int) (Math.random() * numbers.size());
            player1.push(numbers.get(index)); //by index
            numbers.remove(index);
        }
        for (int i = 0; i < 5; i++){
            index = (int) (Math.random() * numbers.size());
            player2.push(numbers.get(index)); //by index
            numbers.remove(index);
        }
        int k = 1;
        System.out.println("\n" + Arrays.toString(player1.toArray()) + "\t" + Arrays.toString(player2.toArray()) + "\n");
        while (!player1.isEmpty() && !player2.isEmpty()){
            if (k > 106){
                System.out.println("botva");
                break;
            }
            card1 = player1.pop();
            card2 = player2.pop();
            if (card1 == 0 || (card1 > card2 && card2 != 0)){
                player1.add(0, card1);
                player1.add(0, card2);
            }
            else {
                player2.add(0, card2);
                player2.add(0, card1);
            }
            System.out.println(k + ") " + card1 + " | " + card2);
            System.out.println(Arrays.toString(player1.toArray()) + "\t" + Arrays.toString(player2.toArray()) + "\n");
            k++;
        }
        if (player1.isEmpty()){
            System.out.println("Player 2 won!");
        }
        else if (player2.isEmpty()){
            System.out.println("Player 1 won!");
        }
    }
}