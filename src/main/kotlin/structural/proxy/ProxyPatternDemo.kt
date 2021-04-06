package structural.proxy

import structural.proxy.thirdpartyyoutube.ThirdPartyYouTubeClass

fun demoProxyPattern() {
    println("Demo Proxy pattern\n")

    val naiveDownloader = YouTubeDownloader(ThirdPartyYouTubeClass())
    val smartDownloader = YouTubeDownloader(YouTubeCacheProxy())

    println("User uses client without cache: ")
    val naive: Long = test(naiveDownloader)

    println("Users uses client with cache: ")
    val smart: Long = test(smartDownloader)

    print("Time saved by caching proxy: " + (naive - smart) + "ms")

    println("-----END-----")
}

private fun test(downloader: YouTubeDownloader): Long {
    val startTime = System.currentTimeMillis()

    // User behavior in our app:
    downloader.renderPopularVideos()
    downloader.renderVideoPage("catzzzzzzzzz")
    downloader.renderPopularVideos()
    downloader.renderVideoPage("dancesvideoo")
    // Users might visit the same page quite often.
    downloader.renderVideoPage("catzzzzzzzzz")
    downloader.renderVideoPage("someothervid")
    val estimatedTime = System.currentTimeMillis() - startTime
    println("Time elapsed: ${estimatedTime}ms\n")
    return estimatedTime
}
