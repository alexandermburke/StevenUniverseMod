package net.su.common.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

/**
 * Pearl - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class Pearl extends ModelBase {
    public ModelRenderer ArmRight;
    public ModelRenderer ArmLeft;
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer LegRight;
    public ModelRenderer LegLeft;
    public ModelRenderer Nose;
    public ModelRenderer Hair1;
    public ModelRenderer Hair2;
    public ModelRenderer Hair3;
    public ModelRenderer Hair4;
    public ModelRenderer Hair5;
    public ModelRenderer Hair6;
    public ModelRenderer Hair7;
    public ModelRenderer Skirt;
    public ModelRenderer Scarf1;
    public ModelRenderer Scarf2;
    public ModelRenderer Bewbs;
    public ModelRenderer Neck;
    public ModelRenderer FootRight;
    public ModelRenderer FootLeft;

    public Pearl() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.LegRight = new ModelRenderer(this, 0, 16);
        this.LegRight.setRotationPoint(-1.9F, 9.0F, 0.1F);
        this.LegRight.addBox(-2.0F, 0.0F, -2.0F, 4, 15, 4, 0.0F);
        this.Hair5 = new ModelRenderer(this, 35, 3);
        this.Hair5.setRotationPoint(3.3F, -6.5F, -4.5F);
        this.Hair5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Scarf1 = new ModelRenderer(this, 41, 52);
        this.Scarf1.setRotationPoint(4.7F, -1.6F, 0.1F);
        this.Scarf1.addBox(-3.9F, -5.0F, 0.9F, 3, 3, 2, 0.0F);
        this.setRotateAngle(Scarf1, 0.0F, 0.025481807079117208F, -0.28099800957108706F);
        this.Body = new ModelRenderer(this, 16, 17);
        this.Body.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.Body.addBox(-4.0F, -15.0F, -2.0F, 8, 13, 4, 0.0F);
        this.FootRight = new ModelRenderer(this, 15, 62);
        this.FootRight.setRotationPoint(-1.9F, 9.0F, 0.1F);
        this.FootRight.addBox(-0.1F, 5.0F, -3.0F, 4, 1, 1, 0.0F);
        this.Hair1 = new ModelRenderer(this, 33, 2);
        this.Hair1.setRotationPoint(0.0F, -8.0F, 2.0F);
        this.Hair1.addBox(-4.0F, 0.0F, 0.0F, 8, 4, 6, 0.0F);
        this.setRotateAngle(Hair1, -0.4544837372193234F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 37);
        this.Neck.setRotationPoint(0.0F, -15.5F, 0.0F);
        this.Neck.addBox(-1.0F, -2.1F, -1.1F, 2, 3, 2, 0.0F);
        this.Hair6 = new ModelRenderer(this, 35, 3);
        this.Hair6.setRotationPoint(-4.4F, -1.5F, -4.5F);
        this.Hair6.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Head = new ModelRenderer(this, 2, 2);
        this.Head.mirror = true;
        this.Head.setRotationPoint(0.0F, -5.2F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 9, 6, 0.0F);
        this.setRotateAngle(Head, 0.045553093477052F, 0.0F, 0.0F);
        this.Bewbs = new ModelRenderer(this, 19, 53);
        this.Bewbs.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bewbs.addBox(-4.0F, -14.7F, -2.4F, 8, 6, 1, 0.0F);
        this.ArmRight = new ModelRenderer(this, 40, 17);
        this.ArmRight.setRotationPoint(-5.0F, -1.1F, 0.0F);
        this.ArmRight.addBox(-2.0F, -2.0F, -2.0F, 3, 15, 4, 0.0F);
        this.setRotateAngle(ArmRight, 0.0F, 0.0F, 0.10000736613927509F);
        this.FootLeft = new ModelRenderer(this, 15, 62);
        this.FootLeft.mirror = true;
        this.FootLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootLeft.addBox(-2.0F, 14.0F, -3.0F, 4, 1, 1, 0.0F);
        this.Hair7 = new ModelRenderer(this, 56, 24);
        this.Hair7.setRotationPoint(-1.0F, -7.0F, -4.3F);
        this.Hair7.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.LegLeft = new ModelRenderer(this, 0, 16);
        this.LegLeft.mirror = true;
        this.LegLeft.setRotationPoint(1.9F, 9.0F, 0.1F);
        this.LegLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 15, 4, 0.0F);
        this.Hair2 = new ModelRenderer(this, 33, 2);
        this.Hair2.setRotationPoint(0.0F, -1.8F, 0.6F);
        this.Hair2.addBox(-4.0F, -1.0F, 0.0F, 8, 4, 6, 0.0F);
        this.setRotateAngle(Hair2, 0.43022366061660217F, 0.0F, 0.0F);
        this.Hair3 = new ModelRenderer(this, 35, 3);
        this.Hair3.setRotationPoint(3.3F, -1.5F, -4.5F);
        this.Hair3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Hair4 = new ModelRenderer(this, 35, 3);
        this.Hair4.setRotationPoint(-4.3F, -6.5F, -4.5F);
        this.Hair4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.ArmLeft = new ModelRenderer(this, 40, 17);
        this.ArmLeft.mirror = true;
        this.ArmLeft.setRotationPoint(5.0F, -1.1F, -0.0F);
        this.ArmLeft.addBox(-1.0F, -2.0F, -2.0F, 3, 15, 4, 0.0F);
        this.setRotateAngle(ArmLeft, 0.0F, 0.0F, -0.10000736613927509F);
        this.Skirt = new ModelRenderer(this, 9, 38);
        this.Skirt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Skirt.addBox(-4.5F, -3.0F, -2.5F, 9, 1, 5, 0.0F);
        this.Nose = new ModelRenderer(this, 0, 52);
        this.Nose.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.Nose.addBox(-1.0F, -3.0F, -6.0F, 2, 1, 3, 0.0F);
        this.Scarf2 = new ModelRenderer(this, 41, 52);
        this.Scarf2.setRotationPoint(4.7F, -0.7F, 0.0F);
        this.Scarf2.addBox(-4.6F, -2.9F, 0.8F, 3, 6, 2, 0.0F);
        this.setRotateAngle(Scarf2, 0.0F, 0.025481807079117208F, 0.0F);
        this.Head.addChild(this.Hair5);
        this.Body.addChild(this.Scarf1);
        this.LegRight.addChild(this.FootRight);
        this.Head.addChild(this.Hair1);
        this.Body.addChild(this.Neck);
        this.Head.addChild(this.Hair6);
        this.Body.addChild(this.Bewbs);
        this.LegLeft.addChild(this.FootLeft);
        this.Head.addChild(this.Hair7);
        this.Head.addChild(this.Hair2);
        this.Head.addChild(this.Hair3);
        this.Head.addChild(this.Hair4);
        this.Body.addChild(this.Skirt);
        this.Head.addChild(this.Nose);
        this.Body.addChild(this.Scarf2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	
    	/* Animation Start (Arms) */
    	float prog = 0.1F;
    	
		this.ArmLeft.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.ArmRight.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.ArmLeft.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.ArmRight.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;


    	/* Animation Start (Legs) */
		

		this.LegLeft.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.LegRight.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.LegLeft.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.LegRight.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		
		
		/* End Animation  */
    	GL11.glPushMatrix();
        GL11.glTranslatef(this.LegRight.offsetX, this.LegRight.offsetY, this.LegRight.offsetZ);
        GL11.glTranslatef(this.LegRight.rotationPointX * f5, this.LegRight.rotationPointY * f5, this.LegRight.rotationPointZ * f5);
        GL11.glScaled(0.8D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.LegRight.offsetX, -this.LegRight.offsetY, -this.LegRight.offsetZ);
        GL11.glTranslatef(-this.LegRight.rotationPointX * f5, -this.LegRight.rotationPointY * f5, -this.LegRight.rotationPointZ * f5);
        this.LegRight.render(f5);
        GL11.glPopMatrix();
        this.Body.render(f5);
        this.Head.render(f5);
        this.ArmRight.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.LegLeft.offsetX, this.LegLeft.offsetY, this.LegLeft.offsetZ);
        GL11.glTranslatef(this.LegLeft.rotationPointX * f5, this.LegLeft.rotationPointY * f5, this.LegLeft.rotationPointZ * f5);
        GL11.glScaled(0.8D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.LegLeft.offsetX, -this.LegLeft.offsetY, -this.LegLeft.offsetZ);
        GL11.glTranslatef(-this.LegLeft.rotationPointX * f5, -this.LegLeft.rotationPointY * f5, -this.LegLeft.rotationPointZ * f5);
        this.LegLeft.render(f5);
        GL11.glPopMatrix();
        this.ArmLeft.render(f5);
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
