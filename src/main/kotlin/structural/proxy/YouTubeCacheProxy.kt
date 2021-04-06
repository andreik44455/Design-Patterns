package structural.proxy

import java.util.HashMap
import structural.proxy.thirdpartyyoutube.ThirdPartyYouTubeClass
import structural.proxy.thirdpartyyoutube.ThirdPartyYouTubeLib
import structural.proxy.thirdpartyyoutube.Video

/**
 * To save some bandwidth, we can cache request results and keep
 * them for some time. But it may be impossible to put such code
 * directly into the service class. For example, it could have
 * been provided as part of a third party library and/or defined
 * as `final`. That's why we put the caching code into a new
 * proxy class which implements the same interface as the
 * service class. It delegates to the service object only when
 * the real requests have to be sent.
 */
class YouTubeCacheProxy : ThirdPartyYouTubeLib {
    private val youtubeService: ThirdPartyYouTubeLib = ThirdPartyYouTubeClass()
    private var cachePopular: HashMap<String?, Video?>? = HashMap()
    private val cacheAll = HashMap<String?, Video?>()

    override fun popularVideos(): HashMap<String?, Video?>? {
        if (cachePopular!!.isEmpty()) {
            cachePopular = youtubeService.popularVideos()
        } else {
            println("Retrieved list from cache.")
        }
        return cachePopular
    }

    override fun getVideo(videoId: String?): Video? {
        var video = cacheAll[videoId]
        if (video == null) {
            video = youtubeService.getVideo(videoId)
            cacheAll[videoId] = video
        } else {
            println("Retrieved video '$videoId' from cache.")
        }
        return video
    }

    fun reset() {
        cachePopular!!.clear()
        cacheAll.clear()
    }
}
