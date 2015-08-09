package net.su.client.gui;

import java.awt.Desktop;
import java.net.URL;

import org.lwjgl.input.Mouse;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.su.client.model.render.AmythistCustomPlayerRenderer;
import net.su.common.entity.amythist.RenderAmythist;
import net.su.common.items.ModItems;

public class GuiChooseGem extends GuiScreen
{
    public boolean running = true;
    private int mouseCount = 0;
    Minecraft mc = Minecraft.getMinecraft();
    EntityPlayer p = mc.thePlayer;
    
    AmythistCustomPlayerRenderer renderCustomPlayer = new AmythistCustomPlayerRenderer();
   
    public GuiChooseGem()
    {
    }
    
    
    public static boolean DoesGuiPauseGame()
    {
    	return true;
    }
    
    
    @SuppressWarnings("unchecked")
	public void initGui()
    {
        buttonList.add(new GuiButton(100, (width / 2 - 75) , 55, "Amethyst"));
        buttonList.add(new GuiButton(200, (width / 2 - 75) , 75, "Pearl"));
        buttonList.add(new GuiButton(300, (width / 2 - 75) , 95, "Garnet"));
        buttonList.add(new GuiButton(400, (width / 2 - 75) , 115, "Steven"));
    }

    public void drawScreen(int i, int j, float f)
    {
        try
        {
            if (mouseCount < 10)
            {
                mouseCount++;
                Mouse.setGrabbed(false);
            }

            drawDefaultBackground();
            drawCenteredString(fontRendererObj, "Choose your gem:", width / 2, 20, 0xCB00FF);
            drawCenteredString(fontRendererObj, "Adding More soon! Stay updated.", width / 2, 20, 0xCB00FF);
    }
        catch (Exception e)
        {
        }

        super.drawScreen(i, j, f);
    }

  
    @SuppressWarnings("unchecked")
	public void actionPerformed(GuiButton guibutton)
    {
        if (guibutton.id == 100)  
        {	
       		
        	if (mc.thePlayer instanceof EntityPlayer) 
    		{
    	
        	    renderCustomPlayer.setRenderManager(RenderManager.instance);
        
        	    RenderManager.instance.entityRenderMap.put(EntityPlayer.class, renderCustomPlayer);
    		}
    		}
        
     
        
        else if (guibutton.id == 200)    
        {   	
        	mc.thePlayer.closeScreen(); 
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor2A));
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor2B));
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor2C));
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor2D));
       		p.inventory.consumeInventoryItem(ModItems.bookA);
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Sword));
       		p.addChatMessage(new ChatComponentText("§6You have chosen to be Pearl"));
       		mc.thePlayer.closeScreen();
        	
        }
        else if (guibutton.id == 300)    
        {
        	mc.thePlayer.closeScreen(); 
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor3A));
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor3B));
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor3C));
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor3D));

       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Sword));
       		p.inventory.consumeInventoryItem(ModItems.bookA);
       		p.addChatMessage(new ChatComponentText("§7You have chosen to be Garnet"));                
       		mc.thePlayer.closeScreen();
        }
        else if (guibutton.id == 400)    
        {
        	mc.thePlayer.closeScreen(); 
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor4A));
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor4B));
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor4C));
       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor4D));

       		p.inventory.addItemStackToInventory(new ItemStack(ModItems.Sword));
       		p.inventory.consumeInventoryItem(ModItems.bookA);
       		p.addChatMessage(new ChatComponentText("§8You have chosen to be Steven"));
       		mc.thePlayer.closeScreen();
        }
        else if (guibutton.id == 500)    
        {
         
        }
        
    }
}
