package com.brecht.fac.world;

import com.brecht.fac.FantasyAndNature;
import com.brecht.fac.world.gen.ModFlowerGeneration;
import com.brecht.fac.world.gen.ModOreGeneration;
import com.brecht.fac.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FantasyAndNature.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        ModFlowerGeneration.generateFlowers(event);
        ModTreeGeneration.generateTrees(event);
    }
}