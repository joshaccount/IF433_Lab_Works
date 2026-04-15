package oop_105516_JoshReaganWiselim.week08

// name adalah Non-Null (wajib), email dan phonea adalah Nullable (opsional)
class UserProfile(
    val name: String,
    val email: String?,
    val phone: String? = null // Default argument null
)