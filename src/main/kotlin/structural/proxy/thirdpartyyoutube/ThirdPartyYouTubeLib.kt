package structural.proxy.thirdpartyyoutube

import java.util.HashMap

/**
 * Interface of a remote service (API). Can be created manually if service doesn't have one
 * based on the class that's used in the service.
 */
interface ThirdPartyYouTubeLib {
    fun popularVideos(): HashMap<String?, Video?>?
    fun getVideo(videoId: String?): Video?
}
