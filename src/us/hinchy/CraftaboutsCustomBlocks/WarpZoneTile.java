package us.hinchy.CraftaboutsCustomBlocks;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class WarpZoneTile extends GenericCubeCustomBlock {
    public WarpZoneTile(Plugin plugin, Texture texture) {
        super(plugin, "Warp Zone Tile", 42, new GenericCubeBlockDesign(plugin, texture, 0));
    }
}