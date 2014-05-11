/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livehereandnow.max.demo;

import com.livehereandnow.ages.components.Card;
import com.livehereandnow.ages.components.CardArray;
import static com.livehereandnow.ages.components.CardType.戰術;
import static com.livehereandnow.ages.components.CardType.深紅色;
import static com.livehereandnow.ages.components.CardType.軍事;

/**
 *
 * @author mark
 */
public class TestCardArray {
    public static void main(String[] args){
        CardArray ca=new CardArray("abc");
        Card c1=new Card(1042, "軍團", 1, 軍事, 戰術, 深紅色, "戰術", "步步步:2", "0");
        Card c2=new Card(1043, "xxx", 1, 軍事, 戰術, 深紅色, "戰術", "步步步:2", "0");
//        ca.add("xxx");
        ca.add(c1);
        ca.add(c2);
        ca.setTitle("卡牌列");
        
        System.out.println(" "+ca.toString(1));
    }
}
