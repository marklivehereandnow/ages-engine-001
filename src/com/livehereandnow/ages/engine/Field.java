package com.livehereandnow.ages.engine;

import com.livehereandnow.ages.components.CardArray;
import com.livehereandnow.ages.components.Points;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mark
 */
public class Field {

    CardArray allCards;
    CardArray 卡牌列;
    CardArray 時代A內政牌;
    CardArray 時代I內政牌;
    CardArray 時代II內政牌;
    CardArray 時代III內政牌;
    CardArray 時代A軍事牌;
    CardArray 時代I軍事牌;
    CardArray 時代II軍事牌;
    CardArray 時代III軍事牌;
    CardArray 未來事件;
    CardArray 當前事件;

    FieldPlayer p1;
    FieldPlayer p2;
    FieldPlayer currentPlayer;

    Points round;

    public Field() {
        init();
    }

    public void init() {
        allCards = new CardArray("All Cards");
        卡牌列 = new CardArray("卡牌列");
        時代A內政牌 = new CardArray("時代A內政牌");
        時代I內政牌 = new CardArray("時代I內政牌");
        時代II內政牌 = new CardArray("時代II內政牌");
        時代III內政牌 = new CardArray("時代III內政牌");
        時代A軍事牌 = new CardArray("時代A軍事牌");
        時代I軍事牌 = new CardArray("時代I軍事牌");
        時代II軍事牌 = new CardArray("時代II軍事牌");
        時代III軍事牌 = new CardArray("時代III軍事牌");
        未來事件 = new CardArray("未來事件");
        當前事件 = new CardArray("當前事件");

        p1=new FieldPlayer("max");
        p2=new FieldPlayer("amy");
        currentPlayer=p1;

        round=new Points("回合");

    }

    public void show() {
        round.show();
        allCards = new CardArray("All Cards");
        卡牌列.show(1);
        時代A內政牌.show(1);
        時代I內政牌.show(1);
        時代II內政牌.show(1);
        時代III內政牌.show(1);
        時代A軍事牌.show(1);
        時代I軍事牌.show(1);
        時代II軍事牌.show(1);
        時代III軍事牌.show(1);
        未來事件.show(1);
        當前事件.show(1);
        currentPlayer.show();
    }

    final class FieldPlayer {

        public FieldPlayer( String str) {
            name=str;
            init();
        }

        String name;
        Points 內政點數;
        Points 軍事點數;
        Points 建築上限;
        Points 內政手牌上限;
        Points 軍事手牌上限;
        Points 殖民點數;
        Points 文化;
        Points 文化生產_當回合;
        Points 科技;
        Points 科技生產_當回合;
        Points 軍力;
        Points 資源庫_藍點;
        Points 人力庫_黃點;
        Points 笑臉_幸福指數;
        Points 工人區_黃點;
        CardArray 領袖區;
        CardArray 政府區;
        CardArray 實驗室;
        CardArray 神廟區;
        CardArray 農場區;
        CardArray 礦山區;
        CardArray 步兵區;
        CardArray 建造中的奇蹟區;
        CardArray 已完成的奇蹟;
        CardArray 殖民領土區;
        CardArray 特殊科技區;
        CardArray 手牌內政牌區;
        CardArray 手牌軍事牌區;

        public void init() {
            內政點數 = new Points("內政點數");
            軍事點數 = new Points("軍事點數");
            建築上限 = new Points("建築上限");
            內政手牌上限 = new Points("內政手牌上限");
            軍事手牌上限 = new Points("軍事手牌上限");
            殖民點數 = new Points("殖民點數");
            文化 = new Points("文化");
            文化生產_當回合 = new Points("文化生產_當回合");
            科技 = new Points("科技");
            科技生產_當回合 = new Points("科技生產_當回合");
            軍力 = new Points("軍力");
            資源庫_藍點 = new Points("資源庫_藍點");
            人力庫_黃點 = new Points("人力庫_黃點");
            笑臉_幸福指數 = new Points("笑臉_幸福指數");
            工人區_黃點 = new Points("工人區_黃點");
            領袖區 = new CardArray("領袖區");
            政府區 = new CardArray("政府區");
            實驗室 = new CardArray("實驗室");
            神廟區 = new CardArray("神廟區");
            農場區 = new CardArray("農場區");
            礦山區 = new CardArray("礦山區");
            步兵區 = new CardArray("步兵區");
            建造中的奇蹟區 = new CardArray("建造中的奇蹟區");
            已完成的奇蹟 = new CardArray("已完成的奇蹟");
            殖民領土區 = new CardArray("殖民領土區");
            特殊科技區 = new CardArray("特殊科技區");
            手牌內政牌區 = new CardArray("手牌內政牌區");
            手牌軍事牌區 = new CardArray("手牌軍事牌區");
        }
        
        public void show(){
            System.out.println("=== "+name +" ===");
            內政點數.show();
            軍事點數.show();
            建築上限.show();
            內政手牌上限.show();
            軍事手牌上限.show();
            殖民點數.show();
            文化.show();
            文化生產_當回合.show();
            科技.show();
            科技生產_當回合.show();
            軍力.show();
            資源庫_藍點.show();
            人力庫_黃點.show();
            笑臉_幸福指數.show();
            工人區_黃點.show();
            領袖區.show(1);
            政府區.show(1);
            實驗室.show(1);
            神廟區.show(1);
            農場區.show(1);
            礦山區.show(1);
            步兵區.show(1);
            建造中的奇蹟區.show(1);
            已完成的奇蹟.show(1);
            殖民領土區.show(1);
            特殊科技區.show(1);
            手牌內政牌區.show(1);
            手牌軍事牌區.show(1);
        }
    }
}
