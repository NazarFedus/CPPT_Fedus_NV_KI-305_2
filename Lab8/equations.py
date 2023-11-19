import math

class Equations:
    def calculate(self, x):
        # Convert degrees to radians
        rad = x * math.pi / 180.0

        try:
            # Calculate y = 1/sin(x)
            y = 1 / math.sin(rad)

            # Check for special cases where sin(x) becomes zero
            if rad == math.pi or rad == (math.pi * 2):
                raise Exception("Division by zero due to sin(x) becoming zero")
        except Exception as e:
            # Handle exception when sin(x) is zero
            print("Exception: ", str(e))

            # Return 0 in case of an exception
            return 0

        # Return the calculated value of y
        return y

if __name__ == "__main__":
    # Example usage of the Equations class
    equations = Equations()

    # User input for the angle in degrees
    user_input = input("Enter the angle in degrees: ")

    try:
        # Convert user input to a float
        angle = float(user_input)

        # Calculate the result using the Equations class
        result = equations.calculate(angle)

        # Print the result
        print(f"The result of the equation 1/sin({angle}) is: {result}")
    except ValueError:
        # Handle the case where the user input is not a valid number
        print("Error: The entered angle must be a number.")
