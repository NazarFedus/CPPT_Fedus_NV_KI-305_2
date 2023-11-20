from climate_control import Climate_Controle, Conditioner
if __name__ == '__main__':
   conditioner=Conditioner(
       "Aerol",
       "55TSg7",
       16,
       True
   )
   conditioner.get_info()
   print("--------------------------------------------------")
   conditioner.set_power_status(False)
   conditioner.set_model("4444")
   conditioner.get_info()
   print("--------------------------------------------------")

   climate_control=Climate_Controle(
       "Gusing",
       "44Gty4",
       20,
       True,
       True,
       1000,
       True
   )
   climate_control.get_info()
   print("--------------------------------------------------")

   climate_control.set_temperature(30)
   climate_control.set_wifi_enabled(False)
   climate_control.set_brand("Sumsung")
   climate_control.get_info()
   print("--------------------------------------------------")