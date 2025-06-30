def print_N_to_0(start, end):
    if start == end - 1:
        return
    
    print(start)
    start -= 1
    print_N_to_0(start, end)

if __name__ == "__main__":
    n = int(input("Enter a number: "))

    print_N_to_0(n, 0)