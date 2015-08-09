package net.su.common.achievement;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.su.common.items.ModItems;

public class SUAchievements {
	
	
	 public static Achievement LoadMod = (new Achievement("achievement.stevenuniverse_mod", "stevenuniverse_mod", 0, 0, ModItems.c, null)).initIndependentStat().registerStat();
	   
	 public static Achievement KilledByAmythest = (new Achievement("achievement.killed_by_amethyst", "killed_by_amethyst", 0, 0, ModItems.a, null)).initIndependentStat().registerStat();
		
	 public static Achievement Dev = (new Achievement("achievement.dev", "dev", 0, 0, ModItems.c, null)).initIndependentStat().registerStat();
		
	    public static AchievementPage stevenuniversePage = new AchievementPage("StevenUniverse", LoadMod);
	   
	  public static void register()
	    {
	        AchievementPage.registerAchievementPage(stevenuniversePage);
	    }
	 
}
