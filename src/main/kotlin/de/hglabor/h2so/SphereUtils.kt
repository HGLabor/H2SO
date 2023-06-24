package de.hglabor.h2so

import net.minecraft.util.math.BlockPos

object SphereUtils {
    /**
     * Generates a sphere of block positions around a center block.
     *
     * @param centerBlock The center block position of the sphere.
     * @param radius The radius of the sphere.
     * @param hollow Determines if the sphere should be hollow or solid. Default is false (solid).
     * @return A list of block positions representing the generated sphere.
     */
    fun generateSphere(centerBlock: BlockPos, radius: Int, hollow: Boolean = false): List<BlockPos> {
        val circleBlocks: MutableList<BlockPos> = ArrayList()
        val bx: Int = centerBlock.x
        val by: Int = centerBlock.y
        val bz: Int = centerBlock.z
        for (x in bx - radius..bx + radius) {
            for (y in by - radius..by + radius) {
                for (z in bz - radius..bz + radius) {
                    val distance = ((bx - x) * (bx - x) + (bz - z) * (bz - z) + (by - y) * (by - y)).toDouble()
                    if (distance < radius * radius && !(hollow && distance < (radius - 1) * (radius - 1))) {
                        circleBlocks.add(BlockPos(x, y, z))
                    }
                }
            }
        }
        return circleBlocks
    }
}
