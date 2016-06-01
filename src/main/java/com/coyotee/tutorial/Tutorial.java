package com.coyotee.tutorial;

import com.coyotee.tutorial.dimensions.WorldProviderTutorial;
import com.coyotee.tutorial.handler.MobDropsHandler;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Tutorial.MODID, version = Tutorial.VERSION)
public class Tutorial
{
	public static int dimensionId = 8;
	@Mod.Instance("coyoteetutorial")
    public static final String MODID = "coyoteeTutorial";

    public static final String VERSION = "1.0";
    @SidedProxy(clientSide="com.coyotee.tutorial.client.ClientProxy", serverSide="com.coyotee.tutorial.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	this.proxy.preInit(event);
    	MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
    } 

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	DimensionType.register("tutorial", MODID, dimensionId, WorldProviderTutorial.class, false);
    	DimensionManager.registerDimension(dimensionId, DimensionType.valueOf("tutorial"));
    	this.proxy.postInit(event);
    	
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	this.proxy.init(event);
    }
}