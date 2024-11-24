class LockCar(var car: MyCar): Command {
    override fun execute() {
        car.lock()
    }
}