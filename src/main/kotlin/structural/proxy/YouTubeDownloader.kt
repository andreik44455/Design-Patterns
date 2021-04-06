package structural.proxy

import structural.proxy.thirdpartyyoutube.ThirdPartyYouTubeLib

/**
 * which used to work directly with a service
 * object, stays unchanged as long as it works with the service
 * object through an interface. We can safely pass a proxy
 * object instead of a real service object since they both
 * implement the same interface.
 */
class YouTubeDownloader(private val api: ThirdPartyYouTubeLib) {
    fun renderVideoPage(videoId: String?) {
        val video = api.getVideo(videoId)
        println("\n-------------------------------")
        println("Video page (imagine fancy HTML)")
        println("ID: " + video!!.id)
        println("Title: " + video.title)
        println("Video: " + video.data)
        println("-------------------------------\n")
    }

    fun renderPopularVideos() {
        val list = api.popularVideos()
        println("\n-------------------------------")
        println("Most popular videos on YouTube (imagine fancy HTML)")
        for (video in list!!.values) {
            println("ID: " + video!!.id + " / Title: " + video.title)
        }
        println("-------------------------------\n")
    }
}
