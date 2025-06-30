def print_1_to_N(start, end):
    if start == end + 1:                # base case
        return 
    print(start)
    start += 1
    print_1_to_N(start, end)



if __name__ == "__main__":
    n = int(input("Enter a number: "))

    print_1_to_N(1, n)
