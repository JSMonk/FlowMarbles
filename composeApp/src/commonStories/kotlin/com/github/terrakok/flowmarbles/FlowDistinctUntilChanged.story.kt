package com.github.terrakok.flowmarbles

import com.github.terrakok.flowmarbles.theme.AppTheme
import org.jetbrains.compose.storytale.story

val DistinctUntilChanged by story {
    AppTheme { FlowDistinctUntilChangedBy() }
}