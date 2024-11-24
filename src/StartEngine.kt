class StartEngine(var car:MyCar): Command {
    override fun execute() {
        car.startEngine()
    }
}