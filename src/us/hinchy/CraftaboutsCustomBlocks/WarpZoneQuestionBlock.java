package us.hinchy.CraftaboutsCustomBlocks;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class WarpZoneQuestionBlock extends GenericCubeCustomBlock {
    public WarpZoneQuestionBlock(Plugin plugin, Texture texture) {
        super(plugin, "Warp Zone \"?\" Block", 89, new GenericCubeBlockDesign(plugin, texture, new int[]{1,0,0,0,0,1}));
    }
}