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
	public static CustomBlock pipeBlockL;
	public static CustomBlock pipeBlockD;
	public static CustomBlock pureDarkness;
	public static CustomBlock hotIron;
	public static CustomBlock warpZoneFloor;
	public static CustomBlock warpZoneTile;
	public static CustomBlock warpZoneBrick;
	public static CustomBlock warpZoneQuestionBlock;
	
	Logger log = Logger.getLogger("Minecraft");
	
	public static Texture hubPortalTexture;
	public static Texture pipeBlockLTexture;
	public static Texture pipeBlockDTexture;
	public static Texture pureDarknessTexture;
	public static Texture hotIronTexture;
	public static Texture warpZoneFloorTexture;
	public static Texture warpZoneTileTexture;
	public static Texture warpZoneBrickTexture;
	public static Texture warpZoneQuestionBlockTexture;
	
	public void onEnable() {
		this.getConfig();
		
		if (this.getConfig().isSet("craftabouts") == false) {
			this.saveDefaultConfig();
			log.info("[Craftabouts Custom Blocks] Config did not exist or was invalid, default config saved.");
		}
		
		hubPortalTexture = new Texture(this, getConfig().getString("craftabouts.hubportal.texture"), getConfig().getInt("craftabouts.hubportal.size"), getConfig().getInt("craftabouts.hubportal.size"), getConfig().getInt("craftabouts.hubportal.size"));
		pipeBlockLTexture = new Texture(this, getConfig().getString("craftabouts.pipeblockl.texture"), getConfig().getInt("craftabouts.pipeblockl.size"), getConfig().getInt("craftabouts.pipeblockl.size"), getConfig().getInt("craftabouts.pipeblockl.size"));
		pipeBlockDTexture = new Texture(this, getConfig().getString("craftabouts.pipeblockd.texture"), getConfig().getInt("craftabouts.pipeblockd.size"), getConfig().getInt("craftabouts.pipeblockd.size"), getConfig().getInt("craftabouts.pipeblockd.size"));
		pureDarknessTexture = new Texture(this, getConfig().getString("craftabouts.puredarkness.texture"), getConfig().getInt("craftabouts.puredarkness.size"), getConfig().getInt("craftabouts.puredarkness.size"), getConfig().getInt("craftabouts.puredarkness.size"));
		hotIronTexture = new Texture(this, getConfig().getString("craftabouts.hotiron.texture"), getConfig().getInt("craftabouts.hotiron.size"), getConfig().getInt("craftabouts.hotiron.size"), getConfig().getInt("craftabouts.hotiron.size"));

		warpZoneFloorTexture = new Texture(this, getConfig().getString("craftabouts.warpzonefloor.texture"), getConfig().getInt("craftabouts.warpzonefloor.size"), getConfig().getInt("craftabouts.warpzonefloor.size"), getConfig().getInt("craftabouts.warpzonefloor.size"));
		warpZoneTileTexture = new Texture(this, getConfig().getString("craftabouts.warpzonetile.texture"), getConfig().getInt("craftabouts.warpzonetile.size"), getConfig().getInt("craftabouts.warpzonetile.size"), getConfig().getInt("craftabouts.warpzonetile.size"));
		warpZoneBrickTexture = new Texture(this, getConfig().getString("craftabouts.warpzonebrick.texture"), getConfig().getInt("craftabouts.warpzonebrick.size"), getConfig().getInt("craftabouts.warpzonebrick.size"), getConfig().getInt("craftabouts.warpzonebrick.size"));
		warpZoneQuestionBlockTexture = new Texture(this, getConfig().getString("craftabouts.warpzonequestion.texture"), getConfig().getInt("craftabouts.warpzonequestion.size")*2, getConfig().getInt("craftabouts.warpzonequestion.size"), getConfig().getInt("craftabouts.warpzonequestion.size"));
		
		hubPortalA = new HubPortalBlockTypeA(this,hubPortalTexture);
		hubPortalB = new HubPortalBlockTypeB(this,hubPortalTexture);
		pipeBlockL = new PipeBlockL(this,pipeBlockLTexture);
		pipeBlockD = new PipeBlockD(this,pipeBlockDTexture);
		pureDarkness = new PureDarknessBlock(this,pureDarknessTexture);
		hotIron = new HotIron(this,hotIronTexture);
		warpZoneFloor = new WarpZoneFloor(this,warpZoneFloorTexture);
		warpZoneTile = new WarpZoneTile(this,warpZoneTileTexture);
		warpZoneBrick = new WarpZoneBrick(this,warpZoneBrickTexture);
		warpZoneQuestionBlock = new WarpZoneQuestionBlock(this,warpZoneQuestionBlockTexture);

		pipeBlockL.setLightLevel(6);
		pipeBlockD.setLightLevel(4);
		
		hotIron.setLightLevel(8);
		hotIron.setHardness(15);
		
		warpZoneQuestionBlock.setLightLevel(15);

        SpoutShapelessRecipe recipe = new SpoutShapelessRecipe(new SpoutItemStack(pipeBlockD, 3));
        recipe.addIngredient(1, MaterialData.ironBlock);
        recipe.addIngredient(1, MaterialData.enderPearl);
        recipe.addIngredient(1, MaterialData.cactusGreen);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        recipe = new SpoutShapelessRecipe(new SpoutItemStack(pipeBlockL, 3));
        recipe.addIngredient(1, MaterialData.ironBlock);
        recipe.addIngredient(1, MaterialData.enderPearl);
        recipe.addIngredient(1, MaterialData.limeDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        recipe = new SpoutShapelessRecipe(new SpoutItemStack(pipeBlockD, 1));
        recipe.addIngredient(1, MaterialData.inkSac);
        recipe.addIngredient(1, pipeBlockL);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

        recipe = new SpoutShapelessRecipe(new SpoutItemStack(pipeBlockL, 1));
        recipe.addIngredient(1, MaterialData.boneMeal);
        recipe.addIngredient(1, pipeBlockD);
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
