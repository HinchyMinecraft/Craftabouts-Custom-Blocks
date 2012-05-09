package us.hinchy.CraftaboutsCustomBlocks;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class PipeBlockL extends GenericCubeCustomBlock {
    public PipeBlockL(Plugin plugin, Texture texture) {
        super(plugin, "Pipe Block (Light)", 35, 5, new GenericCubeBlockDesign(plugin, texture, 0));
    }
}