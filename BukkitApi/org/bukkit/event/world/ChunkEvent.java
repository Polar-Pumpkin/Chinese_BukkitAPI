package org.bukkit.event.world;

import org.bukkit.Chunk;
import org.jetbrains.annotations.NotNull;

/**
 * 代表与区块有关系的事件.
 */
public abstract class ChunkEvent extends WorldEvent {
    protected Chunk chunk;

    protected ChunkEvent(@NotNull final Chunk chunk) {
        super(chunk.getWorld());
        this.chunk = chunk;
    }

    /**
     * 获取准备加载/卸载的区块.
     * <p>
     * 原文:
     * Gets the chunk being loaded/unloaded
     *
     * @return 引发此事件的区块
     */
    @NotNull
    public Chunk getChunk() {
        return chunk;
    }
}
