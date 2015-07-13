package net.su.common.entity.steven;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.su.common.main.StevenUniverseMod;

public class RenderSteven extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(StevenUniverseMod.MODID + ":" + "textures/models/2.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderSteven(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityStevenMob entity){
		return mobTextures;
	}
	

	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityStevenMob)entity);
	}

}
