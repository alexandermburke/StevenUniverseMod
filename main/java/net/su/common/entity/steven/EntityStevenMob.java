package net.su.common.entity.steven;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityStevenMob extends EntityMob{

	public EntityStevenMob(World par1World) {
		super(par1World);
	    this.setSize(0.6F, 2.9F);
	    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.0D, true));
	    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySkeleton.class, 1.0D, true));
	    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPig.class, 1.0D, true));
	    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.0D, true));
	    this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	    
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPig.class, 0, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, true));
		
		
		
	}
	
	
	
	 /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(500.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
    }
	
}