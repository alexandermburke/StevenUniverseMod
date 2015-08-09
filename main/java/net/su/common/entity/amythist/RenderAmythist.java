package net.su.common.entity.amythist;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.su.common.entity.models.Amythist;
import net.su.common.main.StevenUniverseMod;

public class RenderAmythist extends RenderLiving{

	public static Amythist amy = new Amythist();
	private static final ResourceLocation mobTextures = new ResourceLocation(StevenUniverseMod.MODID + ":" + "textures/models/1.png");
	private static final String __OBFID = "CL_00000984";
	
	
	
	public RenderAmythist(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
		
	}
	
	
	
	protected ResourceLocation getEntityTexture(EntityAmythistMob entity){
		return mobTextures;
	}
	

	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityAmythistMob)entity);
	}

}
