from equations import Equations  # Import the Equations class from the equations module
from wfile import WFile  # Import the WFile class from the wfile module

def main():
    # Ask the user for the file name to save the result
    file_name = input("Enter the name of the file to save the result: ")

    try:
        # Ask the user for the value of X (angle in degrees)
        x = float(input("Enter X: "))

        # Create an object of the Equations class
        equations = Equations()

        # Calculate the result of the equation for the entered angle
        result = equations.calculate(x)

        # Create an object of the WFile class with the file name
        wfile = WFile(file_name)

        # Write the result to a text file
        wfile.writeResTxt(str(result))

        # Write the result to a binary file
        wfile.writeResBin(str(result))

        # Read the result from the binary file
        read_result = wfile.readResBin()

        # Read the result from the text file
        read_result1 = wfile.readResTxt()

        # Print the results to the screen
        print("Result from binary file:", read_result)
        print("Result from text file:", read_result1)

    except ValueError:
        # Handle the error if the user's input for X is not a number
        print("Error: The entered X must be a number")

    except IOError:
        # Handle the error if there is an issue with reading or writing to the file
        print("Error: Unable to read/write from/to the file")

if __name__ == "__main__":
    # Call the main function if this file is executed as the main script
    main()
