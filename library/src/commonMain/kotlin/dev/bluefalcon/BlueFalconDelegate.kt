package dev.bluefalcon

interface BlueFalconDelegate {

    fun didDiscoverDevice(bluetoothPeripheral: BluetoothPeripheral)
    fun didConnect(bluetoothPeripheral: BluetoothPeripheral)
    fun didDisconnect(bluetoothPeripheral: BluetoothPeripheral)
    fun didDiscoverServices(bluetoothPeripheral: BluetoothPeripheral)
    fun didDiscoverCharacteristics(bluetoothPeripheral: BluetoothPeripheral)
    fun didCharacteristcValueChanged(
        bluetoothPeripheral: BluetoothPeripheral,
        bluetoothCharacteristic: BluetoothCharacteristic
    )
    fun didUpdateMTU(bluetoothPeripheral: BluetoothPeripheral)
}