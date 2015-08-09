package net.su.client.gui;

import java.awt.Desktop;
import java.net.URL;

import org.lwjgl.input.Mouse;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.su.common.items.ModItems;

public class GuiRun extends GuiScreen
{
    public boolean running = true;
    private int mouseCount = 0;
    Minecraft mc = Minecraft.getMinecraft();
    EntityPlayer p = mc.thePlayer;
    
  
    public GuiRun()
    {
    }
    
    
   


	public static boolean DoesGuiPauseGame()
    {
    	return false;
    }
    
    
    @SuppressWarnings("unchecked")
	public void initGui()
    {
        buttonList.add(new GuiButton(100, (width / 2 - 75) , 40, "Do NOT run Steven Universe Mod"));
        buttonList.add(new GuiButton(200, (width / 2 - 75) , 90, "Be A GEM Mode"));
        buttonList.add(new GuiButton(300, (width / 2 - 75) , 140, "Normal Mode"));
        buttonList.add(new GuiButton(400, (width / 2 - 75) , 190, "Hardcore Mode (Nightmare Mode)"));
        buttonList.add(new GuiButton(500, (width / 2 - 75) , 335, "Report a bug"));
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
            drawCenteredString(fontRendererObj, "Please choose the game mode for Steven Universe", width / 2, 20, 0xFFFFFF);
            drawCenteredString(fontRendererObj, "This mode switches off Steven Universe Mod. (Not reccomended)", width / 2, 60, 0xFFFFFF);
            drawCenteredString(fontRendererObj, "Brand new! Become a Gem! Do what you want, whenever you want to.", width / 2, 110, 0xFFFFFF);
            drawCenteredString(fontRendererObj, "Normal MC with the Steven Universe Mod cant change later.", width / 2, 160, 0xFFFFFF);
            drawCenteredString(fontRendererObj, "Nightmare mode makes the Entitys spawn. Only spawn at night.", width / 2, 210, 0xFFFFFF);
        }
        catch (Exception e)
        {
        }

        super.drawScreen(i, j, f);
    }

    protected void actionPerformed(GuiButton guibutton )
    {
        if (guibutton.id == 100)  
        {
        	mc.thePlayer.closeScreen();
        	 this.running = false;
        	 p.inventory.consumeInventoryItem(ModItems.bookA);
        }
        else if (guibutton.id == 200)    
        {
        	
        	mc.displayGuiScreen(new GuiChooseGem());
        	/*	if (mc.thePlayer instanceof EntityPlayer){
        		
        	
            
        	 this.running = true;
        	 p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor1A));
        	 p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor1B));
        	 p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor1C));
        	 p.inventory.addItemStackToInventory(new ItemStack(ModItems.Armor1D));
             p.inventory.consumeInventoryItem(ModItems.bookA);
             */
        	
        }
        else if (guibutton.id == 300)    
        {
                                             
            this.running = false;
            mc.thePlayer.closeScreen();
            p.inventory.consumeInventoryItem(ModItems.bookA);
            p.inventory.addItemStackToInventory(new ItemStack(ModItems.a));
            p.inventory.addItemStackToInventory(new ItemStack(ModItems.b));
            p.inventory.addItemStackToInventory(new ItemStack(ModItems.c));
            
        }
        else if (guibutton.id == 400)    
        {
         
            this.running = false;
            mc.thePlayer.closeScreen();
            p.inventory.consumeInventoryItem(ModItems.bookA);
        }
        else if (guibutton.id == 500)    
        {
         
           this.running = false;
            mc.thePlayer.closeScreen();
            try {
                Desktop.getDesktop().browse(new URL("http://www.planetminecraft.com/mod/wip-pre-alpha-steven-universe-mod-forge-1710-animations/#comments").toURI());
            } catch (Exception e) {}
        }
        
    }
}
