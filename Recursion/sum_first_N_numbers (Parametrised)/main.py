# def print_sum(n, sum):
#     if n == 0:
#         print(f"The sum of the first {n} numbers is {sum}")
#         return 
#     sum += n % 10
#     n = n // 10
#     print_sum(n, sum)


# if __name__ == "__main__":
#     n = int(input("Enter a number: "))
#     sum = 0
#     print_sum(n, sum)


def print_sum(n, sum, depth):
    if n == 0:
        print(f"The sum of the first {n} numbers is {sum}")
        return 
    sum += n
    n = n - 1
    depth = depth + 1
    print_sum(n, sum, depth)
    print(f"Depth: {depth} cleared")

if __name__ == "__main__":
    n = int(input("Enter a number: "))
    depth = 0
    sum = 0
    print_sum(n, sum, depth)