package actiwerks.kmmkspexample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform