package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLLoadEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "doufuxiang";
    public static final String VERSION = "0.0.1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code

        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
    @EventHandler
    public void d (FMLLoadCompleteEvent event)
    {
//        event.getModState()
    }

}
