package net.su.common.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.su.common.entity.amythist.EntityAmythistMob;
import net.su.common.entity.amythist.RenderAmythist;
import net.su.common.entity.models.Amythist;
import net.su.common.entity.models.Pearl;
import net.su.common.entity.models.Steven;
import net.su.common.entity.pearl.EntityPearlMob;
import net.su.common.entity.pearl.RenderPearl;
import net.su.common.entity.steven.EntityStevenMob;
import net.su.common.entity.steven.RenderSteven;

public class CommonProxy extends ClientProxy{
	
	public void registerRenderThings() {

		 RenderingRegistry.registerEntityRenderingHandler(EntityAmythistMob.class, new RenderAmythist(new Amythist(), 0));
		 RenderingRegistry.registerEntityRenderingHandler(EntityStevenMob.class, new RenderSteven(new Steven(), 0));
		 RenderingRegistry.registerEntityRenderingHandler(EntityPearlMob.class, new RenderPearl(new Pearl(), 0));

	}

}
