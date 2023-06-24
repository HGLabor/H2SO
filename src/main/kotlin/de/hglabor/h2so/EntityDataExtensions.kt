package de.hglabor.h2so

import net.minecraft.entity.Entity
import net.minecraft.entity.data.DataTracker
import net.minecraft.entity.data.TrackedData
import net.minecraft.entity.data.TrackedDataHandler

/**
 * Registers a tracked data handler for a specific entity class.
 *
 * @param clazz The class of the entity.
 * @param <T>   The type of the tracked data.
 * @return The registered TrackedData instance.
 */
fun <T> TrackedDataHandler<T>.register(clazz: Class<out Entity>): TrackedData<T> {
    return DataTracker.registerData(clazz, this)
}
