package creational.abstractfactory

import creational.abstractfactory.factory.AndroidFactory
import creational.abstractfactory.factory.IosFactory

class FactoryProvider {
    companion object {
        fun getFactory(osType: String): AbstractFactory = when (osType.toLowerCase()) {
            "android" -> AndroidFactory()
            "ios" -> IosFactory()
            else -> throw Exception("$osType OS is not supported.")
        }

        inline fun <reified T : AbstractFactory> getFactoryByType(): AbstractFactory =
            when (T::class) {
                AndroidFactory::class -> AndroidFactory()
                IosFactory::class -> IosFactory()
                else -> throw Exception("${T::class} OS is not supported.")
            }
    }
}
