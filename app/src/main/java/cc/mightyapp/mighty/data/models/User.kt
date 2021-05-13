package cc.mightyapp.mighty.data.models


data class User(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val isLoggedIn: Boolean,
    val workouts: List<Any>,
    val xp: Int,
    val poundsLiftedTotal: Int,
    val level: String,
    val achievements: List<Any>,
    val usersFollowing: List<Any>,
    val usersFollowedBy: List<Any>,
    val routinesFavorited: List<Any>,
    val routinesAuthored: List<Any>,
    val programsFollowing: List<Any>,
    val programsAuthored: List<Any>
)
