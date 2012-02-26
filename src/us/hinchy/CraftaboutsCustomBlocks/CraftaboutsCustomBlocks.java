package us.hinchy.CraftaboutsCustomBlocks;

import java.util.logging.Logger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.MaterialData;

public class CraftaboutsCustomBlocks extends JavaPlugin implements Listener {

	public static CustomBlock hubPortalA;
	public static CustomBlock hubPortalB;
	public static CustomBlock pipeBlock;
	public static CustomBlock pureDarkness;
	public static CustomBlock hotIron;
	
	Logger log = Logger.getLogger("Minecraft");
	
	public static Texture hubPortalTexture;
	public static Texture pipeBlockTexture;
	public static Texture pureDarknessTexture;
	public static Texture hotIronTexture;
	
	public void onEnable() {
		this.getConfig();
		
		if (this.getConfig().isSet("spikeblock") == false) {
			this.saveDefaultConfig();
			log.info("[Craftabouts Custom Blocks] Config did not exist or was invalid, default config saved.");
		}
		
		hubPortalTexture = new Texture(this, getConfig().getString("craftabouts.hubportal.texture"), getConfig().getInt("craftabouts.hubportal.size"), getConfig().getInt("craftabouts.hubportal.size"), getConfig().getInt("craftabouts.hubportal.size"));
		pipeBlockTexture = new Texture(this, getConfig().getString("craftabouts.pipeblock.texture"), getConfig().getInt("craftabouts.pipeblock.size"), getConfig().getInt("craftabouts.pipeblock.size"), getConfig().getInt("craftabouts.pipeblock.size"));
		pureDarknessTexture = new Texture(this, getConfig().getString("craftabouts.puredarkness.texture"), getConfig().getInt("craftabouts.puredarkness.size"), getConfig().getInt("craftabouts.puredarkness.size"), getConfig().getInt("craftabouts.puredarkness.size"));
		hotIronTexture = new Texture(this, getConfig().getString("craftabouts.hotiron.texture"), getConfig().getInt("craftabouts.hotiron.size"), getConfig().getInt("craftabouts.hotiron.size"), getConfig().getInt("craftabouts.hotiron.size"));
		
		hubPortalA = new HubPortalBlockTypeA(this,hubPortalTexture);
		hubPortalB = new HubPortalBlockTypeB(this,hubPortalTexture);
		pipeBlock = new PipeBlock(this,pipeBlockTexture);
		pureDarkness = new PureDarknessBlock(this,pureDarknessTexture);
		hotIron = new HotIron(this,hotIronTexture);
		
		pipeBlock.setLightLevel(6);
		
		hotIron.setLightLevel(8);
		hotIron.setHardness(15);

        SpoutShapelessRecipe recipe = new SpoutShapelessRecipe(new SpoutItemStack(pipeBlock, 3));
        recipe.addIngredient(1, MaterialData.ironBlock);
        recipe.addIngredient(1, MaterialData.enderPearl);
        recipe.addIngredient(1, MaterialData.cactusGreen);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
        
        getServer().getPluginManager().registerEvents(this, this);
		
		log.info("[Craftabouts Custom Blocks] Release 5 has been enabled.");
	}
	
	public void onDisable() {
		log.info("[Craftabouts Custom Blocks] Plugin has been disabled.");
	}
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) {
		boolean doHurt = false;
		
		SpoutBlock sb = (SpoutBlock) event.getPlayer().getLocation().add(0,-1,0).getBlock();
		
		if (sb.getCustomBlock() != null) {
    		if (sb.getCustomBlock() instanceof HotIron) {
    			doHurt = true;
    		}
    	} 
		
		if (!doHurt) {
			sb = (SpoutBlock) event.getPlayer().getLocation().add(0,0,0.5).getBlock();
			
			if (sb.getCustomBlock() != null) {
	    		if (sb.getCustomBlock() instanceof HotIron) {
	    			doHurt = true;
	    		}
	    	}
		}
		
		if (!doHurt) {
			sb = (SpoutBlock) event.getPlayer().getLocation().add(0,0,-0.5).getBlock();
			
			if (sb.getCustomBlock() != null) {
	    		if (sb.getCustomBlock() instanceof HotIron) {
	    			doHurt = true;
	    		}
	    	}
		}
		
		if (!doHurt) {
			sb = (SpoutBlock) event.getPlayer().getLocation().add(0.5,0,0).getBlock();
			
			if (sb.getCustomBlock() != null) {
	    		if (sb.getCustomBlock() instanceof HotIron) {
	    			doHurt = true;
	    		}
	    	}
		}
		
		if (!doHurt) {
			sb = (SpoutBlock) event.getPlayer().getLocation().add(-0.5,0,0).getBlock();
			
			if (sb.getCustomBlock() != null) {
	    		if (sb.getCustomBlock() instanceof HotIron) {
	    			doHurt = true;
	    		}
	    	}
		}
		
		if (!doHurt) {
			sb = (SpoutBlock) event.getPlayer().getLocation().add(0,1,0.5).getBlock();
			
			if (sb.getCustomBlock() != null) {
	    		if (sb.getCustomBlock() instanceof HotIron) {
	    			doHurt = true;
	    		}
	    	} 
		}
		
		if (!doHurt) {
			sb = (SpoutBlock) event.getPlayer().getLocation().add(0,1,-0.5).getBlock();
			
			if (sb.getCustomBlock() != null) {
	    		if (sb.getCustomBlock() instanceof HotIron) {
	    			doHurt = true;
	    		}
	    	}
		}
		
		if (!doHurt) {
			sb = (SpoutBlock) event.getPlayer().getLocation().add(0.5,1,0).getBlock();
			
			if (sb.getCustomBlock() != null) {
	    		if (sb.getCustomBlock() instanceof HotIron) {
	    			doHurt = true;
	    		}
	    	}
		}
		
		if (!doHurt) {
			sb = (SpoutBlock) event.getPlayer().getLocation().add(-0.5,1,0).getBlock();
			
			if (sb.getCustomBlock() != null) {
	    		if (sb.getCustomBlock() instanceof HotIron) {
	    			doHurt = true;
	    		}
	    	}
		}
		
		if (!doHurt) {
			sb = (SpoutBlock) event.getPlayer().getLocation().add(0,1.8,0).getBlock();
			
			if (sb.getCustomBlock() != null) {
	    		if (sb.getCustomBlock() instanceof HotIron) {
	    			doHurt = true;
	    		}
	    	}
		}
		
	    if (doHurt) event.getPlayer().damage(4);
	}
}
