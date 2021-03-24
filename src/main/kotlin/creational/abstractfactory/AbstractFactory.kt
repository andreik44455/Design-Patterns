package creational.abstractfactory

interface AbstractFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}
