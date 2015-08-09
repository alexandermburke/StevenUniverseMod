package net.su.common.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

/**
 * Garnet - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class Garnet extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LegLeft;
    public ModelRenderer Head;
    public ModelRenderer ArmRight;
    public ModelRenderer ArmLeft;
    public ModelRenderer LegRight;
    public ModelRenderer Neck;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer FootLeft;
    public ModelRenderer LegLeft_1;
    public ModelRenderer Glasses1;
    public ModelRenderer Glasses2;
    public ModelRenderer Glasses3;
    public ModelRenderer Hair1;
    public ModelRenderer Hair2;
    public ModelRenderer Hair3;
    public ModelRenderer Hair4;
    public ModelRenderer Hair5;
    public ModelRenderer Hair6;
    public ModelRenderer Hair7;
    public ModelRenderer Hair8;
    public ModelRenderer Hair10;
    public ModelRenderer Hair11;
    public ModelRenderer Hair12;
    public ModelRenderer Hair13;
    public ModelRenderer Hair14;
    public ModelRenderer Hair15;
    public ModelRenderer Hair16;
    public ModelRenderer ArmRight_1;
    public ModelRenderer ArmLeft_1;
    public ModelRenderer LegRight_1;
    public ModelRenderer FootRight;
    public boolean isAttacking;

    public Garnet() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Hair2 = new ModelRenderer(this, 32, 34);
        this.Hair2.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Hair2.addBox(3.6F, 1.0F, -5.4F, 1, 8, 9, 0.0F);
        this.Body2 = new ModelRenderer(this, 16, 32);
        this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body2.addBox(-2.0F, -9.4F, -2.0F, 4, 7, 4, 0.0F);
        this.Hair6 = new ModelRenderer(this, 40, 40);
        this.Hair6.setRotationPoint(-5.0F, -1.0F, -4.4F);
        this.Hair6.addBox(8.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F);
        this.Hair14 = new ModelRenderer(this, 37, 36);
        this.Hair14.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Hair14.addBox(-4.5F, 1.0F, -5.4F, 1, 8, 9, 0.0F);
        this.LegLeft_1 = new ModelRenderer(this, 34, 0);
        this.LegLeft_1.mirror = true;
        this.LegLeft_1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.LegLeft_1.addBox(-1.3F, -0.3F, -2.4F, 4, 7, 5, 0.0F);
        this.Hair12 = new ModelRenderer(this, 40, 40);
        this.Hair12.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Hair12.addBox(-5.0F, 0.0F, 3.6F, 10, 9, 1, 0.0F);
        this.Hair8 = new ModelRenderer(this, 40, 40);
        this.Hair8.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Hair8.addBox(-5.0F, -0.2F, -5.4F, 1, 1, 10, 0.0F);
        this.Hair3 = new ModelRenderer(this, 30, 36);
        this.Hair3.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Hair3.addBox(-4.0F, 2.0F, -5.4F, 1, 7, 9, 0.0F);
        this.LegLeft = new ModelRenderer(this, 64, 44);
        this.LegLeft.setRotationPoint(1.9F, 7.0F, 0.0F);
        this.LegLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 17, 4, 0.0F);
        this.Body3 = new ModelRenderer(this, 0, 62);
        this.Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body3.addBox(-4.0F, -4.2F, -2.4F, 8, 4, 5, 0.0F);
        this.Hair16 = new ModelRenderer(this, 24, 41);
        this.Hair16.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Hair16.addBox(-4.5F, -0.7F, -5.4F, 9, 3, 10, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.mirror = true;
        this.Head.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.9F, 8, 8, 8, 0.0F);
        this.Hair10 = new ModelRenderer(this, 0, 0);
        this.Hair10.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Hair10.addBox(4.0F, -0.2F, -5.4F, 1, 1, 10, 0.0F);
        this.Glasses2 = new ModelRenderer(this, 68, 0);
        this.Glasses2.mirror = true;
        this.Glasses2.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Glasses2.addBox(-3.6F, -0.6F, -5.2F, 7, 5, 1, 0.0F);
        this.setRotateAngle(Glasses2, 0.0F, 0.0F, -0.008552113334772215F);
        this.Hair1 = new ModelRenderer(this, 24, 41);
        this.Hair1.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Hair1.addBox(-5.0F, -0.2F, -5.4F, 10, 3, 10, 0.0F);
        this.ArmRight = new ModelRenderer(this, 52, 16);
        this.ArmRight.setRotationPoint(-5.0F, -4.0F, 0.0F);
        this.ArmRight.addBox(-2.1F, -1.6F, -1.5F, 3, 14, 3, 0.0F);
        this.setRotateAngle(ArmRight, 0.0F, 0.0F, 0.03892084231947355F);
        this.Neck = new ModelRenderer(this, 0, 1);
        this.Neck.setRotationPoint(0.0F, -15.5F, 0.0F);
        this.Neck.addBox(-1.0F, -2.1F, -1.1F, 2, 3, 2, 0.0F);
        this.ArmLeft = new ModelRenderer(this, 52, 16);
        this.ArmLeft.mirror = true;
        this.ArmLeft.setRotationPoint(6.0F, -4.0F, -0.0F);
        this.ArmLeft.addBox(-2.0F, -1.6F, -1.5F, 3, 14, 3, 0.0F);
        this.setRotateAngle(ArmLeft, 0.0F, 0.0F, -0.038876791174421596F);
        this.Hair5 = new ModelRenderer(this, 40, 40);
        this.Hair5.setRotationPoint(-5.0F, -1.0F, -4.4F);
        this.Hair5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F);
        this.LegRight = new ModelRenderer(this, 0, 16);
        this.LegRight.setRotationPoint(-1.9F, 7.0F, 0.0F);
        this.LegRight.addBox(-2.0F, 0.0F, -2.0F, 4, 17, 4, 0.0F);
        this.Glasses1 = new ModelRenderer(this, 75, 0);
        this.Glasses1.mirror = true;
        this.Glasses1.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Glasses1.addBox(-2.0F, 3.9F, -5.2F, 1, 1, 1, 0.0F);
        this.Hair7 = new ModelRenderer(this, 40, 40);
        this.Hair7.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Hair7.addBox(-5.0F, 5.0F, -5.4F, 2, 3, 1, 0.0F);
        this.ArmRight_1 = new ModelRenderer(this, 47, 4);
        this.ArmRight_1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.ArmRight_1.addBox(-2.7F, -1.7F, -2.0F, 4, 4, 4, 0.0F);
        this.LegRight_1 = new ModelRenderer(this, 0, 72);
        this.LegRight_1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.LegRight_1.addBox(-2.8F, -0.3F, -2.4F, 4, 7, 5, 0.0F);
        this.Glasses3 = new ModelRenderer(this, 69, 0);
        this.Glasses3.mirror = true;
        this.Glasses3.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Glasses3.addBox(1.0F, 3.9F, -5.2F, 1, 1, 1, 0.0F);
        this.Hair13 = new ModelRenderer(this, 30, 36);
        this.Hair13.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Hair13.addBox(3.0F, 1.0F, -5.4F, 1, 8, 9, 0.0F);
        this.ArmLeft_1 = new ModelRenderer(this, 47, 4);
        this.ArmLeft_1.mirror = true;
        this.ArmLeft_1.setRotationPoint(-1.9F, -1.6F, -1.5F);
        this.ArmLeft_1.addBox(-0.5F, -0.4F, -0.5F, 4, 4, 4, 0.0F);
        this.FootLeft = new ModelRenderer(this, 15, 87);
        this.FootLeft.mirror = true;
        this.FootLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootLeft.addBox(-2.0F, 16.0F, -3.0F, 4, 1, 1, 0.0F);
        this.Hair4 = new ModelRenderer(this, 25, 38);
        this.Hair4.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Hair4.addBox(-5.0F, 1.0F, -4.4F, 10, 2, 9, 0.0F);
        this.Hair11 = new ModelRenderer(this, 40, 40);
        this.Hair11.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Hair11.addBox(3.0F, 5.0F, -5.4F, 2, 3, 1, 0.0F);
        this.Body = new ModelRenderer(this, 19, 20);
        this.Body.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Body.addBox(-4.5F, -15.0F, -3.0F, 9, 6, 6, 0.0F);
        this.Hair15 = new ModelRenderer(this, 35, 40);
        this.Hair15.setRotationPoint(0.0F, -9.2F, 0.0F);
        this.Hair15.addBox(-5.0F, 7.2F, 0.6F, 10, 3, 3, 0.0F);
        this.FootRight = new ModelRenderer(this, 15, 87);
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(-1.9F, 10.0F, -0.9F);
        this.FootRight.addBox(-0.1F, 6.0F, -2.1F, 4, 1, 1, 0.0F);
        this.Head.addChild(this.Hair2);
        this.Body.addChild(this.Body2);
        this.Head.addChild(this.Hair6);
        this.Head.addChild(this.Hair14);
        this.LegLeft.addChild(this.LegLeft_1);
        this.Head.addChild(this.Hair12);
        this.Head.addChild(this.Hair8);
        this.Head.addChild(this.Hair3);
        this.Body.addChild(this.Body3);
        this.Head.addChild(this.Hair16);
        this.Head.addChild(this.Hair10);
        this.Head.addChild(this.Glasses2);
        this.Head.addChild(this.Hair1);
        this.Body.addChild(this.Neck);
        this.Head.addChild(this.Hair5);
        this.Head.addChild(this.Glasses1);
        this.Head.addChild(this.Hair7);
        this.ArmRight.addChild(this.ArmRight_1);
        this.LegRight.addChild(this.LegRight_1);
        this.Head.addChild(this.Glasses3);
        this.Head.addChild(this.Hair13);
        this.ArmLeft.addChild(this.ArmLeft_1);
        this.LegLeft.addChild(this.FootLeft);
        this.Head.addChild(this.Hair4);
        this.Head.addChild(this.Hair11);
        this.Head.addChild(this.Hair15);
        this.LegRight.addChild(this.FootRight);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	/* Animation Start (Arms) */
    	float prog = 0.1F;
    	float prog2 = 0.5F;
    	
		this.ArmRight.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.ArmRight.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.ArmRight_1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.ArmRight_1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		

    	/* Animation Start (Legs) */
		

		this.LegLeft.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.LegLeft.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.LegLeft_1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.LegLeft_1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		
		this.LegRight.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.LegRight.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.LegRight_1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.LegRight_1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		
	
		
		/* End Animation */
			
		
		/* Attack Animation */
		if(this.isAttacking){
			
			
			this.ArmLeft.rotateAngleX = MathHelper.cos(prog2 * 0.6662F + (float)Math.PI) * 1.4F * prog2;
			this.ArmLeft.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.6F * f1;
			this.ArmLeft_1.rotateAngleX = MathHelper.cos(prog2 * 0.6662F + (float)Math.PI) * 1.4F * prog2;
			this.ArmLeft_1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.6F * f1;
		
		}else{
			
			this.ArmLeft.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
			this.ArmLeft.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
			this.ArmLeft_1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
			this.ArmLeft_1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
			
			
		}
			
		/* End Attack Animation */

        GL11.glPushMatrix();
        GL11.glTranslatef(this.LegLeft.offsetX, this.LegLeft.offsetY, this.LegLeft.offsetZ);
        GL11.glTranslatef(this.LegLeft.rotationPointX * f5, this.LegLeft.rotationPointY * f5, this.LegLeft.rotationPointZ * f5);
        GL11.glScaled(0.9D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.LegLeft.offsetX, -this.LegLeft.offsetY, -this.LegLeft.offsetZ);
        GL11.glTranslatef(-this.LegLeft.rotationPointX * f5, -this.LegLeft.rotationPointY * f5, -this.LegLeft.rotationPointZ * f5);
        this.LegLeft.render(f5);
        GL11.glPopMatrix();
        this.Head.render(f5);
        this.ArmRight.render(f5);
        this.ArmLeft.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.LegRight.offsetX, this.LegRight.offsetY, this.LegRight.offsetZ);
        GL11.glTranslatef(this.LegRight.rotationPointX * f5, this.LegRight.rotationPointY * f5, this.LegRight.rotationPointZ * f5);
        GL11.glScaled(0.9D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.LegRight.offsetX, -this.LegRight.offsetY, -this.LegRight.offsetZ);
        GL11.glTranslatef(-this.LegRight.rotationPointX * f5, -this.LegRight.rotationPointY * f5, -this.LegRight.rotationPointZ * f5);
        this.LegRight.render(f5);
        GL11.glPopMatrix();
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
