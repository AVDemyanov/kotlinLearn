package GameWar

sealed class FyreType {
    object Single : FyreType()
    data class Burst(
        val sizeOfBurst: Int
    ) : FyreType()
}