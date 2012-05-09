package us.hinchy.CraftaboutsCustomBlocks;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class WarpZoneFloor extends GenericCubeCustomBlock {
    public WarpZoneFloor(Plugin plugin, Texture texture) {
        super(plugin, "Warp Zone Floor", 98, 2, new GenericCubeBlockDesign(plugin, texture, 0));
    }
}