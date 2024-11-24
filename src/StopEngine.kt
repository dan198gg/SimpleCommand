class StopEngine(var car: MyCar): Command {
    override fun execute() {
        car.stopEngine()
    }
}