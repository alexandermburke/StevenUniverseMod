package net.su.common.entity.models.player;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;

public class ModelBipedSU extends ModelBiped
{
	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	public void render(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6)
	{
		super.render(entity, f1, f2, f3, f4, f5, f6);
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float f1, float f2, float f3, float f4, float f5, float f6, Entity entity)
	{
		super.setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
	}

	
}