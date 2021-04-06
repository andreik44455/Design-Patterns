package structural.proxy.thirdpartyyoutube

import java.util.HashMap

/**
 * The concrete implementation of a service connector. Methods
 * of this class can request information from YouTube. The speed
 * of the request depends on a user's internet connection as
 * well as YouTube's. The application will slow down if a lot of
 * requests are fired at the same time, even if they all request
 * the same information.
 */
class ThirdPartyYouTubeClass : ThirdPartyYouTubeLib {
    override fun popularVideos(): HashMap<String?, Video?>? {
        connectToServer("http://www.youtube.com")
        return randomVideos
    }

    override fun getVideo(videoId: String?): Video? {
        connectToServer("http://www.youtube.com/$videoId")
        return getSomeVideo(videoId)
    }

    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.
    private fun random(min: Int, max: Int): Int {
        return min + (Math.random() * (max - min + 1)).toInt()
    }

    private fun experienceNetworkLatency() {
        val randomLatency = random(5, 10)
        for (i in 0 until randomLatency) {
            try {
                Thread.sleep(100)
            } catch (ex: InterruptedException) {
                ex.printStackTrace()
            }
        }
    }

    private fun connectToServer(server: String) {
        print("Connecting to $server... ")
        experienceNetworkLatency()
        println("Connected!")
    }

    private val randomVideos: HashMap<String?, Video?>
        get() {
            print("Downloading populars... ")
            experienceNetworkLatency()
            val hmap = HashMap<String?, Video?>()
            hmap["catzzzzzzzzz"] = Video("sadgahasgdas", "Catzzzz.avi")
            hmap["mkafksangasj"] = Video("mkafksangasj", "Dog play with ball.mp4")
            hmap["dancesvideoo"] = Video("asdfas3ffasd", "Dancing video.mpq")
            hmap["dlsdk5jfslaf"] = Video("dlsdk5jfslaf", "Barcelona vs RealM.mov")
            hmap["3sdfgsd1j333"] = Video("3sdfgsd1j333", "Programing lesson#1.avi")
            println("Done!")
            return hmap
        }

    private fun getSomeVideo(videoId: String?): Video {
        print("Downloading video... ")
        experienceNetworkLatency()
        val video = Video(videoId!!, "Some video title")
        println("Done!")
        return video
    }
}
