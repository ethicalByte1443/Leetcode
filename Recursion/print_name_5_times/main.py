count = 0
def print_name(name, count):
    if count == 5:
        return 
    print(name)
    count+=1
    
if __name__ == "__main__":
    name = input("Enter your name: ")
    print_name(name, 0)