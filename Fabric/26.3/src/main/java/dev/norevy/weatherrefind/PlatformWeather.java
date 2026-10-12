// SPDX-License-Identifier: MPL-2.0
// Copyright (c) 2025-2026 Norevy (Hxtomi).

package dev.norevy.weatherrefind;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.biome.Biome;
public final class PlatformWeather {
    private PlatformWeather() {}
    public static Biome.Precipitation precipitation(ClientLevel level, BlockPos pos) {
        return level.getBiome(pos).value().getPrecipitationAt(pos, level.getSeaLevel());
    }
}
