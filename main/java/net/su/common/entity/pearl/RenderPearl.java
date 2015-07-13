package net.su.common.entity.pearl;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.su.common.main.StevenUniverseMod;

public class RenderPearl extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(StevenUniverseMod.MODID + ":" + "textures/models/3.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderPearl(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityPearlMob entity){
		return mobTextures;
	}
	

	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityPearlMob)entity);
	}

}
