package us.hinchy.CraftaboutsCustomBlocks;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class PureDarknessBlock extends GenericCubeCustomBlock {
    public PureDarknessBlock(Plugin plugin, Texture texture) {
        super(plugin, "Pure Darkness", 35, 15, new GenericCubeBlockDesign(plugin, texture, 0));
    }
}