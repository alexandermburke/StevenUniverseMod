package net.su.common.entity.pearl;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityPearlMob extends EntityMob{

	String newName = "Pearl";
	public EntityPearlMob(World par1World) {
		super(par1World);

		this.setSize(0.6F, 2.3F);
	    this.getNavigator().setAvoidsWater(true);
	    
	    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityCreeper.class, 1.0D, true));
	    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.0D, true));
	    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySkeleton.class, 1.0D, true));
	    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPig.class, 1.0D, true));
	    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.0D, true));
	    this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	    this.setCustomNameTag(newName.toUpperCase());
		
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPig.class, 0, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, true));
		
		
		
	}
	
	
    public boolean isAIEnabled()
    {
        return true;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        	this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(50.0D);
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0D);
    }


	
	
}