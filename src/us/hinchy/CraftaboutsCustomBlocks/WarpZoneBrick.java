package us.hinchy.CraftaboutsCustomBlocks;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class WarpZoneBrick extends GenericCubeCustomBlock {
    public WarpZoneBrick(Plugin plugin, Texture texture) {
        super(plugin, "Warp Zone Brick Block", 45, new GenericCubeBlockDesign(plugin, texture, 0));
    }
}