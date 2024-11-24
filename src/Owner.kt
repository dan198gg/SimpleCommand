class Owner(
    private val  lock: Command,
    private val  stop: Command,
    private val  start: Command,
    private val  unlock : Command,
) {
    fun lockCar(){
        lock.execute()
    }
    fun unlockCar(){
        unlock.execute()
    }
    fun stopEngine(){
        stop.execute()
    }
    fun startEngine(){
        start.execute()
    }
}