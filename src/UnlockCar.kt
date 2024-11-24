class UnlockCar(var car: MyCar): Command {
    override fun execute() {
        car.unlock()
    }
}