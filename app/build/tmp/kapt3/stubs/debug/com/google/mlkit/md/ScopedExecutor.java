package com.google.mlkit.md;

import java.lang.System;

/**
 * Wraps an existing executor to provide a [.shutdown] method that allows subsequent
 * cancellation of submitted runnables.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0006\u0010\u0004\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/mlkit/md/ScopedExecutor;", "Ljava/util/concurrent/Executor;", "executor", "(Ljava/util/concurrent/Executor;)V", "shutdown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "execute", "", "command", "Ljava/lang/Runnable;", "app_debug"})
public final class ScopedExecutor implements java.util.concurrent.Executor {
    private final java.util.concurrent.atomic.AtomicBoolean shutdown = null;
    private final java.util.concurrent.Executor executor = null;
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable command) {
    }
    
    /**
     * After this method is called, no runnables that have been submitted or are subsequently
     * submitted will start to execute, turning this executor into a no-op.
     *
     *
     * Runnables that have already started to execute will continue.
     */
    public final void shutdown() {
    }
    
    public ScopedExecutor(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor executor) {
        super();
    }
}