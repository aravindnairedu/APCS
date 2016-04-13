package edu.kyleknobloch.APCS.CaseStudy.Activity5.buggy2;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;
    private int size;

    public Deck(String[] var1, String[] var2, int[] var3) {
        cards = new ArrayList<>();
        for(int var4 = 1; var4 < var1.length; ++var4) {
            String[] var5 = var2;
            int var6 = var2.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                String var8 = var5[var7];
                this.cards.add(new Card(var1[var4], var8, var3[var4]));
            }
        }

        this.shuffle();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.cards.size();
    }

    public void shuffle() {
        for(int var1 = this.cards.size() - 1; var1 > 0; --var1) {
            int var2 = var1 + 1;
            byte var3 = 0;
            int var4 = (int)(Math.random() * (double)var2) + var3;
            Card var5 = this.cards.get(var1);
            this.cards.set(var1, this.cards.get(var4));
            this.cards.set(var4, var5);
        }

        this.size = this.cards.size();
    }

    public Card deal() {
        if(this.isEmpty()) {
            return null;
        } else {
            --this.size;
            Card var1 = this.cards.get(this.size);
            return var1;
        }
    }

    public String toString() {
        String var1 = "size = " + this.size + "\nUndealt cards: \n";

        int var2;
        for(var2 = this.size - 1; var2 >= 0; --var2) {
            var1 = var1 + this.cards.get(var2);
            if(var2 != 0) {
                var1 = var1 + ", ";
            }

            if((this.size - var2) % 2 == 0) {
                var1 = var1 + "\n";
            }
        }

        var1 = var1 + "\nDealt cards: \n";

        for(var2 = this.cards.size() - 1; var2 >= this.size; --var2) {
            var1 = var1 + this.cards.get(var2);
            if(var2 != this.size) {
                var1 = var1 + ", ";
            }

            if((var2 - this.cards.size()) % 2 == 0) {
                var1 = var1 + "\n";
            }
        }

        var1 = var1 + "\n";
        return var1;
    }
}
