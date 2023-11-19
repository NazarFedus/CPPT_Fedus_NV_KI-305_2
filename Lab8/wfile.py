import struct

class WFile:
    def __init__(self, name):
        self.name = name

    def writeResTxt(self, value):
        try:
            with open(f"{self.name}.txt", "w") as file:
                file.write(f"{value}\n")
        except Exception as e:
            print("Exception while writing in file", str(e))

    def readResTxt(self):
        try:
            with open(f"{self.name}.txt", "r") as file:
                result = float(file.readline())
                return result
        except FileNotFoundError:
            print(f"Not found file {self.name}.txt")
        except Exception as e:
            print("Exception while reading file", str(e))
        return None

    def writeResBin(self, value):
        try:
            with open(f"{self.name}.bin", "wb") as file:
                # Pack the float value as binary data
                packed_value = struct.pack('d', float(value))
                file.write(packed_value)
        except Exception as e:
            print("Exception while writing in bin file", str(e))

    def readResBin(self):
        try:
            with open(f"{self.name}.bin", "rb") as file:
                # Unpack the binary data to a float value
                packed_value = file.read(8)
                result = struct.unpack('d', packed_value)[0]
                return result
        except FileNotFoundError:
            print(f"Not found file {self.name}.bin")
        except Exception as e:
            print("Exception while reading file", str(e))
        return None
