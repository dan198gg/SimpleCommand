//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val myCar = MyCar()

    val owner = Owner(
        LockCar(myCar),
        StopEngine(myCar),
        StartEngine(myCar),
        UnlockCar(myCar)
    )

    owner.unlockCar()
    owner.startEngine()
    owner.stopEngine()
    owner.lockCar()
}