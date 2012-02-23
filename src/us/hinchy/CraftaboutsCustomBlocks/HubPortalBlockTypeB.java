package us.hinchy.CraftaboutsCustomBlocks;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCustomBlock;

public class HubPortalBlockTypeB extends GenericCustomBlock {
    public HubPortalBlockTypeB(Plugin plugin) {
        super(plugin, "Hubworld Portal (North-South)", 83, new GenericCuboidBlockDesign(plugin, "http://hinchy.us/hubportal.png", 16, 0, 0, (float) 0.3, 1, 1, (float) 0.7).setRenderPass(1));
    }
    public HubPortalBlockTypeB(Plugin plugin, Texture texture) {
        super(plugin, "Hubworld Portal (North-South)", 83, new GenericCuboidBlockDesign(plugin, texture, 0, 0, 0, (float) 0.3, 1, 1, (float) 0.7).setRenderPass(1));
    }
}