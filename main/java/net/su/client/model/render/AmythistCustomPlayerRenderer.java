package net.su.client.model.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.su.common.entity.models.Amythist;
import net.su.common.entity.models.player.ModelAmythist;
import net.su.common.main.StevenUniverseMod;

public class AmythistCustomPlayerRenderer extends RenderPlayer
{

	private static final ResourceLocation _Texture = new ResourceLocation(StevenUniverseMod.MODID + ":" + "textures/models/1.png");
 
	 public AmythistCustomPlayerRenderer()
	 {
	 super();
	 this.mainModel = new ModelAmythist();
	 this.modelArmorChestplate = new ModelAmythist();
	 this.modelArmor = new ModelAmythist();
	 this.renderManager = RenderManager.instance;
	 }
	 
	 @Override
	 protected ResourceLocation getEntityTexture(Entity par1Entity)
	 {
	 return this._Texture;
	 }
	}
