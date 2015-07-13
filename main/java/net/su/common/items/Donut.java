package net.su.common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ChatComponentText;

public class Donut extends ItemFood {

	public Donut(int p_i45340_1_, boolean p_i45340_2_) {
		super(p_i45340_1_, p_i45340_2_);


		this.setPotionEffect("8193");
		this.setAlwaysEdible();
		this.isWolfsFavoriteMeat();
			
	}


	EntityPlayer p;
	
	public void setPotionEffect() {
		
		
		System.err.println("setPotionEffect is on...");
		
		p.addChatMessage(new ChatComponentText("§5You now have a potion effect."));
		return;
	}
	


}
