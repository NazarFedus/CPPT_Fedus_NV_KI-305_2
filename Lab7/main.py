import sys

nRows = int(input("Enter the size of the square matrix: "))
arr = [[' ' for _ in range(nRows)] for _ in range(nRows)]
filler = input("Enter a symbol: ")

with open("result.txt", "w") as fout:
    temp = 0
    for i in range(nRows // 2):
        for j in range(nRows - temp):
            if len(filler) == 1:
                if j >= temp:
                    arr[i][j] = filler
                    print(arr[i][j].ljust(2), end=" ")
                    fout.write(arr[i][j] + " ")
                else:
                    arr[i][j] = filler
                    print("  ", end=" ")
                    fout.write("  ")
            elif len(filler) == 0:
                print("\nNo symbol entered")
                sys.exit()
            else:
                print("\nToo many symbols")
                sys.exit()
        print()
        fout.write("\n")
        temp += 1

    temp = nRows // 2
    for i in range(temp, nRows):
        for j in range(nRows - temp):
            if len(filler) == 1:
                if j >= temp:
                    arr[i][j] = filler
                    print(arr[i][j].ljust(2), end=" ")
                    fout.write(arr[i][j] + " ")
                else:
                    arr[i][j] = filler
                    print("  ", end=" ")
                    fout.write("  ")
            elif len(filler) == 0:
                print("\nNo symbol entered")
                sys.exit()
            else:
                print("\nToo many symbols")
                sys.exit()
        print()
        fout.write("\n")
        temp -= 1

    fout.flush()
