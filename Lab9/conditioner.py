class Conditioner:
    def __init__(self, brand, model, temperature, power_status):
        self._brand = brand
        self._model = model
        self._temperature = temperature
        self._power_status = power_status

    # Getter methods
    def get_brand(self):
        return self._brand

    def get_model(self):
        return self._model

    def get_temperature(self):
        return self._temperature

    def get_power_status(self):
        return self._power_status

    # Setter methods
    def set_brand(self, brand):
        self._brand = brand

    def set_model(self, model):
        self._model = model

    def set_temperature(self, temperature):
        self._temperature = temperature

    def set_power_status(self, power_status):
        self._power_status = power_status
    def get_info(self):
        print(f"Brand {self._brand}")
        print(f"Model {self._model}")
        print(f"Temperature {self._temperature}")
        print(f"Power status {self._power_status}")