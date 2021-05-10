package cc.mightyapp.mighty.models

data class Program(
    val name: String,
    val routines: List<Routine>,
    val isFeatured: Boolean
)
