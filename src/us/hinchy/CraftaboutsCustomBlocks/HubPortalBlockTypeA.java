package us.hinchy.CraftaboutsCustomBlocks;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCustomBlock;

public class HubPortalBlockTypeA extends GenericCustomBlock {
    public HubPortalBlockTypeA(Plugin plugin) {
        super(plugin, "Hubworld Portal (East-West)", 83, new GenericCuboidBlockDesign(plugin, "http://hinchy.us/hubportal.png", 16, (float) 0.3, 0, 0, (float) 0.7, 1, 1).setRenderPass(1));
    }
    public HubPortalBlockTypeA(Plugin plugin, Texture texture) {
        super(plugin, "Hubworld Portal (East-West)", 83, new GenericCuboidBlockDesign(plugin, texture, 0, (float) 0.3, 0, 0, (float) 0.7, 1, 1).setRenderPass(1));
    }
}