package katelyn.stuff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("stuffplus")
public class StuffPlus 
{
	public static StuffPlus instance;
	public static final String modid = "stuffplus";
	private static final Logger logger = LogManager.getLogger(modid);
	
	public StuffPlus() 
	{
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);

	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		logger.info("setup complete");
	}

	private void clientRegistries(final FMLClientSetupEvent event)
	{
		logger.info("clientRegistries loading complete");
	}
}
