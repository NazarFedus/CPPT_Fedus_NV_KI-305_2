from conditioner import Conditioner
class Climate_Controle(Conditioner):
    def __init__(self, brand, model, temperature, power_status, wifi_enabled, air_quality_sensor, energy_saving_mode):
        # Call the constructor of the parent class
        super().__init__(brand, model, temperature, power_status)
        self._wifi_enabled = wifi_enabled
        self._air_quality_sensor = air_quality_sensor
        self._energy_saving_mode = energy_saving_mode

    # Getter methods for additional parameters
    def get_wifi_enabled(self):
        return self._wifi_enabled

    def get_air_quality_sensor(self):
        return self._air_quality_sensor

    def get_energy_saving_mode(self):
        return self._energy_saving_mode

    # Setter methods for additional parameters
    def set_wifi_enabled(self, wifi_enabled):
        self._wifi_enabled = wifi_enabled

    def set_air_quality_sensor(self, air_quality_sensor):
        self._air_quality_sensor = air_quality_sensor

    def set_energy_saving_mode(self, energy_saving_mode):
        self._energy_saving_mode = energy_saving_mode

    # Override the get_info method to include additional information
    def get_info(self):
        # Call the get_info method of the parent class
        super().get_info()
        # Include additional information
        print("Wi-Fi Enabled:", self._wifi_enabled)
        print("Air Quality Sensor:", self._air_quality_sensor)
        print("Energy Saving Mode:", self._energy_saving_mode)