package net.su.common.proxy;

import net.su.common.entity.amythist.EntityAmythistMob;
import net.su.common.entity.amythist.RenderAmythist;
import net.su.common.entity.models.Amythist;
import net.su.common.entity.models.Steven;
import net.su.common.entity.steven.EntityStevenMob;
import net.su.common.entity.steven.RenderSteven;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class CommonProxy extends ClientProxy{
	
	public void registerRenderThings() {

		 RenderingRegistry.registerEntityRenderingHandler(EntityAmythistMob.class, new RenderAmythist(new Amythist(), 0));
		 RenderingRegistry.registerEntityRenderingHandler(EntityStevenMob.class, new RenderSteven(new Steven(), 0));

	}

}
