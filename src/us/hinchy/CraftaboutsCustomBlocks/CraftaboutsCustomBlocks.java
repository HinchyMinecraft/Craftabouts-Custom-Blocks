package us.hinchy.CraftaboutsCustomBlocks;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.MaterialData;

public class CraftaboutsCustomBlocks extends JavaPlugin {

	public static CustomBlock hubPortalA;
	public static CustomBlock hubPortalB;
	public static CustomBlock pipeBlock;
	public static CustomBlock pureDarkness;
	public static CustomBlock hotIron;
	
	Logger log = Logger.getLogger("Minecraft");
	
	public final Texture hubPortalTexture = new Texture(this, "http://hinchy.us/spout/hubportal.png", 16, 16, 16);
	public final Texture pipeBlockTexture = new Texture(this, "http://hinchy.us/spout/pipeblock.png", 16, 16, 16);
	public final Texture pureDarknessTexture = new Texture(this, "http://hinchy.us/spout/puredarkness.png", 16, 16, 16);
	public final Texture hotIronTexture = new Texture(this, "http://briguy.us/spout/hotIron.png", 16, 16, 16);
	
	public void onEnable() { 
		hubPortalA = new HubPortalBlockTypeA(this,hubPortalTexture);
		hubPortalB = new HubPortalBlockTypeB(this,hubPortalTexture);
		pipeBlock = new PipeBlock(this,pipeBlockTexture);
		pureDarkness = new PureDarknessBlock(this,pureDarknessTexture);
		hotIron = new HotIron(this,hotIronTexture);
		
		pipeBlock.setLightLevel(6);
		hotIron.setLightLevel(8);

        SpoutShapelessRecipe recipe = new SpoutShapelessRecipe(new SpoutItemStack(pipeBlock, 3));
        recipe.addIngredient(1, MaterialData.ironBlock);
        recipe.addIngredient(1, MaterialData.enderPearl);
        recipe.addIngredient(1, MaterialData.cactusGreen);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		log.info("Hub Portal Block by Zach Hinchy (http://hinchy.us/) enabled.");
	}
	
	public void onDisable() {
		
		log.info("Hub Portal Block by Zach Hinchy (http://hinchy.us/) disabled.");
	}
}
