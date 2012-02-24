package us.hinchy.CraftaboutsCustomBlocks;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class HotIron extends GenericCubeCustomBlock {
    public HotIron(Plugin plugin, Texture texture) {
        super(plugin, "Heated Iron", 81, new GenericCubeBlockDesign(plugin, texture, 0));
    }
}