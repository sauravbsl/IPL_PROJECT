package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Player;

public class dao {
       public  List<Player> getAllPlayer() {
//    	   The <Player> part is a generic type, meaning that this List will
//    	   only accept objects of type Player.

    	List<Player> allplayer = new ArrayList<>();
    	Player m1 = new Player("Mr.Rohit sharma", 45, 103, 2013, "Batsman", 5000, 0);
   		Player m2 = new Player("Mr.Hardik pandya", 7, 10333, 2001, "Allrounder", 500, 500);
   		Player m3 = new Player("Mr.Jasprit Bumrah", 23, 1003, 2007, "bowller", 0, 500);
   		Player m4 = new Player("Mr.Pollard", 43, 1033, 2014, "All Rounder", 500, 500);
   		Player m5 = new Player("Mr.Suryakumar Yadav", 32, 1303, 2003, "Batsman", 5000, 0);

   		Player c1 = new Player("Mr.Ruturaj gaykwad", 45, 103, 2013, "Batsman", 5000, 0);
   		Player c2 = new Player("Mr.MSD", 7, 10333, 2001, "Batsman", 5000, 0);
   		Player c3 = new Player("Mr.Tushar deshpande", 23, 1003, 2007, "Bowller", 5000, 500);
   		Player c4 = new Player("Mr.Moin Ali", 43, 1033, 2014, "All ROunder", 5000, 5000);
   		Player c5 = new Player("Mr.Ravindra Jadeja", 32, 1303, 2003, "AllRounder", 5000, 5000);

   		Player r1 = new Player("Mr.virat kohli", 45, 103, 2013, "Batsman", 5000, 0);
   		Player r2 = new Player("Mr Maxwell", 7, 10333, 2001, "All Rounder", 5000, 5000);
   		Player r3 = new Player("Mr.Duplessi", 23, 1003, 2007, "Batsman", 5000, 0);
   		Player r4 = new Player("Mr.Dinesh kartik", 43, 1033, 2014, "Batsman", 5000, 0);
   		Player r5 = new Player("Mr.M siraj", 32, 1303, 2003, "Bowller", 5000, 500);
   		
   		allplayer.add(m1);
		allplayer.add(m2);
		allplayer.add(m3);
		allplayer.add(m4);
		allplayer.add(m5);

		allplayer.add(c1);
		allplayer.add(c2);
		allplayer.add(c3);
		allplayer.add(c4);
		allplayer.add(c5);

		allplayer.add(r1);
		allplayer.add(r2);
		allplayer.add(r3);
		allplayer.add(r4);
		allplayer.add(r5);
		
    	   return allplayer  ;
       }
}
