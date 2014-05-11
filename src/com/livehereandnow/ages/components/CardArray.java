/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livehereandnow.ages.components;

import java.util.ArrayList;

/**
 *
 * @author mark
 */
public class CardArray extends ArrayList<Card>{
    private String title="---";

    public CardArray(String str) {
        title=str;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

   // @Override
    public String toString(int k) {
        return title + " "+ toString();
    }
    
    public void show(int k){
        System.out.println(toString(k));
    }
}
