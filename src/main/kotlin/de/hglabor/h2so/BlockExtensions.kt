@file:Suppress("unused")

package de.hglabor.h2so

import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Vec3d

/**
 * Converts a [Vec3d] to a [BlockPos]. Rounds down the x, y and z values of the [Vec3d].
 */
fun Vec3d.toBlockPos() = BlockPos(x.toInt(), y.toInt(), z.toInt())

/**
 * Converts the block position to a [Vec3d].
 *
 * @return A [Vec3d] object containing the coordinates of the position.
 */
fun BlockPos.toVec3d() = Vec3d(x.toDouble(), y.toDouble(), z.toDouble())


