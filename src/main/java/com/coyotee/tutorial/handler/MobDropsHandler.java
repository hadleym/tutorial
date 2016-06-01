package com.coyotee.tutorial.handler;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler {
	@SubscribeEvent
	public void onMobsDrop(LivingDropsEvent event){
			if (event.getEntity() instanceof EntityPig ){
				event.getDrops().clear();
				ItemStack stack = new ItemStack(Items.GOLD_INGOT);
				EntityItem drop = new EntityItem(event.getEntity().worldObj,event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
				event.getDrops().add(drop);
			}

	}

}
