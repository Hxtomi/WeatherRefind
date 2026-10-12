// SPDX-License-Identifier: MPL-2.0
// Copyright (c) 2025-2026 Norevy (Hxtomi).

package dev.norevy.weatherrefind;
public enum WeatherMode {
    AUTO, CUSTOM, VANILLA;
    public WeatherMode next() { return values()[(ordinal() + 1) % values().length]; }
}
